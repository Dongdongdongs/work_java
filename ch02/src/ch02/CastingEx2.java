package ch02;

public class CastingEx2 {
	public static void main(String[] args) {
		// int형의 정수 10을 byte 타입으로 변경했을 때 -> 정보손실 없음
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> bute] i=%d -> b=%d%n", i, b);
		
		// int형의 정수 300을 byte 타입으로 변경했을 때 -> 정보손실 발생
		// byte의 값의 범위 -128~127 을 초과했기 때문에 정보손실이 발생한다.
		i= 300;
		b = (byte)i;
		System.out.printf("int -> byte] i=%d -> i=%d%n", i, b);	//300을 2진수로 바꾸면 100101100 -> 바이트는 8개의 비트로 이루어져있어서 뒤 8자리만 인식
		// 따라서 101100 이고 -> 이는 10진수로 변경할시 44라는 값이 나오게 됨
		System.out.println("i="+Integer.toBinaryString(i));	// 300을 2진수로 출력
		
		// byte형의 정수 10을 int 타입으로 변경햇을 때 -> 정보손실 없음
		// int 타입의 번위는 -20억 ~ +20억 이기 때문에 정보손실이 없다.
		b= 10;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
		
		// byte형의 정수 -2를 int 타입으로 변경했을 때 - > 정보손실 없음
		// int 타입의 번위는 -20억 ~ +20억 이기 때문에 정보손실이 없다.
		b = -2;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
		
		// 
		System.out.println("i="+Integer.toBinaryString(i));
		
		
	}
}
