package ch05;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		
		for(int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			
			if(num >= 1000) {
				return;
			}
		}
		if(numbers.length != 10) {
			return;
		}
		int min = Integer.parseInt(numbers[0]);
		
		for(int i = 1; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			
			min = min < num ? min : num;
		}
		System.out.println(min);
	}
}
