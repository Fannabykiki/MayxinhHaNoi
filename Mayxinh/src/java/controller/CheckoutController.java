/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.OrderDAO;
import dal.OrderDetailDAO;
import dal.ShippingDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Order;
import model.Ship;

@WebServlet(name = "CheckoutController", urlPatterns = {"/checkout"})
public class CheckoutController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            Map<Integer, Cart> carts = (Map<Integer, Cart>) session.getAttribute("carts");
            if (carts == null) {
                carts = new LinkedHashMap<>();
            }

            //tinh tong tien
            double totalMoney = 0;
            for (Map.Entry<Integer, Cart> entry : carts.entrySet()) {
                Integer productId = entry.getKey();
                Cart cart = entry.getValue();

                totalMoney += cart.getQuantity() * cart.getProduct().getPrice();

            }
            request.setAttribute("totalMoney", totalMoney);
            request.getRequestDispatcher("/view/checkout.jsp").forward(request, response);
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String note = request.getParameter("note");

        //lưu vào database
        //Lưu Shipping
        Ship shipping = Ship.builder()
                .name(name)
                .phone(phone)
                .address(address)
                .build();
        int shippingId = new ShippingDAO().createReturnId(shipping); //trả về id tự tăng của bản ghi vừa lưu vào database
        //Lưu Order
        HttpSession session = request.getSession();
        Map<Integer, Cart> carts = (Map<Integer, Cart>) session.getAttribute("carts");
        if (carts == null) {
            carts = new LinkedHashMap<>();
        }

        //tinh tong tien
        double totalPrice = 0;
        for (Map.Entry<Integer, Cart> entry : carts.entrySet()) {
            Integer productId = entry.getKey();
            Cart cart = entry.getValue();

            totalPrice += cart.getQuantity() * cart.getProduct().getPrice();

        }

        Order order = Order.builder()
                .accountid(1)
                .totalPrice(totalPrice)
                .note(note)
                .shippingId(shippingId)
                .build();
        int orderId = new OrderDAO().createReturnId(order);
        //Lưu OrderDetail

        new OrderDetailDAO().saveCart(orderId, carts);

        session.removeAttribute("carts");
        request.getRequestDispatcher("/view/thanks.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
