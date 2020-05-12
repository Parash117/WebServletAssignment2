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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Parash Gurung
 */
public class Problem7 extends HttpServlet{

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        RequestDispatcher resd = req.getRequestDispatcher("problem7.html");
        Statement st = DbConnection.statementObject();
        
        String sql = "SELECT  username, password FROM students where username='"+username+"'"+" and password = '"+password+"'";
        boolean flag = false;
        try {
            ResultSet rs = st.executeQuery(sql);
           
            while (rs.next()){
                if(rs.getString("username").equals(username) && rs.getString("password").equals(password)){
                      flag = true;
                    //out.print("<h2>Login Successful</h2>");
                }
                else{
                    flag = false;
                    //out.print("<h2>Please Check Username And Password</h2>");
                    //resd.include(req, resp);
                    
                }
                
            }
        }
        catch(Exception ex){
            System.out.println("Errpr: "+ex);
            out.print("Error : "+ex);
            
        }
        
        if(flag == true){
            out.print("<h2>Login Successful</h2>");
        }
        else{
            out.print("<h2>Please Check Username And Password</h2>");
            resd.include(req, resp);
        }
    }
    
}
