/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.EmployeeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Employee;

/**
 *
 * @author TASS
 */
public class SearchServlet extends HttpServlet {

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
            out.println("<title>Servlet SearchServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchServlet at " + request.getContextPath() + "</h1>");
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
        int id = -1, gender = -1;
        String name = "", department = "";
        Date DOBFrom = null, DOBTo = null;
        if (request.getParameter("id") != null && !request.getParameter("id").isEmpty()) {
            id = Integer.parseInt(request.getParameter("id"));
        }
        if (request.getParameter("name") != null && !request.getParameter("name").isEmpty()) {
            name = request.getParameter("name");
        }
        if (request.getParameter("gender") != null && !request.getParameter("gender").isEmpty()) {
            if (request.getParameter("gender").compareTo("male") == 0) {
                gender = 1;
            } else if (request.getParameter("gender").compareTo("female") == 0) {
                gender = 0;
            } else {
                gender = -1;
            }
        }
        if (request.getParameter("department") != null && !request.getParameter("department").isEmpty()) {
            if (request.getParameter("department").compareTo("is") == 0) {
                department = "IS";
            } else if (request.getParameter("department").compareTo("ia") == 0) {
                department = "IA";
            } else {
                department = "";
            }
        }
        if (request.getParameter("dob-from") != null && !request.getParameter("dob-from").isEmpty()) {
            String dobFrom = request.getParameter("dob-from");
            DOBFrom = Date.valueOf(request.getParameter("dob-from"));
        }
        if (request.getParameter("dob-to") != null && !request.getParameter("dob-to").isEmpty()) {
            String dobTo = request.getParameter("dob-to");
            DOBTo = Date.valueOf(request.getParameter("dob-to"));
        }

        EmployeeDAO edb = new EmployeeDAO();

        List<Employee> listEmployees = edb.getEmployees(id, name, gender, department, DOBFrom, DOBTo);
        request.setAttribute("listEmployees", listEmployees);
        request.getRequestDispatcher("view/search.jsp").forward(request, response);

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
