package ch07;

/*
 * 오버로딩(Overloadig) : 기존에 없는 새로운 메서드를 정의하는 것 (새로운 메서드)
 * 오버라이딩(Overriding) : 상속받은 메서드의 내용을 변경하는 것 (재정의한 메서드)
 * 
 * 오버라이딩의 조건
 *  - 메서드 이름이 같아야 한다.
 *  - 매개변수(파라메터)가 같아야 한다.
 *  - 반환타입이 같아야 한다.
*/

class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent {
	int x = 10;
	
	// 기본생성자
	Parent() {
		System.out.println("Parent 기본생성자 호출!");
	}
}

class Child extends Parent{
	
	//기본생성자
	Child(){
		System.out.println("Child 기본생성자 호출!");
	}
	// 자식은 부모의 값을 받는게 아니라 주소를 받는다
	void method() {
		System.out.println("x = " + x);					//  
		System.out.println("this.x = " + this.x);		// Child x 의 주소를 따라가서 x를 가져옴
		System.out.println("super.x = " + super.x);		// 부모의 x 값을 바로 가져옴
	}
}
