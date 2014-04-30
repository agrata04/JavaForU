package demo.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTimer
 */
@WebServlet("/SessionTimer")
public class SessionTimer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		out.println("<html><head><title>Session Timer</title></head>");
		out.println("<h1>Session Timeout</h1><br> ");
		out.println("<p1>The previous session timeout was"+session.getMaxInactiveInterval()+"</p1><br>");
		
		session.setMaxInactiveInterval(2*60*60);
		out.println("<p2>The new timeout is = "+session.getMaxInactiveInterval()+"<br></p2>");
	}

}
