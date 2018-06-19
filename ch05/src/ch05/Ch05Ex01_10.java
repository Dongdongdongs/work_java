package ch05;

import java.util.Scanner;

public class Ch05Ex01_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char[] ch = new char[26];
		int[] count = new int[26];
		
		for(int i = 0;; i++) {
			String input = scanner.nextLine();
			ch[i] = input.charAt(0);
			if('A' <= ch[i] && ch[i] <= 'Z') {
				int b = ch[i] - 'A';
				count[b]++;
			} else {
				break;
			}
			
		}
	}
}
