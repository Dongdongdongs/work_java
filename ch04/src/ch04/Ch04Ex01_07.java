package ch04;

import java.util.Scanner;

public class Ch04Ex01_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		/*char grade = scanner.nextLine().charAt(0);*/
		// 문자(char)는 작은 따옴표, 문자열(String)은 큰따옴표 
		
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