package com.employeeportal.Employee.Portal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employeeportal.Employee.Portal.bean.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	@Query(nativeQuery=true,value="select * from employee e order by first_name")
	public List<Employee> getEmployees();

}
