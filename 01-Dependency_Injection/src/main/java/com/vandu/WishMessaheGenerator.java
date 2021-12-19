package com.vandu;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessaheGenerator {
	@Autowired
	private LocalDateTime date;
	 
public String generateWishMessage(String user) {
	System.out.println("generateWishMessage() date:: "+date);
	int hour=date.getHour();
	if(hour<12)
		return "good morning" +user;
	else if(hour<16)
		return "good afternoon "+user;
	else if(hour<18)
		return "good evening "+user;
	else
		return "good night "+user;
	
	
}

}
