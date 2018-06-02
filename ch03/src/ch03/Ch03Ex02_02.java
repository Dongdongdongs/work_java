package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//String[] numbers = scanner.nextLine().split(" ");
		//int width = Integer.parseInt(numbers[0]);
		//int length = Integer.parseInt(numbers[1]);
		
		
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		int num1 = Integer.parseInt(input1);
		
		int num2 = num + 5;
		int num3 = num1 * 2;
		int num4 = num2 * num3;
		
		System.out.printf("width = %d%n", num2);
		System.out.printf("length = %d%n", num3);
		System.out.printf("area = %d", num4);
		
		
		
		
	
	}
}
