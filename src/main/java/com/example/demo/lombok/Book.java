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
public class Book {

	String title;
	int price;
	String publisher;
	int pageCount;
}

/*
 * 1번.
1) 다음과 같이 도서(Book) 클래스을 설계하세요.
- 속성: 제목, 가격, 출판사, 페이지수
- 기능: 모든 멤버변수의 getter/setter, 디폴트생성자, 모든 멤버변수를 초기화하는 생성자, 도서 정보를 반환하는 메소드
2) 도서 인스턴스를 3개 생성하세요.
- 디폴트 생성자, 전체 생성자, 빌더를 각각 사용하여 생성
3) 모든 도서의 정보를 출력하세요.
 * */