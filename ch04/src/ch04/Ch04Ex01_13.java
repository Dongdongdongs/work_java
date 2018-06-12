package ch04;

import java.util.Scanner;

public class Ch04Ex01_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("번호를 입력하세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		if(1<= num && num <=3) {
			if(num == 1) {
				System.out.println("dog");
			} else if(num == 2) {
				System.out.println("cat");
			} else if(num == 3) {
				System.out.println("chick");
			}
		} else {
			System.out.println("i don't know");
		}
		
		switch(num) {
		case 1 :
			System.out.println("dog");
			break;
		
		case 2 :
			System.out.println("cat");
			break;
			
		case 3 :
			System.out.println("chick");
			break;
			
			default:
				System.out.println("I don't know");
		}
	}
}
