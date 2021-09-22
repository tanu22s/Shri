package Firservlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import Firservlet.RegisterModel;



@WebServlet("/RegCtrl")
public class RegCtrl extends HttpServlet {
	
	

 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    
	 
	 String username= request.getParameter("username");
	 String lname= request.getParameter("lname");
	 String pwd= request.getParameter("pwd");
	 String gmail= request.getParameter("gmail");
	 String mob= request.getParameter("mob");
	 String age= request.getParameter("age");
	 String gen= request.getParameter("gen");
	 String add= request.getParameter("add");
	 
	 RegisterBean bean = null;
	 RegisterModel model = new RegisterModel();
	 try {
		bean = model.Authenticate("username", "pwd");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 if(username.equals(bean.getusername()) && pwd.equals(bean.getPassword())) {
		 RequestDispatcher rd = request.getRequestDispatcher("/WelcomeReg");
			rd.forward(request, response);
		}
 
		else{
			RequestDispatcher rd = request.getRequestDispatcher("PageRegisteration.jsp");
			request.setAttribute("error", "Invalid Credentials");
			rd.forward(request, response);
			
			
		}
	 
	 
//	 try {
//		model.Authenticate(b);
//	} catch (Exception e) {
//		
//		e.printStackTrace();
//	}
	 
//	RegisterBean bean = new RegisterBean();  // add data
//	
//	bean.setFname(fname);
//	bean.setLname(lname);
//	bean.setPassword(pwd);
//	bean.setGmail(gmail);
//	bean.setMobileNumber(mob);
//	bean.setAge(age);
//	bean.setGender(gen);
//	bean.setAddress(add);
//    RegisterModel model = new RegisterModel();
//    try {
//		model.add(bean);
//		model.nextPk();
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
   
//    {
//    	
//    	RegisterBean bean = new RegisterBean();	  // update data
//    	bean.setFname("Gautami");
//    	bean.setLname("Parshav");
//    	bean.setPassword("56564545");
//    	bean.setGmail("Par44@gmail.com");
//    	bean.setMobileNumber("7485857679");
//    	bean.setAge("23");
//    	bean.setGender("Female");
//    	bean.setAddress("555 near st mary school, gwalior");
//    	bean.setID(19);
//          RegisterModel model = new RegisterModel();
//            model.Update(bean);
//    }
//    {
//    	RegisterBean bean = new RegisterBean();	
//    	bean.setFname("ganesh");
//    	RegisterModel model = new RegisterModel();
//        model.Delete(bean);
//    }
//    {
//    	RegisterBean bean = new RegisterBean();	
//          model.Select();
//    }
	
	PrintWriter out = response.getWriter();
	out.println(username+ " " + lname + " " + pwd + " " +gmail + " " +mob + " " +age + " " +gen + " " + add );
	
 
 
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
