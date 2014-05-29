<%-- 
    Document   : Confirm
    Created on : 2014. 5. 29, 오후 9:16:04
    Author     : sungwoo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC “-//W3C//DTD HTML 4.01//EN">
<html>
    <head>
        <meta http-equiv="content-type"
              content="text/html;charset=utf-8">
        <title>Simple Confirmation Page</title>
    </head>
    <body>
        <p>The value of the hobby that was sent to
            this page is: <b>${param.hobby}</b>.
        <form action="Controller">
            <p>
                If there is an error, please select <i>Edit</i>.
            </p>
            <input type="hidden" name="hobby"
                   value="${param.hobby}">
            <input type="submit" name="editButton"
                   value="Edit">
            <input type="submit" name="processButton" 
                   value="Process">
        </form>
    </body>
</html>
