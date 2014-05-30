/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shared;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

/**
 *
 * @author sungwoo
 */
@WebServlet(name = "InitLog4j", urlPatterns = {"/shared/InitLog4j"}, loadOnStartup = 1)
public class InitLog4j extends HttpServlet {

    private static final String logPath = "/WEB-INF/logs/error.log";

    public void init() {
        FileAppender appender = getAppender(logPath);
        if (appender == null) return;
        initLogger(null, appender, Level.ERROR);
        initLogger(null, appender, Level.DEBUG);
    }
    
    private FileAppender getAppender(String fileName) {
        RollingFileAppender appender = null;
        try {
            appender = new RollingFileAppender(
                    new PatternLayout("%-5p %c %t%n%29d - %m%n"),
                    getServletContext().getRealPath(fileName),
                    true
            );
        } catch (IOException ex) {
            System.out.println(
                "Could not create appender for "
                        + fileName + ":" 
                        + ex.getMessage());
        }
        return appender;
    }
    
    private void initLogger(
            String name,
            FileAppender appender,
            Level level)
    {
        Logger logger;
        if (name == null) {
            logger = Logger.getRootLogger();
        } else {
            logger = Logger.getLogger(name);
        }
        logger.setLevel(level);
        logger.addAppender(appender);
        logger.info("Starting " + logger.getName());
    }
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InitLog4j</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InitLog4j at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
