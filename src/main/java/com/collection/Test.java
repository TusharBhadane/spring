package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Student;

public class Test {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/collection/collectionconfig.xml");
	        EMP emp1=(EMP) context.getBean("emp1");
	        System.out.println( emp1 );

	}

}
