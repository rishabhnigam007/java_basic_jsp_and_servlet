/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icfnext.jdbc.web_student_tracker;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author 55683
 */
public class TestServlet extends HttpServlet {

    @Resource(name = "jdbc/web_student_tracker")
    private DataSource dataSource;

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TestServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TestServlet at " + request.getContextPath() + "</h1>");
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
        // step 1: set up the printwriter

        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");
        out.println("Successfully run");
        try {
            try (Connection myConn = dataSource.getConnection()) {
                if(myConn!=null)
                {
                    out.println("Connection successfully establised");
                }
                else
                {
                    out.println("connection failed");
                }
                
                String sql = "select * from student";
                
                try (Statement myStmt = myConn.createStatement()) {
                    if(myStmt!=null)
                    {
                        out.println("statement successfully executed");
                    }
                    else
                    {
                        out.println("statement failed");
                    }
                    
                    try (ResultSet myRs = myStmt.executeQuery(sql)) {
                        if(myRs!=null)
                        {
                            out.println("Resultset successfully executed");
                        }
                        else
                        {
                            out.println("Resultset failed");
                        }
                        
                        while (myRs.next()) {
                            //out.println("while loop running");
                            String firstName = myRs.getString("first_name");
                            String lastName = myRs.getString("last_name");
                            String email = myRs.getString("email");
                            out.println(firstName +" - "+lastName+" - "+email);
                        }
                    }
                }
            }
            out.close();
        }
         catch (SQLException e) {
            e.printStackTrace();
        }
        
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
