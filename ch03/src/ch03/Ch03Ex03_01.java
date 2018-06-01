package ch03;

import java.util.Scanner;

public class Ch03Ex03_01 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	// 2개의 수를 입력받는다.
	String input = scanner.nextLine();
	String input1 = scanner.nextLine();
	// 받은 수를 각각 실수 형태로 저장
	double num = Double.parseDouble(input);
	double num1 = Double.parseDouble(input1);
	// 입력받은 두 실수를 곱하여 인트형으로 X 에 저장
	int X = (int)(num * num1);
	
	// 두 실수를 각각 정수형으로 인트 넘2 넘3로 저장
	int num2 = (int) num;
	int num3 = (int) num1;
	// 결과값 출력
	System.out.printf("%d %d", X, num2 * num3);
			
}
}
