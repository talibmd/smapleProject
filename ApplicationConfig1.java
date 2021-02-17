package com.src;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig1 {
	@Bean(name="EmpSetterBean")
	public Employee getEmployee()
	{
		List <EAddress> l=new ArrayList<EAddress>();
		Employee e=new Employee();
		e.setEid(420);
		e.setEname("talib");
		e.setExperience(1);
		//first address
		EAddress ea1=new EAddress();
		ea1.setHno(259);
		ea1.setCity("kushinagar");
		ea1.setState("UP");
		ea1.setCountry("INDIA");
		EAddress ea2=new EAddress();
		ea2.setHno(123);
		ea2.setCity("kasya_kushinagar");
		ea2.setState("UP");
		ea2.setCountry("INDIA");
		l.add(ea1);
		l.add(ea2);
		e.setAddress(l);
		return e;
		
	}
	@Bean(name="EmpConstructorBean")
	public Employee getEmployeee()
	{
		List <EAddress> l2=new ArrayList<EAddress>();
		l2.add(new EAddress(259,"kushinagar","UP","INDIA"));
		l2.add(new EAddress(123,"kasya_kushinagar","UP","INDIA"));
		return new Employee(456,"xyz",1,l2); 
	}
}
