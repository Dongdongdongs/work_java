package ch05;

import java.util.Scanner;

public class Ch05Ex02_17 {
	public static void main(String[] args) {
		int[][] arr = new int[4][2];
		Scanner scanner = new Scanner(System.in);
		int width = 0, height = 0, result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			String[] input = scanner.nextLine().split(" ");
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				width += arr[i][j];
			}
			System.out.print(width/2+" ");
			width = 0;
		}
		System.out.println();
		
		for(int i = 0; i < arr[i].length; i++) {
			for(int j = 0; j < arr.length; j++) {
				height += arr[j][i];
			}
			System.out.print(height/4 + " ");
			height = 0;
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				result += arr[i][j];
			}
		}
		System.out.println(result/8);
	}
}
