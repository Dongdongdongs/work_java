package ch05;

import java.util.Scanner;

public class Ch05Ex01_08 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int sum = 0;
		double avg = 0;
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
			
			if((i+1) % 2 == 0) {	// 짝수 합 
				sum += num[i];
			} else if((i+1) %2 != 0) {
				avg += num[i];
				count++;
			}
		}
		System.out.printf("sum : %d%n", sum);
		System.out.printf("avg : %.1f", avg/count);
	}
}
