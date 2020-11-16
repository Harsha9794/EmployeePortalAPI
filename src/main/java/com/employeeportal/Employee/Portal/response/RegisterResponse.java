package com.employeeportal.Employee.Portal.response;

public class RegisterResponse {

	private int id;
	private String status;
	
	public RegisterResponse(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}
	
	public RegisterResponse() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
