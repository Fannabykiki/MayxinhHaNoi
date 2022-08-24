/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filter;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author phanl
 */
@WebFilter(filterName = "AuthorizationFilter", urlPatterns = {"/admin/*"})
public class AuthorizationFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
         HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        //ktra dang nhap
        Account account = (Account) session.getAttribute("account");
        if (account != null && account.getRoleId() == Account.ADMIN) {
            chain.doFilter(request, response);
            return;
        }
//        req.setAttribute("error", "Bạn không có quyền truy cập");
       res.sendRedirect("http://localhost:8080/Mayxinh/signin");               
    }
    public void destroy() {
    }

    public void init(FilterConfig filterConfig) {

    }

}
