package test;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;

public class HelloServlet extends HttpServlet {
  public void doGet (HttpServletRequest req,
                     HttpServletResponse res)
    throws ServletException, IOException
  {
    PrintWriter out = res.getWriter();

    out.println("Hello, world!");
	out.println("Hello, world again!!!");
	out.println("Hello, world once again!!!");
	out.close();
  }
}
