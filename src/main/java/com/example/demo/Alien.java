package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component//provision for object creation in spring container
//provision for creating object manually, if not given object created on springApplication.run of main method
//@Scope(value="prototype")
public class Alien {

	private String aid;
	private String aName;
	private String tech;
	
	@Autowired // To access object from spring container(search by type)
	@Qualifier("lap1") //To search object in spring container by name
	private Laptop laptop;
	
	@Autowired
	private InterfaceA interfaceA;
	
	public Alien() {
		System.out.println("Alien class object created");
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public void show() {
		System.out.println("alien class sys out");
		//laptop class method is used
		laptop.display();
		
		interfaceA.draw();
	}
	
}
