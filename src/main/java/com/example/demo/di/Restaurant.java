package com.example.demo.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

//	 직접 필요한 객체를 입력받는 방식
//	Chef chef = new 백종원();
	
	// 필요한 객체를 주입받는 방식
	@Autowired
	Chef chef;
	
	public Chef getChef() {
		return chef;
	}
}
