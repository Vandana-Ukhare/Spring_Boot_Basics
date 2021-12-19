package com.vandu.beans;

import org.springframework.stereotype.Component;

@Component("material")

public class DotNetCourseMaterial implements ICourseMaterial {
	DotNetCourseMaterial(){
		System.out.println("DotNetCourseMaterial 0-param constructor");
	}
	@Override
	public String courseContent() {
		System.out.println("DotNetCourseMaterial.courseContent()");
		return "oops, collection, reflection Api,";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 1500;
	}

}
