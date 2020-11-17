package com.employeeportal.Employee.Portal.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Component
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String gender;
	@NotNull
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateOfBirth;
	@NotNull
	private String department;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String firstName, String lastName, String gender, Date dateOfBirth, String department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
	}
		
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", department=" + department + "]";
	}
	
	

}
