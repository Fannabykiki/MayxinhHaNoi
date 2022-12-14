/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filter;

import java.io.IOException;
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
 * @author fannaby
 */
@WebFilter(filterName = "Staff", urlPatterns = {"/staff/*",})
public class StaffFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
         HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        //ktra dang nhap
        Account account = (Account) session.getAttribute("account");
        if (account != null && account.getRoleId() == Account.ADMIN ||account.getRoleId() == Account.STAFF ) {
            chain.doFilter(request, response);
            return;
        }
//        req.setAttribute("error", "Bạn không có quyền truy cập");
       res.sendRedirect("/signin");               
    }
    public void destroy() {
    }
    public void init(FilterConfig filterConfig) {
        
    }

}
