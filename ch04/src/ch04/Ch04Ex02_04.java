package ch04;

import java.util.Scanner;

public class Ch04Ex02_04 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int num = 0;
	int sum = 0;
	int count = 0;
	double avg = 0;
	do {
		count++;
		String input = scanner.next();
		num = Integer.parseInt(input);
		sum += num;
		avg = (double)sum/count;
	} while(num < 100);
	System.out.printf("%d%n%.1f", sum, avg);
	
}
}
