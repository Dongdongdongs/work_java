package test02;

public class Person implements Action {
	
	private String name;
	private int age;
	
	public static void pr(Object o) {
		System.out.println(o);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Override			// 어노테이션, 주석
	public void sleep() {
		pr(this.name + "님이 잡니다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		pr(this.name + "님이 뜁니다..");
		// TODO Auto-generated method stub

	}

	@Override
	public void walk() {
		pr(this.age + "살" + this.name + "님이 걷습니다..");
		// TODO Auto-generated method stub

	}

	@Override
	public void wakeUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void breakUp() {
		// TODO Auto-generated method stub

	}

}
