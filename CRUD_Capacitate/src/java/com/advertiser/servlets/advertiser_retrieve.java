/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.advertiser.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.connect.*;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
/**
 *
 * @author Dhruv
 */
@WebServlet(name = "advertiser_retrieve", urlPatterns = { "/advertiser_retrieve" })
public class advertiser_retrieve extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String sql = "select * from advertiser";
        
        ConnectManager c = new ConnectManager();
        try{
        Connection con = c.connect("capacitate");
        if(con != null){
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            out.print("<html><body><table border=2>"
                    + "<tr>"
                    + "<th>adv_id</th>"
                    + "<th>adv_name</th>"
                    + "<th>adv_email</th>"
                    + "<th>adv_pass</th>"
                    + "<th>adv_phone</th>"
                    + "<th>adv_company_name</th>"
                    + "<th>adv_balance</th>"
                    + "</tr>");
            while(rs.next())
            {
               out.print("<tr>"
                    + "<th>"+rs.getInt("adv_id")+"</th>"
                    + "<th>"+rs.getString("adv_name")+"</th>"
                    + "<th>"+rs.getString("adv_email")+"</th>"
                    + "<th>"+rs.getString("adv_pass")+"</th>"
                    + "<th>"+rs.getString("adv_phone")+"</th>"
                    + "<th>"+rs.getString("adv_company_name")+"</th>"
                    + "<th>"+rs.getInt("adv_bal")+"</th>");
            }
        }
        else
        {
            out.print("<html><body><h3>DB connection Problem..</h3></body></html>");
        }
        }catch(Exception e){out.print(e);}
        
    }

}
