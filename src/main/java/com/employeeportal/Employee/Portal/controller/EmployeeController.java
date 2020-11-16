package com.employeeportal.Employee.Portal.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeeportal.Employee.Portal.bean.Employee;
import com.employeeportal.Employee.Portal.response.RegisterResponse;
import com.employeeportal.Employee.Portal.service.EmployeeService;
import com.employeeportal.Employee.Portal.service.EmployeeServiceImpl;
 
@CrossOrigin(origins="*")
@RestController
public class EmployeeController {
	
	private static final Logger logger= LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/employeelist")
	public ResponseEntity<List<Employee>> getEmployees() {
		List<Employee> employee= new ArrayList<Employee>();
		try {
			logger.info("Inside getEmployees method of EmployeeController class");			
			employee=empService.getEmployees();
		}catch (Exception e) {
			logger.error("Exception at getEmployees method of EmployeeController class", e);
		}
		return new ResponseEntity<List<Employee>>(employee,new HttpHeaders(),HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public RegisterResponse addEmployee(@RequestBody Employee emp) {
		String status="";
		Employee employee= new Employee();
		try {
	    logger.info("Inside addEmployee method of EmployeeController class");
		employee=empService.addEmployee(emp);
		status="Registered Successfully";
		}catch (Exception e) {
			logger.error("Exception at addEmployee method of EmployeeController class", e);
			e.printStackTrace();
			status="Registration Failed";
		}
		return new RegisterResponse(employee.getId(),status);
	}

}
