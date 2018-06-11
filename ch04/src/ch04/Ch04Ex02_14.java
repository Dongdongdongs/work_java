package ch04;

import java.util.Scanner;

public class Ch04Ex02_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		String input1 = scanner.next();
		
		int x = Integer.parseInt(input);
		int y = Integer.parseInt(input1);
		int z = x;
		for(int i = 1; i <= 9; i++) {	// 새로
			for(int j = 1; j <= z - y + 1; j++) {	// 가로
				
				System.out.printf("%d * %d = %2d\t", x, i, x * i);
				if(x > y)
					x--;
			}
			System.out.println();
			x += z - y;
		}
	}
}
