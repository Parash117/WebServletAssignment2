/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assig;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Parash Gurung
 */
public class SetSession extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bookname = req.getParameter("booktitle");
        String price = req.getParameter("bookprice");
        int count = 0;
        
        HttpSession session = req.getSession();
        if(req.getSession(false).getAttribute("count") == null){
            session.setAttribute("count", count);
        }
        else{
            String temp = req.getSession(false).getAttribute("count").toString();
            int counttemp = Integer.parseInt(temp);
            count = counttemp+1;
            session.setAttribute("count", count);
        }
        
            session.setAttribute("booktitle"+String.valueOf(count), bookname);
            session.setAttribute("price"+String.valueOf(count), price);
        
        //System.out.println(""+req.getSession(false).getAttribute("booktitle"));
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("problem8.jsp");
        dispatcher.forward(req, resp);
    }
    
}
