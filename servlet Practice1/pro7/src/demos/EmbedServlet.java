package demos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmbedServlet
 */
@WebServlet("/EmbedServlet")
public class EmbedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 response.setContentType("text/html");
         PrintWriter pw = response.getWriter();
         String name = request.getParameter("t1");

         pw.println("<html><head>");
         pw.println("<title>Hello"+name+"</title></head>");
         
         pw.println("<applet code=\"MyApplet.class\" CodeBase =\"\"width=700 height =700></applet>");
         pw.println("</html>");
	}

}
