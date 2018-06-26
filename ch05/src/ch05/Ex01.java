package ch05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] arr = scanner.nextLine().split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
