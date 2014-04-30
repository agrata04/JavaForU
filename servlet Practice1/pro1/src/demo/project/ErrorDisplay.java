package demo.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorDisplay
 */
@WebServlet("/ErrorDisplay")
public class ErrorDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String code =null,message = null,type =null;
	    Object codeObj,messageObj,typeObj;
	    
	    codeObj = request.getAttribute("javax.servlet.error.status_code");
	    messageObj = request.getAttribute("javax.servlet.error.message");
	    typeObj = request.getAttribute("javax.servlet.error.exception_type");
	    
	    if(codeObj != null)
	    	code = codeObj.toString();
	    if(messageObj != null)
	    	message = messageObj.toString();
	    if(typeObj != null)
	    	type = typeObj.toString();
	    
	    String reason = (code!=null ?code:type);
	    
	    pw.println("<html><body>");
	    pw.println("<h1>"+reason+":"+message);
	    pw.println("<h2>"+message+":"+"</h2>");
	    pw.println("<hr>");
	    pw.println("<I>Error accessing "+request.getRequestURI());
	    pw.println("</body></html>");
	    
	    
		
	}

}
