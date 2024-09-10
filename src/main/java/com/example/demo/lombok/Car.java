package com.example.demo.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {

	String modelName;
	String maker;
	String color;
	
}

/*
 * 2번.
1) 다음과 같이 자동차(Car) 클래스을 설계하세요.
- 속성: 모델명, 제조사, 색
- 기능: 모든 멤버변수의 getter/setter, 디폴트생성자, 모든 멤버변수를 초기화하는 생성자, 자동차 정보를 반환하는 메소드
2) 자동차 인스턴스를 3개 생성하세요.
3) 모든 자동차의 정보를 출력하세요.
 * */