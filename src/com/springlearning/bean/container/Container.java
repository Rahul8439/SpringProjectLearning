package com.springlearning.bean.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import start.springlearning.Class1;

public class Container {

	
	public static void main(String[] args) {
		//Singleton Scope-For Each request only single object is created.
		//Protoype Scope-For each required new object is created.
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/Spring.xml");
		Class1 c=(Class1) ap.getBean("c");
		System.out.println(c.getName());
		
		Class1 c1=(Class1) ap.getBean("c");
	}

}
