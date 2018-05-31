package ch03;

import java.util.Scanner;

public class Ch03Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		int num1 = Integer.parseInt(input1);
		
		System.out.printf("%d / %d = %d...%d", num, num1, num/num1, num%num1);
		
	}
}
