package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ClassA implements InterfaceA{

	@Override
	public void draw() {
		System.out.println("sysout from classA");
	}

}
