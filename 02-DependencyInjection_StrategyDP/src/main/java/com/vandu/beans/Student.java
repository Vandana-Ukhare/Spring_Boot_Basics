package com.vandu.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {

	@Autowired
	//@Qualifier("java")
	private ICourseMaterial material;
	
	Student(){
		System.out.println("Student 0-param constructor");
	}
	
	public void preperation(String ExamName) {
		System.out.println("Student.preperation()");
		String courseContent=material.courseContent();
		Double price=material.price();
		System.out.println(ExamName+" exam preperation started using "+courseContent+ " course Content with price "+price);
		System.out.println("preperation Complete");
		
	}

	}


