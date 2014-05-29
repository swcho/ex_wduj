<%-- 
    Document   : Controller
    Created on : 2014. 5. 29, ?? 9:37:53
    Author     : sungwoo
--%>

<%
    String address;
    
    if (request.getParameter("processButton") != null)
    {
        address = "Process.jsp";
    }
    else if (request.getParameter("confirmButton") != null)
    {
        address = "Confirm.jsp";
    }
    else
    {
        address = "Edit.jsp";
    }
    
    RequestDispatcher dispatcher = request.getRequestDispatcher(address);
    dispatcher.forward(request, response);
%>
