package ch04;

import java.util.Scanner;

public class Ch04Ex02_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		int count = 0;
		for(;;) {
			String input = scanner.next();
			num = Integer.parseInt(input);
			if(num % 3 != 0 && num % 5 != 0) {
				count++;
			} else if(num == 0) {
				break;
			}
			
		}
		System.out.println(count);
	}
}
