package ch05;

import java.util.Scanner;

public class Ch05Ex01_14 {
	public static void main(String[] args) {
		int [][] a1 = new int[2][4];
		int [][] a2 = new int[2][4];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("fist array");
		for(int i = 0; i < a1.length; i++) {
			String[] input = scanner.nextLine().split(" ");
			for(int j = 0; j < a1[i].length; j++) {
				a1[i][j] = Integer.parseInt(input[j]);
			}
		}
		System.out.println("second array");
		for(int i = 0; i < a2.length; i++) {
			String[] input = scanner.nextLine().split(" ");
			for(int j = 0; j < a2[i].length; j++) {
				a2[i][j] = Integer.parseInt(input[j]);
			}
		}
		for(int i = 0; i < a1.length; i++) {
			for(int j = 0; j < a1[i].length; j++) {
				System.out.print(a1[i][j] * a2[i][j] + " ");
			}
			System.out.println();
		}
	}
}	
