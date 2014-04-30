package demo.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RadioInput
 */
@WebServlet("/RadioInput")
public class RadioInput extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String val = request.getParameter("I");
		String val2 = request.getParameter("G");
		String val3 = request.getParameter("C");
		
		try {
		if("on".equalsIgnoreCase(val))
			pw.println("You are my cousin");
		else if("on".equalsIgnoreCase(val2))
			pw.println("Your forefathers are alive");
		else if("on".equalsIgnoreCase(val3))
			pw.println("You have only one child");
		else
			pw.println("Sorry we dont know who you are!!");
		
		}catch(Exception e)
		{
			pw.println("Please select any one of them");
		}
	}

}
