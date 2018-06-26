package ch06;

public class PersonTest {
	public static void main(String[] args) {
		// 1. 사람 3명(객체 3개) 만들기
		
		// 2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		// (자기 자신을 포함해서 옆사람 정보 작성하기)
		
		// 3. person 클래스에서 만든 메서드를 각 사람(객체)마다 호출하세요
		// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		
		Person[] person = new Person[3];
		for(int i = 0; i < person.length; i++) {
			person[i] = new Person();
		}
		
		person[0].age = 25;
		person[0].name = "카이";
		person[0].post = "서울 구로";
		
		person[1].age = 27;
		person[1].name = "레이";
		person[1].post = "경기 부천";
		
		person[2].age = 30;
		person[2].name = "카라";
		person[2].post = "인천 남동구";
		
		for(int i = 0; i < person.length; i++) {
			person[i].talk();
		}
	}
}
