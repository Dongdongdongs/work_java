package ch06;

public class Person {
	// 속성(인스턴스 변수)
	// 1. 이름
	// 2. 나이
	// 3. 주소
	
	// 행동(메서드)
	// 1. 자기소개
	// "저는 [나이]살 [주소]에 사는 [이름]입니다."
	
	String name;
	int age;
	String post;
	
	// [2-1] 이름, 나이, 주소 인스턴스 변수를 초기화하는 생성자를 작성하시오
	Person(String name, int age, String post){
		this.name = name;
		this.age = age;
		this.post = post;
	}
	// [2-3] 이름만 입력받는 생성자를 작성하시오.
	// 단, 나이와 주소값은 각각 기본으로 19, "없음" 값으로 초기화하는 생성자를 작성하시오
	Person(){
		this("guy", 25, "서울");
	}
	
	Person(String name){
		this(name, 19, "없음");
	}
	
	Person(int age){
		this("son", age, "인천");
	}
	
	void talk() { 
		System.out.printf("저는 %d살 %s에 사는 %s입니다.%n", age, post, name);
	}
}
