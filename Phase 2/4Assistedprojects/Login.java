package com.Bhavana.phase2.PracticeProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        request.getRequestDispatcher("link.html").include(request, response);  
          
        String email=request.getParameter("email");  
        String password=request.getParameter("password");  
          
        if(email.equals("bhavana@gmail.com") && password.equals("12345bhav")){  
        out.print("Welcome, "+email);  
        HttpSession session=request.getSession();  
        session.setAttribute("email",email);  
        }  
        else{  
        	out.print("Incorrect email id or password");
            request.getRequestDispatcher("login.html").include(request, response);  
        }  
        out.close();
	}

}
