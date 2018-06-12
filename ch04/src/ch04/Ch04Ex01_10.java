package ch04;

import java.util.Scanner;

public class Ch04Ex01_10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int num = Integer.parseInt(numbers[0]);
		int num1 = Integer.parseInt(numbers[1]);
		
		/*String input = scanner.next();
		String input1 = scanner.next();
		
		int num = Integer.parseInt(input);
		int num1 = Integer.parseInt(input1);
		*/
		if(num > num1) {
			System.out.println(num - num1);
		} else if (num < num1) {
			System.out.println(num1 - num);
		}
		// 번외 메소드 이용해서 구하는 방법
		
	}
}
