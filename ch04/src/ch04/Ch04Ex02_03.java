package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {
	public static void main(String[] args) {
		
		for(;;) {
			System.out.print("정수를 입력하세요.(0:종료)>");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
				if(num > 0) {
					System.out.println("positive integer");
				} else if(num < 0) {
					System.out.println("negative number");
				} else if(num == 0) {
					break;
				}
		}
	}
}
