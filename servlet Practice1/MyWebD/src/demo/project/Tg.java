package demo.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Tg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String sname = request.getParameter("name");
		String classname = request.getParameter("class");
		String brname = request.getParameter("branch");
		
		//enroll ,email, address, phone
		
		String roll = request.getParameter("enroll");
		String mail = request.getParameter("email");
		String ad = request.getParameter("address");
		String phone = request.getParameter("phone");
		
		pw.println("Your Name"+sname);
		pw.println("Your class"+classname);
		pw.println("Branch "+brname);
		pw.println("Enrollment number"+roll);
		pw.println("Email"+mail);
		pw.println("Address"+ad);
		pw.println("Phone "+phone);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		
	}

}
