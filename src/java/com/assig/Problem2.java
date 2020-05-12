/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assig;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Parash Gurung
 */
public class Problem2 extends HttpServlet {

    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String gender = req.getParameter("gender");
        String course = req.getParameter("course");
        String password =req.getParameter("password");
        String rollno = req.getParameter("rollno");
        String yearof = req.getParameter("yearofad");
        String username = req.getParameter("username");
        String address =req.getParameter("address");
        String email = req.getParameter("email");
        String name = fname+" "+lname;
        
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        Statement st = DbConnection.statementObject();
        String sql = "INSERT INTO students (name,address,email,program,yearofad,rollno,username,password)VALUES('"+name+"','"+address+"','"+email+"'"
                + ",'"+course+"','"+yearof+"','"+rollno+"','"+username+"','"+password+"')";
        
        try{
            st.execute(sql);
            System.out.println("Success");
            out.print("Successfully added to Database");
        }
        catch(Exception ex){
            System.out.println("Failed"+ex);
            out.print("Failed"+ex);
        }
        
        
        
        out.print("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n" +
"        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>");
        out.print("<H1>Data Obtained From the form:</H1><br><br>");
        out.print("<div class=\"container\">\n" +
"        <table class=\"table table-striped\">\n" +
"            <thead>\n" +
"              <tr>\n" +
"                  <th><h1>Details</h1></th>\n" +
"              </tr>\n" +
"            </thead>\n" +
"            \n" +
"            <tbody>\n");
        
        out.print("<tr><td>");
        out.print("First Name: "+fname);
        out.print("<td></tr>");
        
        out.print("<tr><td>");
        out.print("Last Name: "+ lname);
        out.print("<td></tr>");
        
        out.print("<tr><td>");
        out.print("Gender: "+gender);
        out.print("<td></tr>");
        
        out.print("<tr><td>");
        out.print("Course: "+course);
        out.print("<td></tr>");
        
        out.print("<tr><td>");
        out.print("Password: "+password);
        out.print("<td></tr>");
        
        out.print("</tbody>\n" +
"            \n" +
"        </table>\n" +
"        </div>");
    }

    
}
