package com.employeeportal.Employee.Portal.service;

import java.util.List;
import com.employeeportal.Employee.Portal.bean.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees(); 
	public Employee addEmployee(Employee emp);

}
