package Firservlet;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet ("/Newshri")
public class Newshri extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/HTML");
	PrintWriter out = response.getWriter();
		String Username, lname, pwd, lan, jsessionid;
		 Username = request.getParameter("Username");
	     lname = request.getParameter("lname");
	     pwd = request.getParameter("pwd");
	     lan = request.getParameter("lan");
	     jsessionid=request.getParameter("jsessionid");
	     
	     if(Username.equals("Kajal") && pwd.equals("admin")) {
	    	 
	    	 HttpSession session = request.getSession();
	    	 session.setAttribute("Username", Username);
	    	 session.setAttribute("pwd", pwd);
	     }
	     
	     Cookie c = new Cookie(Username, pwd);
	     c.setMaxAge(24*60*60);
	     response.addCookie(c);
	     
	     Cookie ck[] = request.getCookies();
	     
	     for (int i = 0; i < ck.length; i++) {
			Cookie cookie = ck[i];
			String fn= cookie.getName();
			String pw = cookie.getValue();
			
			     System.out.println(fn+" "+pw);
			     
			     
		}
	     
	
		
		
	out.println(Username +" "+ lname +" " +pwd+" "+ lan);
//		out.println("<h3>Request info examp</h3>");
//		out.println("Method" + request.getMethod());
//		out.println("Request URI"+ request.getRequestURI());
//		out.println("Protocol"+ request.getProtocol());
//		out.println("Remote address"+ request.getRemoteAddr() );
	     
//		if(fname.equals("shri")&& pwd.equals("shri") ) {
//			
//			RequestDispatcher rd = request.getRequestDispatcher("/WelcomeCtrl");
//			rd.forward(request, response);
//		}else {
//			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
//			request.setAttribute("error", "Invalid Credentials");
//			rd.forward(request, response);
//		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
				
	}

}
