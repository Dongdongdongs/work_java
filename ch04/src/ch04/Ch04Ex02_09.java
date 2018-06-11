package ch04;

import java.util.Scanner;

public class Ch04Ex02_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int count = 0;
		double avg = 0;
		for(;;) {
			String input = scanner.next();
			num = Integer.parseInt(input);
			if(num <= 100) {
			sum += num;
			count++;
		} else{
			break;
		}
		
		}
		avg = (double)sum / count;
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f",avg);
	}
}
