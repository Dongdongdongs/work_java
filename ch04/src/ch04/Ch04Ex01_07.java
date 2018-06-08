package ch04;

import java.util.Scanner;

public class Ch04Ex01_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		switch(input) {
		case "A" :
			System.out.println("Excellent");
			break;
		case "B" :
			System.out.println("GOOD");
			break;
		case "C" :
			System.out.println("Usually");
			break;
		case "D" :
			System.out.println("Effort");
			break;
		case "F" :
			System.out.println("Failure");
			break;
			default :
				System.out.println("error");
				
				break;
		}
	}
}