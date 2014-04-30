package demo.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.cert.X509Certificate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class X509Snoop
 */
@WebServlet("/X509Snoop")
public class X509Snoop extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		X509Certificate[] certs = (X509Certificate[]) request.getAttribute("javax.servlet.request.X509Certificate");
		
		if(certs != null)
		{
			for(int i=0;i<certs.length;i++)
			{
				pw.println("client certificate =["+i+"] ="+certs[i].toString());
			}
		}
		
		else 
		{
			if("https".equals(request.getScheme()))
				pw.println("Https request,no client certificate");
			else
				pw.println("Neither https request, nor client certificate");
		}
	}

}
