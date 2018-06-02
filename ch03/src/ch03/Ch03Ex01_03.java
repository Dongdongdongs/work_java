package ch03;

import java.util.Scanner;

public class Ch03Ex01_03 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	String input = scanner.nextLine();
	int num = Integer.parseInt(input);
	String input1 = scanner.nextLine();
	int num1 = Integer.parseInt(input1);
	
	// 우변을 먼저 작성후 컨트롤 1 누르면 지역 자동 생성
	//int parseInt = Integer.parseInt(scanner.nextLine());
	
	/*
	 * int a = num++
	 * int b = --num2;
	 * int c = a * b;
	 * 
	 */
	
	int numC = num++*--num1;
	
	System.out.printf("%d %d %d", num, num1, numC);
	
	
	
	
}
}
