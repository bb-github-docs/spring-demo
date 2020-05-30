package com.example.demo.employee;

public class Employee {

	private String empID;
	private String empFullName;
	private String empDept;
	
	public Employee() {
		
	}
	
	public Employee(String empID, String empFullName, String empDept) {
		super();
		this.empID = empID;
		this.empFullName = empFullName;
		this.empDept = empDept;
	}
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	public String getEmpFullName() {
		return empFullName;
	}
	public void setEmpFullName(String empFullName) {
		this.empFullName = empFullName;
	}
	
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
}
