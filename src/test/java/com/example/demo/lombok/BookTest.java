package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookTest {
	
	@Test
	void 북테스트() {
		
		Book book1 = new Book();
		
		book1.setTitle("태훈이의 이상한 나라");
		book1.setPrice(100000);
		book1.setPublisher("배라니컴퍼니");
		book1.setPageCount(350);
		
		System.out.println(book1.getTitle());
		System.out.println(book1.getPrice());
		System.out.println(book1.getPublisher());
		System.out.println(book1.getPageCount());
		
		Book book2 = new Book("성민이의 스프링부트", 2000000, "배라니컴퍼니", 400);
		
		System.out.println(book2.toString());
		
		Book book3 = Book
						.builder()
						.title("누가 내 똥을 옴겼을까?")
						.price(10000000)
						.publisher("주환이")
						.pageCount(780)
						.build();
		System.out.println(book3);
	}

}

/*
 * 1번.
1) 다음과 같이 도서(Book) 클래스을 설계하세요.
- 속성: 제목, 가격, 출판사, 페이지수
- 기능: 모든 멤버변수의 getter/setter, 디폴트생성자, 모든 멤버변수를 초기화하는 생성자, 도서 정보를 반환하는 메소드
2) 도서 인스턴스를 3개 생성하세요.
- 디폴트 생성자, 전체 생성자, 빌더를 각각 사용하여 생성
3) 모든 도서의 정보를 출력하세요.
String title;
int price;
String publisher;
int pageCount;
 * */