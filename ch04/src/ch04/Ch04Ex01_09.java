package ch04;

import java.util.Scanner;

public class Ch04Ex01_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		String input = scanner.next();
		String input1 = scanner.next();
		String input2 = scanner.next();
		
		int num = Integer.parseInt(input);
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int result;
		
		result = num > num1 ? (num1 < num2 ? num1 : num2) : (num < num2 ? num : num2);
			
		System.out.println(result);
		
	}
}
