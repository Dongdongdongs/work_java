package ch03;

import java.util.Scanner;

public class Ch03Ex01_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		int num = Integer.parseInt(input);
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		/* 첫번째 수가 가장 크면 true, 아니면 false
		 * boolean isNum1Big01 = num1 > num2; num1이 num2보다 크면 true
		 *boolean isNum1Big02 = num1 > num3; num1이 num2보다 크면 true 
		 *boolean isNum1Big = isNum1Big01 > isNum1Big02; 두 결과 모두 true 면 num1이 가장큼
		 *
		 *boolean isSame01 = num1 == num2;	num1과 num2가 같으면 true
		 *boolean isSame02 = num1 == num2;	num1과 num3가 같으면 true
		 *boolean isSame = isSame01 && isSame02;	두결과가 모두 true면 세개의 수가 모두 같다
		 *
		 */
		
		System.out.printf("%b %b", num > num1 && num > num2, num == num1 && num == num2);
	}
}
