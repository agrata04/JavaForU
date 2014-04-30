import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

  public class Hello 
  {
    public void doGet(HttpServletRequest request,HttpServletResponse)throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<html><body");
        pw.println("<h1>Hello world!!!</h1>");
        pw.println("</body></html>");
    }
  }