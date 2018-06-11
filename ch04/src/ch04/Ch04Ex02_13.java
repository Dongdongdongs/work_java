package ch04;

import java.util.Scanner;

public class Ch04Ex02_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		String input = scanner.next();
		String input1 = scanner.next();
		x = Integer.parseInt(input);
		y = Integer.parseInt(input1);
		
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= y; j++) {
				
				System.out.printf("%d ", i * j);
				if(j % 4 == 0) {
					System.out.println();
				}
			}
		}
				

		
	}
}
