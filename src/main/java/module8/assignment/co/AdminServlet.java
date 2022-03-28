package module8.assignment.co;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text.html");
		PrintWriter out = response.getWriter();
		
		String n = request.getParameter("name");
		Cookie ck = new Cookie("uname", n); // creating cookie object
		response.addCookie(ck); //adding cookie in the response
		out.print("Added a cookie for the name !!"+n);
		
		out.close();
	}

	
}
