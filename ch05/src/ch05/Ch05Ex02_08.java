package ch05;

import java.util.Scanner;

public class Ch05Ex02_08 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[100];
		int count = 0, sum = 0;
		double avg = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
			
			if(num[i] %5 == 0 && num[i] != 0) {
				sum += num[i];
				count++;
			} else if(num[i] == 0) {
				break;
			}
		}
		
		System.out.println("Multiples of 5 : " + count);
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double)sum / count);
	}
}
