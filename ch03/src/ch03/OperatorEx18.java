package ch03;

public class OperatorEx18 {
	public static void main(String[] args) {
		double pi = 3.141592;		
		/*
		 * Math.round() 메소드
		 * 괄호안의 숫자를 소수 첫째자리에서 반올림 하낟.
		 * 괄호 안에 들어갈 수 있는 숫자는 float, double과 같은 실수만 허용
		 * 이 메소드의 결과값은 long형 이다.
		 * 
		 *  Math.round(3141.592) / 1000.0;
		 *  3142 / 1000.0;	// long형 / double 형
		 *  3.142 (double형)
		 */
		
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);
		
	}
}
