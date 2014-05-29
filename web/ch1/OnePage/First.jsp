<%-- 
    Document   : First
    Created on : 2014. 5. 29, 오전 11:23:44
    Author     : sungwoo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            <p>
                This is a simple HTML page that has a form in it.
            </p>
                The hobby was received as: <b>${param.hobby}</b>
            <p>
                Your Hobby: <input type="text" name="hobby"
                              value="">
                <input type="submit" name="confirmButton"
                       value="Confirm">
            </p>
        </form>
    </body>

</html>
