package ch05;

import java.util.Scanner;

public class Ch05Ex02_16 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		int[][] arr1 = new int[2][3];
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("fist array");
		for(int i = 0; i < arr.length; i++) {
			String[] input = scanner.nextLine().split(" ");
			
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}
		System.out.println("second array");
		for(int i = 0; i < arr1.length; i++) {
			String[] input = scanner.nextLine().split(" ");
			
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		int[][] narr = new int[2][3];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				narr[i][j] = arr[i][j] * arr1[i][j];
				
				System.out.print(narr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
