package com.cts.employeemanagementsystem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.employeemanagementsystem.service.LoginService;
import com.cts.employeemanagementsystem.service.LoginServiceImpl;
import com.cts.employeemanagementsystem.service.employeeService;
import com.cts.employeemanagementsystem.service.employeeServiceImpl;

/**
 * Servlet implementation class EmployeeRegistrationServlet
 */
public class EmployeeRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String empId = request.getParameter("empid");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		int salary = Integer.parseInt(request.getParameter("salary"));

		System.out.println("Employee ID: "+ empId);
		System.out.println("FirstName: " + firstName);
		System.out.println("LastName: " +lastName);
		System.out.println("Salary: " +salary);
		
		employeeService empService = employeeServiceImpl.getInstance();
		empService.insert(empId,firstName,lastName,salary);
	}
	
	

}
