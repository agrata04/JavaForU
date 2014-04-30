package demo.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShoppingCartViewerHidden
 */
@WebServlet("/ShoppingCartViewerHidden")
public class ShoppingCartViewerHidden extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    out.println("<HEAD><TITLE>Current Shopping Cart Items</TITLE></HEAD>");
	    out.println("<BODY>");

	    // Cart items are passed in as the item parameter.
	    String[] items = request.getParameterValues("item");

	    // Print the current cart items.
	    out.println("You currently have the following items in your cart:<BR>");
	    if (items == null) {
	      out.println("<B>None</B>");
	    }
	    else {
	      out.println("<UL>");
	      for (int i = 0; i < items.length; i++) {
	        out.println("<LI>" + items[i]);
	      }
	      out.println("</UL>");
	    }

	    // Ask if the user wants to add more items or check out.
	    // Include the current items as hidden fields so they'll be passed on.
	    out.println("<FORM ACTION=\"/servlet/ShoppingCart\" METHOD=POST>");
	    if (items != null) {
	      for (int i = 0; i < items.length; i++) {
	        out.println("<INPUT TYPE=HIDDEN NAME=\"item\" VALUE=\"" +
	          items[i] + "\">");
	      }
	    }
	    out.println("Would you like to<BR>");
	    out.println("<INPUT TYPE=SUBMIT VALUE=\" Add More Items \">");
	    out.println("<INPUT TYPE=SUBMIT VALUE=\" Check Out \">");
	    out.println("</FORM>");

	    out.println("</BODY></HTML>");
	}

}
