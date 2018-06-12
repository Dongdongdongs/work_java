package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {
	public static void main(String[] args) {
		/*
		for(;;) {
			System.out.print("정수를 입력하세요.(0:종료)>");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
				if(num > 0) {
					System.out.print("positive integer");
				} else if(num < 0) {
					System.out.print("negative number");
				} else if(num == 0) {
					break;
				}
		}*/
		while(true) {
		System.out.println("정수를 입력하세요.(0: 종료)>");
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		
		if(num > 0) {
			System.out.print("positive integer");
		} else if(num < 0) {
			System.out.print("negative number");
		} 
		if (num == 0) {
			break;
		}
	}
}
}