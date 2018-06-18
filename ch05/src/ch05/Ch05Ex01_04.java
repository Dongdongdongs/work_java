package ch05;

import java.util.Scanner;

public class Ch05Ex01_04 {
	public static void main(String[] args) {
		int[] num = new int[100];

		Scanner scanner = new Scanner(System.in);
		for(;;) {
			String[] arr = scanner.nextLine().split(" ");

			for(int i = 0; i < arr.length; i++) {
				num[i] = Integer.parseInt(arr[i]);
			}
			if(num[]== 0) {
				break;
			}
		}
	}
}
