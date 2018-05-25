package ch02;

import java.util.*;

public class Scanner_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Scanner를 이용해서 2자리 정수를 입력받으세요
		Scanner Scanner = new Scanner(System.in);
		System.out.println("두자리 정수를 입력하시오.>");
		//String input = Scanner.nextLine();
		//int num = Integer.parseInt(input);	// 입력받은 문자열을 숫자로 변환
		
		int num = Scanner.nextInt();	//입력받은 문자열을 정수(int)로 받아 전달 
		int num2 = Scanner.nextInt();	//입력받은 문자열을 정수(int)로 받아 전달
		
		/* 2. 입력받은 정수를 printf 메소드를 이용해서 
		 * 10진수, 8진수, 16진수로 출력하세요 */
		System.out.printf("10진수=%d%n", num);
		System.out.printf("8진수=%o%n", num);
		System.out.printf("16진수=%x%n", num);
		
		System.out.printf("10진수 = %d, 8진수 = %o, 16진수 = %x", num, num, num);
		
		
	}

}
