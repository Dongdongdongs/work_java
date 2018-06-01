package ch03;

import java.util.Scanner;

public class Ch03Ex03_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 2개의 수를 입력받는다.
		String input = scanner.next();
		String input1 = scanner.next();
		// 받은 수를 각각 정수 형태로 저장
		int num = Integer.parseInt(input);
		int num1 = Integer.parseInt(input1);
		// %d 에 첫번째 수를 두번째 나눈수 출력, %f에 .2를 하여 2번째 자리숫까지 출력
		// 첫번째 수를 플롯형태로 변경하여 나눔
		System.out.printf("%d %.2f", num/num1, (float)num/num1);
	
	}
}
