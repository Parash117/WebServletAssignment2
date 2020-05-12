/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assig;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Parash Gurung
 */
public class Problem4 extends HttpServlet {

    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] co = req.getParameterValues("course");

      resp.setContentType("text/html");
      PrintWriter out=resp.getWriter();
      out.print("<h2>");
      for(String c:co)
      {
         out.print(  c+" <br>  ");
      }
      out.print("</h1>");
    }
    
}
