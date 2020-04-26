package com.advertiser.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
import com.connect.*;
import java.math.BigInteger;


@WebServlet(name = "advertiser_insert", urlPatterns = { "/advertiser_insert" })
public class advertiser_insert extends HttpServlet{
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String adv_name = (String)request.getParameter("adv_name");
			String adv_email = (String)request.getParameter("adv_email");
			String adv_pass = (String)request.getParameter("adv_pass");
			String adv_phone =(String)request.getParameter("adv_phone");
                        String adv_company_name = (String)request.getParameter("adv_company_name");
                        int adv_bal = Integer.parseInt(request.getParameter("adv_bal"));
                        
			
                        String sql = "insert into advertiser(adv_name,adv_email,adv_pass,adv_phone,adv_company_name,adv_bal) values (?,?,?,?,?,?)";
			
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
                                int result = prst.executeUpdate();
                                if(result != 0)
                                    out.print("<html><body><br/><h5>Data Inserted..</h5></body></html>");
                                else
                                    out.print("<html><body><br/><h5>oops...</h5></body></html>");
                            }
                        }catch(Exception e){}
                        
			
				
	}

}
