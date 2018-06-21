package ch05;

import java.util.Scanner;

public class Ch05Ex02_01 {
	public static void main(String[] args) {
		
		char[] ch = new char[10];
		
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			ch[i] = arr[i].charAt(0);
		}
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(ch[i] + " ");
		}
	}
}
