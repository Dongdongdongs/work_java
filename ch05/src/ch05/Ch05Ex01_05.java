package ch05;

import java.util.Scanner;

public class Ch05Ex01_05 {
	public static void main(String[] args) {
		double[] Class = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split(" ");
		int num = Integer.parseInt(arr[0]);
		int num1= Integer.parseInt(arr[1]);
		
				
		System.out.printf("%.1f", (Class[num - 1]+Class[num1 - 1]));
		
	}
}
