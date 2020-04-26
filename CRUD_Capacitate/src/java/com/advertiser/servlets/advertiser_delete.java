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
@WebServlet(name = "advertiser_delete", urlPatterns = { "/advertiser_delete" })
public class advertiser_delete extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                        
        int adv_id = Integer.parseInt((String)request.getParameter("adv_id"));
                        
			
        String sql = "delete from advertiser where adv_id=?";
			
        response.setContentType("text/html");
	PrintWriter out = response.getWriter();
			
                        try{
                            ConnectManager c = new ConnectManager();
                            Connection con = c.connect("capacitate");
                            if(con != null)
                            {
                                out.print("<html><body>connected!");
                                
                                PreparedStatement prst = con.prepareStatement(sql);
                                
                                prst.setInt(1, adv_id);
                                int result = prst.executeUpdate();
                                if(result != 0)
                                    out.print("<html><body><br/><h5>Data Deleted..</h5></body></html>");
                                else
                                    out.print("<html><body><br/><h5>oops...</h5></body></html>");
                            }
                        }catch(Exception e){}
                        
    }
}
