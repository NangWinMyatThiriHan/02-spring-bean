package com.jdc.spring.beans;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanCreationWithXMLContext {
	
	@Test
	void test() {
		
		try(var context = new GenericXmlApplicationContext("classpath:/beans.xml")) {
			
//			var service = context.getBean(MyServiceWithConstructorArgs.class);			
			var service1 = context.getBean("service1", MyServiceWithConstructorArgs.class);
			var service2 = context.getBean("service2", MyServiceWithConstructorArgs.class);
			System.out.println(service1.showMessage());
			System.out.println(service2.showMessage());		
			
//			var service1 = context.getBean("service1");
//			if(service1 instanceof MyServiceWithConstructorArgs ser) {
//				System.out.println(ser.showMessage());
//			}
		}		
	}
}
