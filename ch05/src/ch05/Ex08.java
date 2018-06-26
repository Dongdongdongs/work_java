package ch05;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split(" ");
		
		int sum = 0, avg = 0, count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(arr[i]);
			
			if(i %2 == 0) {
				avg += num;
				count++;
			} else {
				sum += num;
			}
		}
		System.out.printf("sum : %d%n", sum);
		System.out.printf("avg : %.1f%n", avg / (double)count);
	}
}
