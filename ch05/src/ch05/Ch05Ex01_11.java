package ch05;

import java.util.Scanner;

public class Ch05Ex01_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[100];
		int i = 0;
		while(true) {
			num[i] = Integer.parseInt(scanner.nextLine());
			
			if(num[i] == 0) {
				break;
			}
			i++;
		}
		for(int j = 0; j < i; j++) {
			
		}
	}
}
