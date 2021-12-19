package com.vandu.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("java")
//@Primary
public class JavaCourseMaterial implements ICourseMaterial {
JavaCourseMaterial(){
	System.out.println("javaCourseMaterial 0-param constructor");
}
	@Override
	public String courseContent() {
System.out.println("javaCourseMaterial.courseContent()");

		return "oops, collection, reflection Api,";
	}

	@Override
	public double price() {
		System.out.println("javaCourseMaterial.price()");
		return 3000;
	}

}
