package test01;

public class MethodTest {
	String str = "abc";
	
	// 데이터 타입은 String
	// 함수명은 test()
	// 3개의 동일한 함수며으로 선언과
	// 호출해주시면 됩니다.
	
	String test(String str) {
		return "aaa";
		
	}
	
	String test(int a) {
		return "a+a";
	}
	
	String test(double d) {
		return "d+d";
	}
	public static void main(String[] args) {
		MethodTest mt1 = new MethodTest();
		MethodTest mt2 = new MethodTest();
		System.out.println(mt1 == mt2);				// 
		System.out.println(mt1.str == mt2.str);		// 주소값이 같아서 트루
		
		String a = mt1.test("1");
		System.out.println(a);
		
		String b = mt1.test(1);
		System.out.println(b);
		
		String c = mt1.test(0.1);
		System.out.println(c);
	}
}
