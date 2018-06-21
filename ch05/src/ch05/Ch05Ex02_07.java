package ch05;

import java.util.Scanner;

public class Ch05Ex02_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		String[] arr = new String[100];
		int num[] = new int[arr.length];
		int num1 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextLine();
			num[i] = Integer.parseInt(arr[i]);
			
			if(num[i] == 999) {
				num1 = i; 
				break;
			}
		}
		int max = num[0];
		int min = num[0];
		
		for(int i = 0; i < num1- 1; i++) {
			if(num[i] > max) {
				max = num[i];
			} else if(num[i] < min) {
				min = num[i];
			}
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
