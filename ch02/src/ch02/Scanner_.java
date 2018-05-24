package ch02;

import java.util.*;

public class Scanner_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("두자리 정수를 입력하시오.>");
		String input = Scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.printf("10진수=%d%n", num);
		System.out.printf("8진수=%o%n", num);
		System.out.printf("16진수=%x%n", num);
		
		
		
	}

}
