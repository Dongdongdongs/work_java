package ch05;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		double[] score = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		double result;
		
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split(" ");
		int[] num = new int[arr.length];
		for(int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
		}
		
		result = (score[num[0] -1] + score[num[1]-1]);
		System.out.printf("%.1f", result);
	}
}
