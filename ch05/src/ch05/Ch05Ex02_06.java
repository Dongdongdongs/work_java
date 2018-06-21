package ch05;

import java.util.Scanner;

public class Ch05Ex02_06 {
	public static void main(String[] args) {
		char[] apple = {'A', 'P', 'P', 'L', 'E', '!'};

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char ch = input.charAt(0);

		for(int i = 0; i < apple.length; i++) {
			if(apple[i] == ch) {
				System.out.print(i);
				break;
			}
		}
		for(int i = 0; i < apple.length; i++) {
			if(apple[i] != ch) {
				System.out.println("none");
			}
		}
	}
}