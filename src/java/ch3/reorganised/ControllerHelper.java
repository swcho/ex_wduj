/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch3.reorganised;

import ch3.defaultValidate.RequestDataDefault;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sungwoo
 */
public class ControllerHelper extends HelperBase {
    
    protected RequestDataDefault data = new RequestDataDefault();

    public ControllerHelper(
            HttpServletRequest request, 
            HttpServletResponse response) {
        super(request, response);
    }
    
    public Object getData() {
        return data;
    }
    
    protected void doGet() throws ServletException, IOException {
        request.getSession().setAttribute("helper", this);
        data.setHobby(request.getParameter("hobby"));
        data.setAversion(request.getParameter("aversion"));
        
        String address;
        if (request.getParameter("processButton") != null) {
            address = "Process.jsp";
        } else if (request.getParameter("confirmButton") != null) {
            address = "Confirm.jsp";
        } else {
            address = "Edit.jsp";
        }
        
        RequestDispatcher dispatcher = 
                request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }
}
