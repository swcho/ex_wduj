<%-- 
    Document   : First
    Created on : 2014. 5. 29, 오후 9:14:02
    Author     : sungwoo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC “-//W3C//DTD HTML 4.01//EN">
<html>
    <head>
        <meta http-equiv="content-type"
              content="text/html;charset=utf-8">
        <title>Simple Edit Page</title>
    </head>
    <body>
        <p>This is a simple HTML page that has a form in it.
        <form action="Controller">
            <p>
                If there is a value for the hobby in the query
                string, then it is used to initialize the hobby
                element.
            <p>
                Hobby:
                <input type="text" name="hobby" value="${helper.data.hobby}">
                Aversion:
                <input type="text" name="aversion" value="${helper.data.aversion}">
                <input type="submit" name="confirmButton" value="Confirm">
        </form>
    </body>
</html>
