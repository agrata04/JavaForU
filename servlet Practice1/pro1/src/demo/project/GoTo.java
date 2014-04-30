package demo.project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GoTo
 */
@WebServlet("/GoTo")
public class GoTo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String site = request.getPathInfo();
		String query = request.getQueryString();
		
		if(site == null)
		{
			response.sendError(response.SC_BAD_REQUEST,"Extra path info required");
		}
		
		String url = site.substring(1)+(query == null ?"" :"?"+query);
		
		log(url);
		
		response.sendRedirect(url);
	}

}
