package com;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;

public class calculateServlet extends HttpServlet{
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
    int n1=Integer.parseInt(req.getParameter("num1"));
      int n2=Integer.parseInt(req.getParameter("num2"));
    int sum = n1+n2;
    res.setContentType("text/html");
    res.getWriter().println("the result is " + sum);
  }
}
