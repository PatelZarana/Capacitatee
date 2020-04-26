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
@WebServlet(name = "advertiser_update", urlPatterns = { "/advertiser_update" })
public class advertiser_update extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                        
        int adv_id = Integer.parseInt((String)request.getParameter("adv_id"));
        String adv_name = (String)request.getParameter("adv_name");
	String adv_email = (String)request.getParameter("adv_email");
	String adv_pass = (String)request.getParameter("adv_pass");
	String adv_phone =(String)request.getParameter("adv_phone");
        String adv_company_name = (String)request.getParameter("adv_company_name");
        int adv_bal = Integer.parseInt(request.getParameter("adv_bal"));
                        
			
        String sql = "update advertiser set adv_name=?,adv_email=?,adv_pass=?,adv_phone=?,adv_company_name=?,adv_bal=? where adv_id=?";
			
        response.setContentType("text/html");
	PrintWriter out = response.getWriter();
			
                        try{
                            ConnectManager c = new ConnectManager();
                            Connection con = c.connect("capacitate");
                            if(con != null)
                            {
                                out.print("<html><body>connected!");
                                
                                PreparedStatement prst = con.prepareStatement(sql);
                                prst.setString(1, adv_name);
                                prst.setString(2, adv_email);
                                prst.setString(3, adv_pass);
                                prst.setString(4, adv_phone);
                                prst.setString(5, adv_company_name);
                                prst.setInt(6, adv_bal);
                                prst.setInt(7, adv_id);
                                int result = prst.executeUpdate();
                                if(result != 0)
                                    out.print("<html><body><br/><h5>Data Updated..</h5></body></html>");
                                else
                                    out.print("<html><body><br/><h5>oops...</h5></body></html>");
                            }
                        }catch(Exception e){}
                        
    }
}
