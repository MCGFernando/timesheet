/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.timesheet.controller;

import com.cligest.timesheet.dao.EmployeesDAO;
import com.cligest.timesheet.dao.LogCardStateDAO;
import com.cligest.timesheet.domain.Employees;
import com.cligest.timesheet.domain.LogCardState;
import com.cligest.timesheet.domain.LogCardStatePK;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maro.fernando
 */
@WebServlet(name = "EmployeesController", urlPatterns = {"/EmployeesController"})
public class EmployeesController extends HttpServlet {

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
            /* Este código deve ser escrito em service
            */
            String action = request.getParameter("action");
            String jsp = null;
            EmployeesDAO eDAO = new EmployeesDAO();
            out.println("Size ");
            if (action.equals("list")) {
                List<Employees> lista = eDAO.findAll();
                out.println("Size " + lista.size());
                jsp = "employeesListPage.jsp";
                request.setAttribute("lista", lista);
            } else {
                Integer generatedId = -1;
                Integer idEmployee = Integer.valueOf(request.getParameter("idEmployee"));
                String employeeName = request.getParameter("employeeName");
                String sAPCCName = request.getParameter("sAPCCName");
                String ws = request.getParameter("ws");
                Employees e = new Employees(idEmployee, employeeName, sAPCCName, ws);
                generatedId = eDAO.inserir(e);
                
                String idCard = request.getParameter("idCard");
                Integer idCardState = Integer.valueOf( request.getParameter("idCardState"));
                String description = request.getParameter("description");
                Date datetime = new Date();
                
                LogCardStatePK lPK = new LogCardStatePK(idCard, datetime);
                LogCardState l = new LogCardState( lPK, idCardState, e, description);
                LogCardStateDAO lDAO = new LogCardStateDAO();
                lDAO.inserir(l);
                
                
                List<Employees> lista = eDAO.findAll();
                request.setAttribute("lista", lista);
                jsp = "employeesListPage.jsp";
            }

            /*for (Employees e : lista)
             out.println("Employee " + e.getEmployeeName());*/
            request.getRequestDispatcher(jsp).forward(request, response);
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
