package test01;


public class ClassTest1 {
	int a;				// 맴버변수
	
	ClassTest1(){
		System.out.println("ct기본");
		System.out.println(a);
	}
	
	ClassTest1(int a){
		System.out.println("ct int 생성자");
	}
	ClassTest1(String s){
		System.out.println("ct String 생성자");
	}
	
	void test1() {
		System.out.println("저는 테스트 함수 입니다.");
	}
	
	void test1(int a) {
		System.out.println("저는 테스트 인트 함수입니다.");
	}
	
	int test1(String s) {
		return 0;
	}
	
	ClassTest1 test(boolean b) {				// 데이터 타입
		return this;
	}
	
	String test(double b) {
		return "abc";
	}
	
	public static void main(String[] args) {				// default, protected
		ClassTest1 ct = new ClassTest1();						//public, private
		ct.test1();
		ct.test1(100);
		
		int a = ct.test1("abc");
		String str = ct.test(1.2);
		
		System.out.println(a);
		System.out.println(str);
	}
	
}
