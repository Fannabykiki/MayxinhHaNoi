/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CategoryDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Category;
import model.Product;

/**
 *
 * @author phanl
 */
@WebServlet(name = "ShopServlet", urlPatterns = {"/shop"})
public class ShopServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//    try{
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
//            final int PAGE_SIZE = 9;
//            List<Category> listCategories = new CategoryDAO().getAllCategories();
//            HttpSession session = request.getSession();
//            session.setAttribute("listCategories", listCategories);
//            int page = 1;
//            String pageStr = request.getParameter("page");
//            if (pageStr != null) {
//                page = Integer.parseInt(pageStr);
//            }
//            
//            ProductDAO productDAO = new ProductDAO();
//            List<Product> listProducts = productDAO.getProductsWithPagging(page, PAGE_SIZE);
//            int totalProducts = productDAO.getTotalProducts();
//            int totalPage = totalProducts / PAGE_SIZE;
//            if (totalProducts % PAGE_SIZE != 0) {
//                totalPage += 1;
//            }
//            request.setAttribute("page", page);
//            request.setAttribute("totalPage", totalPage);
//            request.setAttribute("listproduct", listProducts);
//            
//            request.getRequestDispatcher("/view/shopping.jsp").forward(request, response);
//        } catch (Exception ex) {
//            Logger.getLogger(ShopServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            final int PAGE_SIZE = 9;
            List<Category> listCategories = new CategoryDAO().getAll();
            HttpSession session = request.getSession();
            session.setAttribute("listCategories", listCategories);
            int page = 1;
            String pageStr = request.getParameter("page");
            if (pageStr != null) {
                page = Integer.parseInt(pageStr);
            }

            ProductDAO productDAO = new ProductDAO();
            List<Product> listProducts = productDAO.getProductsWithPagging(page, PAGE_SIZE);
            int totalProducts = productDAO.getTotalProducts();
            int totalPage = totalProducts / PAGE_SIZE;
            if (totalProducts % PAGE_SIZE != 0) {
                totalPage += 1;
            }
//            int page,numperpage=9;
//            int size=list1.size();
//            int num=(size%9==0?(size/9):((size/9)+1));
//            String xpage=request.getParameter("page");
//            if(xpage==null){
//                page=1;
//            } else{
//            page=Integer.parseInt(xpage);
//            }
//            int start,end;
//            start=(page-1)*numperpage;
//            end=Math.min(page*numperpage,size);
//            List<Product> list=pdb.getListByPage((ArrayList<Product>) list1, start, end);           
            request.setAttribute("listproduct", listProducts);
            request.setAttribute("page", page);
            request.setAttribute("num", totalPage);
            request.getSession().setAttribute("urlHistory","shop");
            request.getRequestDispatcher("/view/shop.jsp").forward(request, response);
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
//            ProductDAO pdb = new ProductDAO();
//            List<Product> list1 = pdb.getAll();
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
