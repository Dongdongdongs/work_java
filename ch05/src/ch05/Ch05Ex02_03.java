package ch05;

import java.util.Scanner;

public class Ch05Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] arr = scanner.nextLine().split(" ");
		int[] num = new int[arr.length];
		int odd = 0, even = 0;
		
		for(int i = 0; i < arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
			
			if((i + 1) % 2 != 0) {
				odd += num[i];
			} else {
				even += num[i];
			}
		}
		System.out.println("odd = " + odd);
		System.out.println("even = " + even);
	}
}
