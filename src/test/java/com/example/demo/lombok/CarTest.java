package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarTest {

	@Test
	void 차룩복테스트() {
		
		Car car1 = new Car();
		
		car1.setModelName("haha");
		car1.setMaker("hoho");
		car1.setColor("blue");
		
		System.out.println(car1.getModelName());
		System.out.println(car1.getMaker());
		System.out.println(car1.getColor());
	}
}
