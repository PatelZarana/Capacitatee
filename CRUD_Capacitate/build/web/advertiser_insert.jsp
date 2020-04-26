<%-- 
    Document   : advertiser_publisher_insert
    Created on : 8 Dec, 2016, 2:37:11 PM
    Author     : Dhruv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
    <center><h1>Insert Data(Advertiser)</h1></center>
    <center>
    <fieldset style="margin-bottom: 250px;margin-left: 500px;margin-right: 500px ">
        <legend>Advertiser log in</legend>
        <form action="advertiser_insert" method="post">
            
            <table>
                <tr>
                    <td align="center">Advertiser's Name:</td>
                    <td align="center"><input type="text" name="adv_name"/></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td align="center">Email:</td>
                    <td align="center"><input type="email" name="adv_email"/></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td align="center">Password:</td>
                    <td align="center"><input type="password" name="adv_pass"/></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td align="center">Phone:</td>
                    <td align="center"><input type="text" name="adv_phone"/></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td align="center">Company Name:</td>
                    <td align="center"><input type="text" name="adv_company_name"/></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td align="center">Balance:</td>
                    <td align="center"><input type="text" name="adv_bal"/></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td align="center"><input type="submit"/></td>
                    <td align="center"><input type="reset"/></td>
                </tr>
            </table>
        </form>
    </fieldset>
    </center>
    </body>
</html>
