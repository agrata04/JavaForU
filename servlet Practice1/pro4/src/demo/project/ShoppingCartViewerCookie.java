package demo.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShoppingCartViewerCookie
 */
@WebServlet("/ShoppingCartViewerCookie")
public class ShoppingCartViewerCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sessionid = null;
		Cookie[] cookie = request.getCookies();
		if(cookie != null)
		{
			for(int i=0;i<cookie.length;i++)
			{
				if(cookie[i].getName().equals("sessionid"))
					sessionid = cookie[i].getValue();
				  break;
			}
		}
		
		if(sessionid == null)
		{
			sessionid = generateSessionId();
			Cookie c = new Cookie("sessionid",sessionid);
			response.addCookie(c);
			
		}
		
		out.println("<html><head><title>Shopping cart items</title></head>");
		out.println("<body>");
		
		String[] items = getItemsFormCart(sessionid);
		if(items == null)
		{
		   out.println("<p1>none</p1>");
		   
		}
		else
		{
			out.println("<u1>");
			for(int i=0;i<items.length;i++)
			{
			  out.println("<li>"+items[i]+"</li>");
			}
			out.println("u1");
		}
		
		out.println("<form action =\"/servlet/shopping cart\"method = post>");
		out.println("<would you like to");
		
		out.println("<input type=submit name =\"b1\" value =\"add more items\">");
		out.println("<input type=submit name =\"b1\" value=\"Check out\">");
		out.println("</form>");
		out.println("For help ,click <a href =\"servlet help"+"shopping cart");
		out.println("</body></html>");
		
			
		
		
	}

	private String[] getItemsFormCart(String sessionid) {
		return null;
		// TODO Auto-generated method stub
		
	}

	private String generateSessionId() {
		// TODO Auto-generated method stub
     String uid = new java.rmi.server.UID().toString();
		
		return java.net.URLEncoder.encode(uid);
	
	}

}
