package test02;

public class ObjectTest3 {
	private int age;
	private String name;
	
	ObjectTest3(String str, int num){
		this.name = str;
		this.age = num;
	}
	
	public String toString() {
		return "이름 : " + this.name + ", 나이 : " + this.age;
	}
	public static void main(String[] args) {
		// 생성자를 사용해서
		// 이름 : 홍길동, 나이 : 22
		// 이름 : 이길동, 나이 : 32
		// 이름 : 오길동, 나이 : 42
		
		ObjectTest3 ot1 = new ObjectTest3("홍길동", 22);
		ObjectTest3 ot2 = new ObjectTest3("이길동", 32);
		ObjectTest3 ot3 = new ObjectTest3("오길동", 42);
		
		System.out.println(ot1);
		System.out.println(ot2);
		System.out.println(ot3);
		
		System.out.println(new ObjectTest3("홍길동", 22));
	}
}
