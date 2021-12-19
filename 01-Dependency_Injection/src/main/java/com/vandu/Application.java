package com.vandu;

import java.io.PrintStream;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	@Bean(name = "ldt") 
	public LocalDateTime generateLocalDateTime() {
		System.out.println("Application.createLocalDateTime()");
		LocalDateTime ldt= LocalDateTime.now();
		return ldt;
	}
	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx= SpringApplication.run(Application.class, args);
		//get target spring bean class obj from IOC container
		WishMessaheGenerator generator=ctx.getBean("wmg",WishMessaheGenerator.class);
		//invoke method
		String result=generator.generateWishMessage("sakshi");
		System.out.println(result);
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
