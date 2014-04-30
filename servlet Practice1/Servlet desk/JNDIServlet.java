import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.naming.*;
import javax.sql.*;

public class JNDIServlet extends HttpServlet {
  DataSource pool;

  public void init() throws ServletException {
    try {
    Context env = (Context) 
      new InitialContext().lookup("java:comp/env");

    pool = (DataSource) env.lookup("jdbc/test");

          if (pool == null)
      throw new 
      ServletException("`jdbc/test' is an unknown DataSource");
    } catch (NamingException e) {
          throw new ServletException(e);
    }
  }

  public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
          throws IOException, ServletException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    Connection conn = null;
    try {
      conn = pool.getConnection();

          // Code for the servlet using the database goes here

          rs.close();
          stmt.close();
    } catch (SQLException e) {
          throw new ServletException(e);
    } finally {
            try {
              if (conn != null)
              conn.close();
            } catch (SQLException e) {
            }
    }
  }
}