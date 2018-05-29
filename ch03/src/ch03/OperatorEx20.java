package ch03;

public class OperatorEx20 {
	public static void main(String[] args) {
		/*
		 * 나머지 연산은 우선 절대값으로 나눈뒤
		 * 마지막 나머지에 부호룰 붙이면 된다.
		 * (나누어 지는 피연산자의 부호를 따른다.)
		 */
		
		System.out.println(-10%8);		// 절대값으로 나누 나머지 2 -> -2
		System.out.println(10%8);		// 절대값으로 나눈 나머지 2
		System.out.println(-10%-8);		// 절대값으로 나눈 나머지 2 -> -2
		System.out.println(10%-8);
	}
}
