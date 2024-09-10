package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RestaurantTest {

//	Restaurant restaurant = new Restaurant();
//	
//	Chef chef = new 이연복();
	
	@Autowired
	Restaurant restaurant;
	
	@Autowired
	Chef chef;
	
	@Test
	void 테스트() {
		System.out.println("restaurant: " + restaurant);
		System.out.println("chef: " + chef);
		System.out.println("getChef(): " + restaurant.getChef());
		// 같은 인스턴스로 바뀜
	}
}
