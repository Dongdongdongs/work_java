package ch05;

import java.util.Scanner;

public class Ch05Ex02_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] arr = scanner.nextLine().split(" ");
		int[] num = new int[12];
		int[] num1 = new int[12];
		
		for(int i = 0; i < arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
		}
		for(int i = 0; i < 12; i++) {
			num[i + 2] = (num[i]+num[i+1]) % 10;
			System.out.print(num[i] + " ");
		}
	}
}
