package com.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig1.class);
		Employee e1=(Employee)context.getBean("EmpSetterBean");
		//object using Setter Injection......
		System.out.println("Using setter Injection");
		System.out.println(e1);
		System.out.println("________________________________________________________________");
		//object using Constructor Injection......
		System.out.println("Using Constructor Injection");
		Employee e2=(Employee)context.getBean("EmpConstructorBean");
		System.out.println(e2);
	}

}
