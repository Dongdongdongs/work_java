package ch03;

public class OperatorEx21 {
	public static void main(String[] args) {
		// 같은 타입으로 변경하여 비교한다 10.0f == 10.f와 같다.
		System.out.printf("10 == 10.f	\t %b%n", 10==10.0f);
		
		// 문자 '0'의 아스키 코드값인 48과 비교, 48 == 0 의 결과는 false
		System.out.printf("'0' == 0		\t %b%n", '0'==0);
		
		// 문자 'A'의 아스키 코드값인 65와 비교. 65 == 65의 결과는 ture
		System.out.printf("'A' == 65	\t %b%n", 'A'==65);
		
		// 각 문자의 아스키 고드값과 비교. 65 > 66의 결과는 false
		System.out.printf("'A' > 'B'	\t %b%n", 'A' > 'B');
		
		// 컴파일 단계에서 'A'+1 은 'B'로 치환. 각 문자의 아스키 코드값으로 비교. 66 != 66의 결과는 flase
		System.out.printf("'A'+1 != 'B'	\t %b%n", 'A'+1 != 'B');
		
		
	}
}
