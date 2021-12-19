package com.vandu.beans;

import org.springframework.stereotype.Component;

@Component("UI")

public class UICourseMaterial implements ICourseMaterial {
	UICourseMaterial(){
		System.out.println("javaCourseMaterial 0-param constructor");
	}
	@Override
	public String courseContent() {
		System.out.println("UICourseMaterial.courseContent()");
		return "oops, collection, reflection Api,";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 4000;
	}

}
