/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package area.calculator.controller;

import area.calculator.model.AreaCalculator;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Machi
 */
@WebServlet(name = "AreaCalculatorController", urlPatterns = {"/areacalculator"})
public class AreaCalculatorController extends HttpServlet {
    
     private static final String RESULT_PAGE = "calculationresult.jsp";

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
	
	 try {
	    // parameters are name attributes in view pages
	    // Here we're retrieving form content from index.html
	    Double width  = Double.parseDouble(request.getParameter("width"));
	    Double height  = Double.parseDouble(request.getParameter("height"));
	    String unit = request.getParameter("unit");

	    if (width > 0 && height > 0 ) {
	    // Create a new instance of a model object
	    // For some applications, we would not want to create a new one each time.
	    AreaCalculator ac = new AreaCalculator();
	    // Always a good idea to trim and/or validate input data
	    String area = ac.calculateArea(width, height);
	    String calcunit = ac.getUnit(unit);

	    // Parameters are read only Request object properties, but attributes
	    // are read/write. We can use attributes to store data for use on
	    // another page.
	    request.setAttribute("area", area);
	    request.setAttribute("calcunit", calcunit);
	    
	    	    // This object lets you forward both the request and response
	    // objects to a destination page
	    RequestDispatcher view =
		    request.getRequestDispatcher(RESULT_PAGE);
	    view.forward(request, response);
	    
	    }
	    
	} catch (NullPointerException | NumberFormatException | ServletException ex) {
	
	try (PrintWriter out = response.getWriter()) {
		out.print("<p> You fogot to insert dimesnions</p>");
	}	
    
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
	return "Area Calculator Controller";
    }// </editor-fold>

}
