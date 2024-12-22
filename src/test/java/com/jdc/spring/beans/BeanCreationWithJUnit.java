package com.jdc.spring.beans;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:/beans.xml")
public class BeanCreationWithJUnit {
	
	@Autowired
	private MyService service;
	
	@Autowired
	private String applicationName;
	
	@Autowired
	private List<Integer> names;
	
	@Test
	void test() {
		System.out.println(service.message());
		System.out.println(applicationName);
		System.out.println(names);
	}
}
