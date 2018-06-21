package ch05;

import java.util.Scanner;

public class Ch05EX02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] arr = scanner.nextLine().split(" ");
		double num[] = new double[arr.length];
		double sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			num[i] = Double.parseDouble(arr[i]);
			sum += num[i];
		}
		
		System.out.printf("%.1f", sum / arr.length);
		
	}
}
