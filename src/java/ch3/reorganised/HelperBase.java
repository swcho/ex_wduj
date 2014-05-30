/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3.reorganised;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sungwoo
 */
public class HelperBase {

    protected HttpServletRequest request;
    protected HttpServletResponse response;

    public HelperBase(
            HttpServletRequest request,
            HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

}
