package ch04;

import java.util.Scanner;

public class Ch04Ex02_08 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int odd = 0, even = 0;
	
	for(;;) {
		String input = scanner.next();
		int num = Integer.parseInt(input);
			if(num != 0) {
				if(num % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			} else if(num == 0) {
				break;
			}
	}
	System.out.println("odd : "+odd);
	System.out.println("even : "+even);
}
}
