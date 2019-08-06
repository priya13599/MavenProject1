package com.nucleus;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("Springconfig.xml");
		
		Student s1=(Student)context.getBean("s1");
    	System.out.println(s1.getStudentid()+ " "+s1.getStudentname());
    	Student s2=(Student)context.getBean("s2");
    	System.out.println(s2.getStudentid()+ " "+s2.getStudentname());
    	s2.setStudentname("abc");
    	System.out.println(s2.getStudentid()+ " "+s2.getStudentname());
	}

}
