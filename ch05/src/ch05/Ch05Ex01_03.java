package ch05;

import java.util.Scanner;

public class Ch05Ex01_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[] ch = new char[10];
		
		String[] arr = scanner.nextLine().split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			ch[i] = arr[i].charAt(0);
		}
		
		for(int i = 0; i < ch.length; i++) {
			if(i == 0 || i == 3 || i == 6
					) {
				System.out.print(ch[i]+ " ");
			}
		}
	}
}
