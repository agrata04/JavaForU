import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class ForwardServlet extends HttpServlet{
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		String name = request.getParameter("name");
		/*
		 * You can do any processing here. 
		 * We will simply output the value of name parameter on server console.
		 * 
		 */
		System.out.println(name);
		String destination = "/WEB-INF/pages/result.jsp";
 
		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request, response);
	}
 
}