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
        <title>Delete</title>
    </head>
    <body>
    <center><h1>Delete Advertiser</h1></center>
    <center>
    <fieldset style="margin-bottom: 250px;margin-left: 500px;margin-right: 500px ">
        <legend>Delete</legend>
        <form action="advertiser_delete" method="post">
            
            <table>
                <tr>
                    <td>Advertiser Id:</td>
                    <td><input type="text" name="adv_id"/></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td align="center"><input type="submit" value="Delete Data"/></td>
                </tr>
            </table>
        </form>
    </fieldset>
    </center>
    </body>
</html>
