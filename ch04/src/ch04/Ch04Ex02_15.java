package ch04;

import java.util.Scanner;

public class Ch04Ex02_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		int i = 0, j = 0, z = 0;
		for(i = 0; i < num; i++) {
			for(j = 0; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
			}
		/*for(i = num; i <= num; i--) {
			for(j = i; j >= 0 ; j--) {
			System.out.printf("*");
		}System.out.println();
		}*/

	}
}

