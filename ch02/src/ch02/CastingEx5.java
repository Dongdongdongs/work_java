package ch02;

public class CastingEx5 {
	public static void main(String[] args) {
		
		float f = 1234;	//형변환의 생략. float f = (float)1234;와 같음
		
		byte b = (byte)1000;	// 에러. byte의 범위(-128~127)를 넘는 값을 저장.
		// int b = 1000;
		char ch = (char)1000;	// 명시적 형변환. 에러가 발생하지 않는다.
		
		int i = 3;
		double d = 1.0 + i;	// double d = 1.0 + (double)i; 에서 형변환이 생략됨
		
		/*
		 * 자동 형변환의 규칙
		 * byte -> short(char) -> int -> long -> float -> double
		 */
		System.out.println(b);
		System.out.println(ch);
		
		
		
		System.out.println("1"+"2");
		//System.out.println(ture+"");
		System.out.println('A'+'B');
		System.out.println('1'+2);
		System.out.println('1'+'2');
		System.out.println('J'+"ava");
		//System.out.println(true+null);
		
		
	}
}
