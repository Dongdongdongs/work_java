package ch05;

import java.util.Scanner;

public class Ch05Ex02_04 {
	public static void main(String[] args) {
		int[] num = new int[100];
		
		Scanner scanner = new Scanner(System.in);
		
		String[] arr = scanner.nextLine().split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
				if(num[i] == -1) {
					break;
			}
		}
		if(arr.length < 4) {
			for(int i = 0; i < arr.length - 1; i++) {
				System.out.print(num[i] + " ");
			}
		} else {
			for(int i = arr.length - 4; i <= arr.length - 2; i++) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
