package ch02;

import java.util.*;

public class Ch02Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("kor ");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.printf("mat ");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		
		System.out.printf("eng ");
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		
		int sum = num + num1 + num2;
		System.out.printf("sum %d%n",sum) ;
		
		int avg = (num + num1 + num2)/3;
		System.out.printf("avg %d",avg);		
		
		//System.out.printf("sum %d%n", num1+num2+num3);
	}
}
