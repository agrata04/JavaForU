package demo.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClientPullMove
 */
@WebServlet("/ClientPullMove")
public class ClientPullMove extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final String New_Host = "http://www.orielly.com";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	   response.setContentType("text/html");
	   PrintWriter out = response.getWriter();
	   String newLocation = New_Host + request.getRequestURI();
	   response.setHeader("Refresh","10; URL ="+newLocation);
	   out.println("The requested URI has been moved to a different host<BR>");
	   out.println("Its new location is ="+newLocation);
	   out.println("Your browser will take you there in 10 seconds");
		
		
		
		
		
	}

}
