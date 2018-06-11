package ch04;

import java.util.Scanner;

public class Ch04Ex02_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int base = 0;
		int height = 0;
		double area = 0;
		String answer;// = null;
		do {
			System.out.print("Base = ");
			String input = scanner.nextLine();
			System.out.print("Height = ");
			String input1 = scanner.nextLine();
			
			base = Integer.parseInt(input);
			height = Integer.parseInt(input1);
			area = (double)base * height / 2;
			
			System.out.printf("Triangle area = %.1f%n", area);
			System.out.print("contine? ");
			answer = scanner.nextLine();
			
		}while(answer.equals("y") || answer.equals("Y"));
	}
}
