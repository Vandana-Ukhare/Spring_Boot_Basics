package com.vandu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.vandu.beans.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx= SpringApplication.run(Application.class, args);
		//get target class obj
		Student stud=ctx.getBean("stud",Student.class);
		//invoke business method
		stud.preperation("CTC");
		((ConfigurableApplicationContext) ctx).close();
	}

}
