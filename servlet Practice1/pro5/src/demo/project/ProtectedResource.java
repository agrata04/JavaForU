package demo.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpUtils;

/**
 * Servlet implementation class ProtectedResource
 */
@WebServlet("/ProtectedResource")
public class ProtectedResource extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		Object done = session.getAttribute("logon.isDone");
		if(done == null)
		{
			session.setAttribute("login.target",HttpUtils.getRequestURL(request).toString());
			response.sendRedirect("Login.html");
			
		}
		
		out.println("If you redirected");
	}

}
