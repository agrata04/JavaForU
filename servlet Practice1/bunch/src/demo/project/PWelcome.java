package demo.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PWelcome
 */
@WebServlet("/PWelcome")
public class PWelcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Hashtable access = new Hashtable();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw  = response.getWriter();
		String remoteuser = request.getRemoteUser();
		if(remoteuser == null)
			pw.println("Welcome");
		
		else{
			 
			Date lastaccess = (Date) access.get(remoteuser);
	        pw.println("Hello "+remoteuser);
	        if(lastaccess == null)
	        pw.println("This is your first visit");
	        else
	        {
	        	pw.println("Your last visit was"+access.get(remoteuser));
	        }
	        
	        if(remoteuser.equals("sandry"))
	        	pw.println("Shall we play a game");
		}
		
		
	}

}
