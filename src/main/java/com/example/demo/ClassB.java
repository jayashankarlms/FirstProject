package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class ClassB implements InterfaceA{

	@Override
	public void draw() {
		System.out.println("sysout from classB");
	}

}
