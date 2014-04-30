package demo.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Vector;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SiteSelector
 */
@WebServlet("/SiteSelector")
public class SiteSelector extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Vector sites = new Vector();
	Random random = new Random();

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		sites.addElement("http://www.orielly.com/catalog/jservlet");
		sites.addElement("http://www.servlets.com");
		sites.addElement("http://java.sun.com/products/servlet");
		sites.addElement("http://www.newInstance.com");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		int siteIndex = Math.abs(random.nextInt())%sites.size();
		String site = (String)sites.elementAt(siteIndex);
		
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location",site);
	}

}
