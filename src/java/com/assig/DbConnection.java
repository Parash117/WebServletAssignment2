/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Parash Gurung
 */
public class DbConnection {
    public static Statement statementObject(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drive Load Successfull");
        } 
        catch (Exception e) {
            System.out.println("Driver not Loaded" + e);
        }

        Connection contodb = null;

        try {
            contodb = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaassignment", "root", "");
            System.out.println("Connected to DataBase");

        } 
        catch (Exception e) {
            System.out.println("Not connected to DataBase" + e);
        }

        Statement st = null;
        
        try {
            st = contodb.createStatement();

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return st;
    }
}
