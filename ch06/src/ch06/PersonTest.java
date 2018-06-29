package ch06;

public class PersonTest {
	public static void main(String[] args) {
		// 1. 사람 3명(객체 3개) 만들기
		
		// 2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		// (자기 자신을 포함해서 옆사람 정보 작성하기)
		
		// 3. person 클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요
		// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		
		/*Person[] person = new Person[3];
		for(int i = 0; i < person.length; i++) {
			person[i] = new Person("카이", 25, "서울 구로");
		}*/
	
		// [2-2] 아래 방법은 객체를 생성 후 각 인스턴스 변수에 접근하여
		// 값을 초기화 한 부분이다.
		// 아래 부분을 2-1에서 작성한 생성자를 이용하여 변경하오
		// [2-4] 2-3에서 생성한 생성자를 이용하여 "흥민"이라는 이름으로 사람객체 하나를 생성하세요
		// [2-5] 2-4 객체를 이용하여 메서드를 호출
		
		Person p1 = new Person("카이", 25, "서울 구로");
		Person p2 = new Person("레이", 27, "경기 부천");
		Person p3 = new Person("카라", 30, "인천 남동구");
		Person p4 = new Person();
		Person p5 = new Person("흥민");
		Person p6 = new Person(19);
		/*person[0].age = 25;
		person[0].name = "카이";
		person[0].post = "서울 구로";
		
		person[1].age = 27;
		person[1].name = "레이";
		person[1].post = "경기 부천";
		
		person[2].age = 30;
		person[2].name = "카라";
		person[2].post = "인천 남동구";*/
		/*
		for(int i = 0; i < person.length; i++) {
			person[i].talk();
		}*/
		
		p1.talk();
		p2.talk();
		p3.talk();
		p4.talk();
		p5.talk();
		p6.talk();
	}
}
