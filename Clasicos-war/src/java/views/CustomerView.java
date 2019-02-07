/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.CustomersFacadeLocal;

/**
 *
 * @author Daniel
 */
public class CustomerView extends HttpServlet {

    @EJB
    private CustomersFacadeLocal customersFacade;

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
            out.println("<head>");
            out.println("<link href=\'https://fonts.googleapis.com/icon?family=Material+Icons\' rel=\'stylesheet\'>");
            out.println("<link type='text/css' rel='stylesheet' href='css/materialize.min.css'  media='screen,projection'/>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'/>");
            
            out.println("<title>Servlet Customers</title>");            
            out.println("</head>");
            
            out.println("<nav>");
            out.println("<div class='nav-wrapper' style='background-color: #1565c0'>");
            out.println("<a href='#' class='brand-logo'>Logo</a>");
            out.println("<ul id='nav-mobile' class='right hide-on-med-and-down'>");
            out.println("<li><a href='sass.html'>Sass</a></li>");
            out.println("<li><a href='sass.html'>Sass</a></li>");
            out.println("<li><a href='sass.html'>Sass</a></li>");
            out.println("<li><a href='sass.html'>Sass</a></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</nav>");
            
            
            
            out.println("<body>");
            out.println("<h1>Servlet Customers at " + request.getContextPath() + "</h1>");
            //Tabla para mostrar los datos
            out.println("<table class='highlight'>");
            List<entidades.Customers> cu = customersFacade.findAll();
            for (int i = 0; i < cu.size(); i++) {
            out.println("<tr>");
                out.println("<td>");
                out.println(cu.get(i).getCustomerNumber());
                out.println("</td>");
                out.println("<td>");
                out.println(cu.get(i).getCustomerName());
                out.println("</td>");
                out.println("<td>");
                out.println(cu.get(i).getContactLastName());
                out.println("</td>");
                out.println("<td>");
                out.println(cu.get(i).getContactFirstName());
                out.println("</td>");
                out.println("<td>");
                out.println(cu.get(i).getPhone());
                out.println("</td>");
                out.println("<td>");
                out.println(cu.get(i).getAddressLine1());
                out.println("</td>");
                out.println("<td>");
                out.println(cu.get(i).getAddressLine2());
                out.println("</td>");
                out.println("<td>");
                out.println(cu.get(i).getCity());
                out.println("</td>");
                out.println("<td>");
                out.println(cu.get(i).getState());
                out.println("</td>");
                out.println("<td>");
                out.println(cu.get(i).getPostalCode());
                out.println("</td>");
                out.println("<td>");
                out.println(cu.get(i).getCountry());
                out.println("</td>");
                out.println("<td>");
                out.println(cu.get(i).getSalesRepEmployeeNumber());
                out.println("</td>");
                out.println("<td>");
                out.println(cu.get(i).getCreditLimit());
                out.println("</td>");
                out.println("<td>");
                out.println("<a class='waves-effect waves-light btn'>Modificar</a>");
                out.println("</td>");
                out.println("<td>");
                out.println("<a class='waves-effect waves-light btn'>Eliminar</a>");
                out.println("</td>");
            out.println("</tr>");
            }
            out.println("</table");
            
            out.println("");
            out.println("");
            out.println("");
            out.println("");
            out.println("");
            
            
            
            out.println("<script type='text/javascript' src='https://code.jquery.com/jquery-3.2.1.min.js'></script>");
            out.println("<script type='text/javascript' src='js/materialize.min.js'></script>");
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
