package com.infotech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Details {
	
	@Autowired
	@Qualifier("Employee1")
	private Employee employee;
	
	public Details() {
		System.out.println("Details are: ");
	}
	public void printID() {
	      System.out.println("Employee ID: " +employee.getEmpID());
	}
	public void printName() {
	      System.out.println("Employee Name : " + employee.getEmpName());
	   }
	public void printSal() {
	      System.out.println("Employee Salary : " + employee.getEmpSal());
	   }
	
	}
	


