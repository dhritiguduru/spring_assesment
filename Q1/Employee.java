package com.infotech;

public class Employee {
	int empID;
	String empName;
	int empSal;
	public Employee() {
		super();
	}
	public Employee(int empID, String empName, int empSal) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSal = empSal;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	

}
