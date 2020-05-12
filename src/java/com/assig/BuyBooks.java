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
public class BuyBooks extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        int sum=0;
        if(req.getSession(false).getAttribute("count") != null ){
            
            String temp = req.getSession(false).getAttribute("count").toString();
            int count = Integer.parseInt(temp);
            for(int i = 0; i<=count; i++){
                System.out.println("name : "+req.getSession(false).getAttribute("booktitle"+String.valueOf(i))+" price : "+req.getSession(false).getAttribute("price"+String.valueOf(i)));

        }
        
        
            
            out.print("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n" +
"        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>");
        out.print("<H1>Data Obtained From the form:</H1><br><br>");
        out.print("<div class=\"container\">\n" +
"        <table class=\"table table-striped\">\n" +
"            <thead>\n" +
"              <tr>\n" +
"                  <th><h3>Book</h3></th> <th><h3>Price</h3></th> " +
"              </tr>\n" +
"            </thead>\n" +
"            \n" +
"            <tbody>\n");
        
        for(int i = 0; i<=count; i++){
                out.print("<tr>");
                out.print("<td>"+req.getSession(false).getAttribute("booktitle"+String.valueOf(i))+"</td><td>NRP. "+req.getSession(false).getAttribute("price"+String.valueOf(i))+" /-</td>");
                out.print("</tr>");
                String temp2 = req.getSession(false).getAttribute("price"+String.valueOf(i)).toString();
                sum += Integer.parseInt(temp2);
                
        
        }
        
        out.print("<tr><td><h3>TOTAL</h3></td><td><h3>NRP. "+sum+" /-</h3></td></tr></tbody>\n" +
"            \n" +
"        </table>\n" +
"        </div>");
        
        }
        else{
            out.print("<h1>No Item in cart</h1>");
        }
        //RequestDispatcher dispatcher = req.getRequestDispatcher("problem8.jsp");
        //dispatcher.forward(req, resp);
        
    }

    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
    
    
}
