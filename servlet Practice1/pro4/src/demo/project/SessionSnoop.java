package demo.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionSnoop
 */
@WebServlet("/SessionSnoop")
public class SessionSnoop extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Enumeration<String> Enumeration;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		Integer count =(Integer)session.getAttribute("snoop.count");
		if(count == null)
		{
			count = new Integer(1);
	    }
		else
		{
			count = new Integer(count.intValue()+1);
		}
		
		session.setAttribute("snoop.count",count);
		out.println("<html><head><title>SessionSnoop</title></head>");
		out.println("<body><h1>Session Snoop</h1>");
		out.println("You have visited this page"+count+((count.intValue() ==1)?"time.":"times."));
		out.println("<p>");
		
		out.println("<h3>Here is your saved session data</h3>");
		Enumeration e = session.getAttributeNames();
		while(e.hasMoreElements())
		{
			String name = (String)e.nextElement();
			out.println(name+":"+session.getAttribute(name)+"<br>");
		}
		
		out.println("<h3>Here are some vital stats on your session</h3>");
		out.println("Session Id "+session.getId()+"<I>(Keep it secret)</I><br>");
		out.println("New Session "+session.isNew()+"<br>");
		out.println("TimeOut"+session.getMaxInactiveInterval());
		out.println("<I>("+session.getMaxInactiveInterval()/60+"</I>) milliseconds<br>");
		out.println("<I>("+session.getCreationTime()+")</I><br>");
		out.println("<I>("+new Date(session.getCreationTime())+"</I>)<br>");
		out.println("<I>("+session.getLastAccessedTime()+"</I>)<br>");
		out.println("<I>("+new Date(session.getLastAccessedTime())+"</I>)<br>");
		
		out.println("Requested session Id from cookie"+request.isRequestedSessionIdFromCookie()+"<br>");
		out.println("Requested session id from URL "+request.isRequestedSessionIdFromUrl()+"<br>");
		out.println("Requested session id valid "+request.isRequestedSessionIdValid()+"<br>");
		
		out.println("<h3>Test url rewriting</h3>");
		out.println("Click <a href ="+response.encodeUrl(request.getRequestURI())+"here</a>");
		out.println("Rewriting cookies not supported");
		out.println("</body></html>");
		
		
		
		
		
		
        		
	}

}
