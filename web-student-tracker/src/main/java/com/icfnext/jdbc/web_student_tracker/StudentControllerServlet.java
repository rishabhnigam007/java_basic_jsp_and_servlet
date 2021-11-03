/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icfnext.jdbc.web_student_tracker;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author 55683
 */
public class StudentControllerServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private StudentDataUtil studentDataUtil;
    
    @Resource(name = "jdbc/web_student_tracker")
    private DataSource dataSource;

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        try{
            studentDataUtil = new StudentDataUtil(dataSource);
        }
        catch(Exception e)
        {
            throw new ServletException(e);
        }
    }
    
    
    
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
            out.println("<title>Servlet StudentControllerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StudentControllerServlet at " + request.getContextPath() + "</h1>");
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
        try {
            
            // read the command parameter
            String theCommand = request.getParameter("command");
            
            if(theCommand == null)
            {
                theCommand = "LIST";
            }
            
            switch(theCommand)
            {
                case "LIST":
                    listStudents(request,response);
                    break;
                case "ADD":
                    addStudent(request,response);
                    break;
                case "LOAD":
                	loadStudent(request,response);
                	break;
                case "UPDATE":
                	updateStudent(request,response);
                	break;
                case "DELETE":
                	deleteStudent(request,response);
                	break;
                  
                default:
                    listStudents(request,response);
            }
            
        
        }
        catch(Exception e){
            throw new ServletException(e);
        }
        
    }

    private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
    	String theStudentId = request.getParameter("studentId");
    	
    	studentDataUtil.deleteStudent(theStudentId);
    	
    	listStudents(request, response);
		
	}



	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
    	int id = Integer.parseInt(request.getParameter("studentId"));
    	 String firstName = request.getParameter("firstName");
         String lastName = request.getParameter("lastName");
         String email = request.getParameter("email");
         
         Student theStudent = new Student(id, firstName, lastName, email);
         
         studentDataUtil.updateStudent(theStudent);
         
         listStudents(request, response);		
	}

	private void loadStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
    	String theStudentId = request.getParameter("studentId");
               
        Student theStudent = studentDataUtil.getStudents(theStudentId);
        
        request.setAttribute("THE_STUDENT", theStudent);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/update-student-form.jsp");
        dispatcher.forward(request, response);
		
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

    private void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        List<Student> students = StudentDataUtil.getStudents();
        request.setAttribute("STUDENT_LIST", students);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/list-students.jsp");
        dispatcher.forward(request, response);
    }

    private void addStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //To change body of generated methods, choose Tools | Templates.
        String id = request.getParameter("id");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        
        Student theStudent = new Student(Integer.parseInt(id), firstName, lastName, email);
        studentDataUtil.addStudent(theStudent);
        
        listStudents(request, response);
    }

}
