package com.jdc.spring.beans;

import java.util.List;

public class InstanceFactoryMethod {
	
	public List<Integer> names() {
		return List.of(1, 2, 3, 4);
	}
}
