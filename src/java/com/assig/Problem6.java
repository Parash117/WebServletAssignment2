/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assig;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Parash Gurung
 */
public class Problem6 extends HttpServlet{

    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String rollno = req.getParameter("rollno");
        
        Statement st = DbConnection.statementObject();
        String sql = "SELECT * FROM students WHERE rollno="+rollno;

        
            
        out.print("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n" +
"        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>");
        out.print("<H1>Data Obtained From the form:</H1><br><br>");
        out.print("<div class=\"container\">\n" +
"        <table class=\"table table-striped\">\n" +
"            <thead>\n" +
"              <tr>\n" +
"                  <th><h3>SID</h3></th> <th><h3>Name</h3></th> <th><h3>Address</h3></th> <th><h3>Email</h3></th> <th><h3>Program</h3></th> <th><h3>Year of Admission</h3></th> <th><h3>Roll No.</h3></th> \n" +
"              </tr>\n" +
"            </thead>\n" +
"            \n" +
"            <tbody>\n");
        
        try {
            ResultSet rs = st.executeQuery(sql);
           
            while (rs.next()){
                out.print("<tr>");
                out.print("<td>"+rs.getInt("sid")+"</td>"+"<td>"+rs.getString("name")+"</td>"+"<td>"+rs.getString("address")+"</td>"+"<td>"+rs.getString("email")+"</td>"+"<td>"+rs.getString("program")+"</td>"+"<td>"+rs.getString("yearofad")+"</td>"+"<td>"+rs.getString("rollno")+"</td>");
                out.print("</tr>");
                
            }
        }
        catch(Exception ex){
            System.out.println("Errpr: "+ex);
            out.print("Error : "+ex);
            
        }
        
        out.print("</tbody>\n" +
"            \n" +
"        </table>\n" +
"        </div>");
        
    }
    
}
