package module8.assignment.co;

import java.io.ObjectInputFilter.Config;
import java.io.PrintWriter;
import java.nio.file.DirectoryStream.Filter;

public class MyFilter implements Filter {
	public void init(Config ar0) throws ServletException{
		
		PrintWriter out = resp.getWriter();
		
		String password = req.getParameter("Password");
		if(password.equals("password")) {
			
			chain.doFilter(req, res); // sends request to next resource
		} else {
			out.print("username or password error");
			RequestDispatcher rd = req.getRequestDispatcher("Index.html");
			rd.include(req, resp);
		}
		
	}
	
	public void destroy() {
		
	}

}
