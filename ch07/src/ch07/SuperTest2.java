package ch07;

class SuperTest2 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2 {
	int x = 10;
}

class Child2 extends Parent2{
	int x = 20;
	
	void method() {
		System.out.println("x = " + x);					//  
		System.out.println("this.x = " + this.x);		// Child x 의 주소를 따라가서 x를 가져옴
		System.out.println("super.x = " + super.x);		// 부모의 x 값을 바로 가져옴
	}
}
