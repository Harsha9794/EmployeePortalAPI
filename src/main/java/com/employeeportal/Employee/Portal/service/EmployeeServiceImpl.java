package com.employeeportal.Employee.Portal.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.employeeportal.Employee.Portal.bean.Employee;
import com.employeeportal.Employee.Portal.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private static final Logger logger= LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	private EmployeeRepository empRepo;
	

	@Override
	public List<Employee> getEmployees() {
		
		List<Employee> emp=new ArrayList<Employee>();
		try {
			logger.info("Inside getEmployees method of EmployeeServiceImpl class");
			emp=empRepo.getEmployees();
		} catch (Exception e) {
			logger.error("Exception at getEmployees method of EmployeeServiceImpl class", e);
		}
		return emp;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		Employee addEmp= new Employee();
		try {
			logger.info("Inside addEmployee method of EmployeeServiceImpl class");
			addEmp=empRepo.save(emp);
		} catch (Exception e) {
			logger.error("Exception at addEmployee method of EmployeeServiceImpl class", e);
		}
		return addEmp;
	}

}
