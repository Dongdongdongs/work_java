package ch03;

import java.util.Scanner;

public class Ch03Ex03_03 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	// 수를 3개를 입력받는다
	String input = scanner.next();
	String input1 = scanner.next();
	String input2 = scanner.next();
	// 입력받은 수를 각각 정수형으로 저장
	int num = Integer.parseInt(input);
	int num1 = Integer.parseInt(input1);
	int num2 = Integer.parseInt(input2);
	
	// 플롯형으로 변경하여 3개의 정수의 합을 구한후 3으로 나누고,
	// 소수 첫째자리까지 출력
	System.out.printf("%.1f",(float)(num+num1+num2)/3);
	
}
}
