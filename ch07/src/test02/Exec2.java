package test02;

public class Exec2 {
	//Dog 클래스를 생성
	//Action interface 구현하여
	// printObject로 정보를 찍어보쟈
	public static void printObject(Action p) {
		p.sleep();
		p.run();
		p.walk();
	}
	
	public static void main(String[] args) {
		Person person = new Person("홍길동", 33);
		printObject(person);
		Cat c = new Cat("동동이", 22);
		printObject(c);
		
		Dog d = new Dog("아담", 7);
		printObject(d);
		/*Action a = new Person("홍길동", 33);
		a.run();
		a.sleep();
		a.walk();
		
		
		a = new Cat("동동이", 5);
		a.run();
		a.sleep();
		a.walk();*/
	}
}
