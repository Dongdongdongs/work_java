package ch02;

public class VarEx4 {
	public static void main(String[] args) {
	
		// 리터럴의 타입과 접미사
		int ocnNum = 010;		//8진수 10, 10진수로 8
		int hexNum = 0x10;		//16진수 10, 10진수로 10
		int binNum = 0b10;		//2진수 10, 10진수로 2(JDK 1.7 버전부터 가능)
		
		// 숫자 중간에 _(언더바)는 JDK 1.7버전부터 가능
		long big = 100_000_000_000L;		// long big = 100000000L 
		// long big = 100_000_000_000;  -> 오류남
		// long 타입에는 리터널뒤에 접미사 l, L 을 넣어줘야 함, 기본형이 int 로 인식되기 때문에 롱에서 인트는 안맞음
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;	// long hx = 0xFFFFFFFFFFFFFFFFL;
		
		float pi = 3.14f;		// 접미사 f 대신 f를 사용해도 된다
		double rate = 1.618d;	// 접미사 d 대신 D를 사용해도 되고, 생갹해도 된다.
		// fllat pi = 3.14;		// 에러. float타입 변수에 double타입 리터럴 저장불가
		// double rate = 1.618;	// OK. 접미사 d는 생략할 수 있다.
		// 실수의 기본형은 double 이기때문에 float를 쓸때는 리터널 뒤 에 접미사 f, F를 사용해야함, 기본형이 double로 인식되기 때문에

		//타입의 불일치
		int i = 'A';		// OK. 문자 'A'의 유니코드 인 65가 변수 i에 저장된다. 
		// 인트형이 캐릭터형 보다 범위가 크므로 자동형변환이 일어나서 저장됨
		int L = 123;		// OK. int보다 long타입이 더 범위가 넓다.
		// 롱타입이 인트형보다 범위가 크므로 자동으로 롱타입으로 변경되어서 저장됨
		double d = 3.14f;	// OK. float보다 double타입이 더 범위가 넓다.
		// 더블형이 플롯형 보다 크므로 더블 3.14 로 저장됨
		//int i1 = 0x123456789;	// 에러. int 타입의 범위를 넘는 값을 저장
		// 인트 i 가 중복됨, 0x = 16진수, 16진수 12345689임 10진수로 바꾸면 45억~~ 이므로 범위 초과/ 
		// 롱타입으로 바꿀시 접미사 l 붙여줘야함
		//float f = 3.14;			// 에러. float 타입보다 double 타입의 범위가 넓다.
		// 수정하려면 플롯을 더블로 바꾸거나, 뒤에 접미사 f 를 붙인다
		byte b = 65;			// OK. byte타입에 저장 가능한 범위의 int 리터럴
		// 바이트는 -128 ~ 127 까지 그중에 65가 속하므로 예외로 가능
		short s = 0x1234;		// OK. short 타입에 저장 가능한 범위의 int 리터럴
		
	}
	
}
