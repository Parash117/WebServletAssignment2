/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assig;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Parash Gurung
 */
public class Problem5 extends HttpServlet{

    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String fname = req.getParameter("fname");
      String lname = req.getParameter("lname");
      String email = req.getParameter("email");
        RequestDispatcher resd = req.getRequestDispatcher("problem5.html");
      resp.setContentType("text/html");
      PrintWriter out=resp.getWriter();
      if(fname.equals(null) || fname.length()<1){
          out.print("<h1>Enter First Name Please</h1> ");
          resd.include(req,resp);
      }
      else if(lname.equals(null) || lname.length()<1){
          out.print("<h1>Enter Last Name Please</h1>");
          resd.include(req,resp);
      }
      else if(email.equals(null)||email.length()<1 || !isValid(email)){
          out.print("<h1>Enter Valid Email Please</h1>");
          resd.include(req,resp);
      }
      else{
          out.print("<h2>All is Good</h2>");
      }
      
    }
    
    public boolean isValid(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
    
}
