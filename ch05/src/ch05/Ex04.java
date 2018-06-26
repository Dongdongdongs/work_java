package ch05;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[100];

		for(int i = 0; i < num.length; i++) {
			String input = scanner.nextLine();

			num[i] = Integer.parseInt(input);

			if(num[i] == 0) {
				break;
			}
		}

		for(int i = num.length - 2; i >= 0; i--) {
			if(num[i] != 0) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
