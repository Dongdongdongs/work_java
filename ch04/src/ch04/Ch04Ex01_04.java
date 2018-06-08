package ch04;

import java.util.Scanner;

public class Ch04Ex01_04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		double weight = Double.parseDouble(input);
		
		if(weight <= 50.80) {
			System.out.println("Flyweight");
		} else if(weight <= 61.23) {
			System.out.println("Lightweight");
		} else if(weight <= 72.57) {
			System.out.println("Middleweight");
		} else if(weight <= 88.45) {
			System.out.println("Cruiserweight");
		} else if(weight > 88.45) {
			System.out.println("Hevyweight");
		}
		
		
	}
}
