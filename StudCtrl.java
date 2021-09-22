package Firservlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/StudCtrl")
public class StudCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudCtrl() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/HTML");
		
		
		StudentBean std = new StudentBean();
		
	    std.setRollNo(request.getParameter("Rn"));
		std.setFirstName(request.getParameter("Fn"));
		std.setLastName(request.getParameter("Ln"));
		std.setSession(request.getParameter("session"));
		
	
		String op = request.getParameter("Operation");
		if(op.equals("Add")) {
			try {
				StudentModel.add(std);
				System.out.println("Successfully added record");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(op.equals("Delete")){
			try {
				StudentModel.Delete(std);
				System.out.println("Successfully deleted record");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		 
else if(op.equals("Modify")){
	try {
		StudentModel.Update(std);
		System.out.println("Successfully updated record");
	} catch (Exception e) {
		e.printStackTrace();
	}
		}

		
else if(op.equals("getRollNo")){
	try {
		StudentModel.getRollNo(std);
		response.sendRedirect("studvw.jsp");
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		}
else if(op.equals("Search")){
	try {
		  request.setAttribute("student", new StudentModel().Search());
		 RequestDispatcher rd = request.getRequestDispatcher("stuV.jsp");
			rd.forward(request, response);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	PrintWriter out = response.getWriter();
	out.println(std.getLastName()+std.getRollNo());
	
	}
				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
