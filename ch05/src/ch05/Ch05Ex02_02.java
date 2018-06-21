package ch05;

import java.util.Scanner;

public class Ch05Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] arr = scanner.nextLine().split(" ");
		int[] num = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
		}
		
		System.out.print(num[0] + num[2]+ num[4]);
	}
}
