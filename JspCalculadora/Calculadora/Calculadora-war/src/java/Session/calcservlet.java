/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.calcbeanLocal;

/**
 *
 * @author SebastianV
 */
public class calcservlet extends HttpServlet {

    @EJB
    private calcbeanLocal calcbean;

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
            out.println("<title>Servlet calcservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            int num1 = Integer.parseInt(request.getParameter("t1"));
            int num2 = Integer.parseInt(request.getParameter("t2"));
            String opcion = request.getParameter("action");
        if(opcion.equals("SUMA")){
            out.println("<h1>SUMA entre" + num1 + "+"+ num2 +"=" + calcbean.suma(num1, num2) + "</h1>");  
        }else if(opcion.equals("RESTAR")){
            out.println("<h1>RESTAR entre " + num1 + "+"+ num2 + "=" + calcbean.restar(num1, num2) + "</h1>");  
        }else if(opcion.equals("MULTIPLICAR")){
            out.println("<h1>MULTIPLICAR entre " + num1 + "+"+ num2 + "=" + calcbean.multiplicar(num1, num2) + "</h1>");  
        }else if(opcion.equals("DIVIDIR")){
            out.println("<h1>DIVIDIR entre " + num1 + "+"+ num2 + "=" + calcbean.multiplicar(num1, num2) + "</h1>");  
        }else if(opcion.equals("MODULO")){
            out.println("<h1>MODULO entre " + num1 + "+"+ num2 + "=" + calcbean.modulo(num1, num2) + "</h1>");  
        }else if(opcion.equals("CUADRADO")){
            out.println("<h1>CUADRDADO entre " + num1 + "+"+ num2 + "=" + calcbean.cuadrado(num1) + "</h1>");  
        }
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
