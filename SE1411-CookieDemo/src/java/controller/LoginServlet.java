/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.AdminDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Admin;

/**
 *
 * @author TASS
 */
public class LoginServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
            response.sendRedirect("login.jsp");
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
        String username =request.getParameter("username");
        String pass =request.getParameter("pass");
        String remember =request.getParameter("remember");
        
        AdminDAO adb = new AdminDAO();
        Admin account = adb.getAccount(username, pass);
        if((account)==null){
            String mess = username + " or " + pass + " incorrect!";
            request.setAttribute("mess", mess);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }else{
            HttpSession session =request.getSession(true);
            session.setAttribute("account", account);
            
            Cookie cookieUsername = new Cookie("username", username);
            Cookie cookiePassword = new Cookie("pass", pass);
            Cookie cookieRemember = new Cookie("remember", remember);
            
            if(remember != null){
                cookieUsername.setMaxAge(60*60*24);
                cookiePassword.setMaxAge(60*60*24);
                cookieRemember.setMaxAge(60*60*24);
            }else{
                cookieUsername.setMaxAge(0);
                cookiePassword.setMaxAge(0);
                cookieRemember.setMaxAge(0);
            }
            response.addCookie(cookieUsername);
            response.addCookie(cookiePassword);
            response.addCookie(cookieRemember);
            
            response.sendRedirect("welcome.jsp");
        }
        
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
