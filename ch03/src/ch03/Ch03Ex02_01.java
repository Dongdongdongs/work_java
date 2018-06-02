package ch03;

import java.util.Scanner;

public class Ch03Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[]numbers = scanner.nextLine().split(" ");	// 스플릿을 나누는 기준, 띄어쓰기
		// String[] 스트링을 담는 배열, "35""10" 각각 저장됨, numbers는 첫번째 값 을 가르킴
		int num1 = Integer.parseInt(numbers[0]);	// 넘버스에 저장된 첫번째 값
		int num2 = Integer.parseInt(numbers[1]);	// 넘버스에 저장된 두번째 값
				
		int qoutient = num1 / num2;
		int remainder = num1 % num2;
		
		// Ctrl + space 자동완성
		System.out.printf("%d / %d = %d...%d%n", num1, num2, qoutient, remainder);
		
		/*
		String input = scanner.nextLine();
		String input1 = scanner.nextLine();
		
		int num = Integer.parseInt(input);
		int num1 = Integer.parseInt(input1);
		
		System.out.printf("%d / %d = %d...%d", num, num1, num/num1, num%num1);
		*/
		
	}
}
