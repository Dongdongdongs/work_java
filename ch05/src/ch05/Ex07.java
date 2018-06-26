package ch05;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(arr[i]);
			
			if(!(1 <= num && num < 10000)) {
				return;
			}
		}
		int min = 100, max = 100;
		
		for(int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(arr[i]);
			
			if(num < 100) {
				if(max == 100) {
					max = num;
				} else {
					max = max > num ? max : num;
				}
			}
			else {
				if (min == 100) {
					min = num;
				} else {
					min = min < num ? min : num;
				}
			}
		}
		System.out.println(max + " " + min);
	}
}
