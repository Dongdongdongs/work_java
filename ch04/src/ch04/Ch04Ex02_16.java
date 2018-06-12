package ch04;

import java.util.Scanner;

public class Ch04Ex02_16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int x = Integer.parseInt(input);
		char ch = 'A';
		char ch1 = '0';
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= x; j++) {
				if(i == 2 && j == x) {
					System.out.printf("%s", ch1);
					ch1 = ch1 += 1;
					}
				System.out.printf("%s", ch);
				ch = ch += 1;
				
			}System.out.println();
		}
			
	}
}
