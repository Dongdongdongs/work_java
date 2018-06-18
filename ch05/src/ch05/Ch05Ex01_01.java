package ch05;

import java.util.Scanner;

public class Ch05Ex01_01 {
	public static void main(String[] args) {
		char[] alpha = new char[10];
		
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		
		for(int i = 0; i < input.length; i++) {
			alpha[i] = input[i].charAt(0);
		}
		for(int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i]);
		}
	}
}
