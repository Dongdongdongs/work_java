package test01;

public class ClassTest {
		int a;				// 맴버변수
	
		ClassTest(){
			System.out.println("ct기본");
			System.out.println(a);
		}
		
		ClassTest(int a){
			System.out.println("ct int 생성자");
		}
		ClassTest(String s){
			System.out.println("ct String 생성자");
		}
		public static void main(String[] args) {
			new ClassTest();
			new ClassTest(1);	// 매게변수 데이터 값이 같아
			new ClassTest("1");
			
			ClassTest ct = new ClassTest();
			System.out.println(ct.a);			// . ~의
			ct.a = 10;
			System.out.println(ct.a);
			ct.a = 3;
			System.out.println(ct.a);
			ct.a = 7;
			System.out.println(ct.a);
			ct.a = 2;
			System.out.println(ct.a);
			ct = new ClassTest();
			System.out.println(ct.a);
			
	}
}
