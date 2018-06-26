package ch05;

import java.util.Scanner;

public class Ch05Ex02_18 {
	public static void main(String[] args) {
		char[][] arr = new char[3][5];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			String[] input = scanner.nextLine().split(" ");
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = input[j].charAt(0);
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print((char)(arr[i][j]+32) + " ");
			}
			System.out.println();
		}
	}
}
