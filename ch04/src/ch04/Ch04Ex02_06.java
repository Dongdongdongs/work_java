package ch04;

import java.util.Scanner;

public class Ch04Ex02_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for(;;) {
			System.out.println("1.Korea");
			System.out.println("2.USA");
			System.out.println("3.Japan");
			System.out.println("4.China");
			System.out.print("number?");
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		if(1 <= num && num <= 4) {
			if(num == 1) {
				System.out.println("Seoul");
			} else if(num == 2) {
				System.out.println("Washington");
			} else if(num == 3) {
				System.out.println("Tokyo");
			} else if(num == 4) {
				System.out.println("Beijing");
			}
		} else {
			System.out.println("none");
			break;
		}
		
		}
	}
}
