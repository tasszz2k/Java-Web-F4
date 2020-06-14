/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TASS
 */
public class CalServerlet extends HttpServlet {

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
            out.println("<title>Servlet CalServerlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalServerlet at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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

        PrintWriter out = response.getWriter();

        String n1 = request.getParameter("n1");
        String n2 = request.getParameter("n2");
        String result = "";
        if (n1 != null) {
            Double number1 = Double.parseDouble(n1);
            Double number2 = Double.parseDouble(n2);
            char operator = request.getParameter("operator").charAt(0);

            switch (operator) {
                case '+':
                    result = number1 + "+" + number2 + "=" + (number1 + number2);
                    break;
                case '-':
                    result = number1 + "-" + number2 + "=" + (number1 - number2);
                    break;
                case '*':
                    result = number1 + "*" + number2 + "=" + (number1 * number2);
                    break;
                case '/':
                    if (number2 != 0) {
                        result = number1 + "/" + number2 + "=" + (number1 / number2);
                    } else {
                        result = "ERROR";
                    }
                    break;
            }
//            out.println(result);
        }

        request.setAttribute("result", result);
        request.getRequestDispatcher("Cal.jsp").forward(request, response);

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
