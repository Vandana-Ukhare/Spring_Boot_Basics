package com.vandu.beans;

import org.springframework.stereotype.Component;

@Component("python")

public class PythonCourseMaterial implements ICourseMaterial {
	PythonCourseMaterial(){
		System.out.println("javaCourseMaterial 0-param constructor");
	}
	@Override
	public String courseContent() {
		System.out.println("PythonCourseMaterial.courseContent()");
		return "oops, collection, reflection Api,";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 2000;
	}

}
