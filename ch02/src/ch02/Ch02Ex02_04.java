package ch02;

import java.util.*;

public class Ch02Ex02_04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num, num1, num2, num3;
		
		String input = scanner.nextLine();
		num = Integer.parseInt(input);
		String input1 = scanner.nextLine();
		num1 = Integer.parseInt(input1);
		
		String input2 = scanner.nextLine();
		num2 = Integer.parseInt(input2);
		String input3 = scanner.nextLine();
		num3 = Integer.parseInt(input3);
		
		int a = num - num1;
		System.out.printf("%d - %d = %d%n", num, num1, a);
		int b = num2 - num3;
		System.out.printf("%d - %d = %d%n", num2, num3, b);
				
		
	}
}
