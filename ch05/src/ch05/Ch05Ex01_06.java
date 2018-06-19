package ch05;

import java.util.Scanner;

public class Ch05Ex01_06 {
	public static void main(String[] args) {
		int[] num = new int[10];
		
		
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
			int min = num[0];
			if(num[i] < min) {
				min = num[i];
			}
			if(i == arr.length -1) {
				System.out.print(min);
				
			}
		}
	}
}
