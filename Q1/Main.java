package com.infotech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appcontext= new ClassPathXmlApplicationContext("Spring/Beans.xml");
		Details details =(Details) appcontext.getBean("details");
		details.printID();
		details.printName();
		details.printSal();

	}

}
