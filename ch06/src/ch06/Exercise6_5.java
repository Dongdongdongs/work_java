package ch06;

class Exercise6_5 {
	public static void main(String args[]) {
		Student s = new Student("홍길동",1,1,100,60,76);
		System.out.println(s.info());
	}
}
class Student {
	String name;
	int a;
	int b;
	int c;
	int d;
	int e;
	
	Student(String name, int a, int b, int c, int d, int e){
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}
	
	String info() {
		return name+ "," + a + "," + b + "," + c+ "," + d +","+ e +
				","+(c+d+e)+","+
				(int)((c+d+e)/3f * 10 + 0.5f) / 10f ;
	}
}