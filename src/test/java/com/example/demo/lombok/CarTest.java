package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarTest {

	@Test
	void 자동차클래스생성테스트() {
	
	Car car1 = new Car();
	
	car1.setModel("소나타");
	car1.setCompany("현대");
	car1.setColor("블랙");
	
	System.out.println(car1.getModel());
	System.out.println(car1.getCompany());
	System.out.println(car1.getColor());
	
	Car car2 = new Car("베뉴", "현대", "그레이");
	System.out.println(car2);
	
	Car car3 = Car.builder()
				  .Model("쏘렌토")
				  .Company("기아")
				  .Color("레드")
				  .build();
	
	System.out.println(car3);
	
	}
}
