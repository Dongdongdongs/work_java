package ch03;

public class OperatorEx09 {
public static void main(String[] args) {
	long a = 1_000_000 * 1_000_000;		// int형 * int형 = int형
	long b = 1_000_000 * 1_000_000L;	// int형 * long형 = long형 -> 자동형변환 일어남
	
	System.out.println("a="+a);		// 비정상출력
	System.out.println("b="+b);		// 정상출력
	}
}
