package demo.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Buffering
 */
@WebServlet("/Buffering")
public class Buffering extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setBufferSize(2*1024);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int size = response.getBufferSize();
		
		log("The default buffer size is "+size);
		
		out.println("The client wont see this");
		response.reset();
		out.println("Not will the client see this !");
		response.reset();
		out.println("And this wont be seen if sendError() is called");
		if(request.getParameter("important_parameter") == null)
		{
			response.sendError(response.SC_BAD_REQUEST,"important_parameter");
			
		}
		
		
	}

}
