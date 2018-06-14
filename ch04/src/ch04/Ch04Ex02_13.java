package ch04;

import java.util.Scanner;

public class Ch04Ex02_13 {
	public static void main(String[] args) {
		// 1.행과 열을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int row = Integer.parseInt(numbers[0]);
		int col = Integer.parseInt(numbers[1]);
		
		// 2. 입력받은 행과 열을 이용해 틀을 만든다.
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= col; j++) {
				System.out.print(j * i + " ");
			}
			System.out.println();
		}
		
/*		int x = 0;
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
		}*/
	}
}
