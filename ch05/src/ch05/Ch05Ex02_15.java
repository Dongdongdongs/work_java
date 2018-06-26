package ch05;

import java.util.Scanner;

public class Ch05Ex02_15 {
	public static void main(String[] args) {
		int[][] Class = new int[4][3]; 
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < Class.length; i++) {
			System.out.printf("%dclass? ",i+1);
			String[] arr = scanner.nextLine().split(" ");
			for(int j = 0; j < Class[i].length; j++) {
				Class[i][j] = Integer.parseInt(arr[j]);
			}
		}
		for(int i = 0; i < Class.length; i++) {
			int sum = 0;
			for(int j = 0; j < Class[i].length; j++) {
				sum += Class[i][j];
			}
			System.out.printf("%dclass : %d%n", i+1, sum);
		}
	}
}
