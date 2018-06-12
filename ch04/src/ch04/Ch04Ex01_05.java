package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*String input = scanner.next();
		String input1 = scanner.next();
		
		double num = Double.parseDouble(input);
		double num1 = Double.parseDouble(input1);
		*/
		
		String[] numbers = scanner.nextLine().split(" ");
		double num = Double.parseDouble(numbers[0]);
		double num1 = Double.parseDouble(numbers[1]);
		
		
		if(num >= 4.0 && num1 >= 4.0) {
			System.out.println("A");
		} else if(num >= 3.0 && num1 >= 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		
		
	}
}
