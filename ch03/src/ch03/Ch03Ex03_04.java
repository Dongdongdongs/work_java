package ch03;

import java.util.Scanner;

public class Ch03Ex03_04 {
public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
	
	// 수를 3개를 입력받는다
	String input = scanner.next();
	String input1 = scanner.next();
	String input2 = scanner.next();
	// 각각 실수형태로 저장
	double num = Double.parseDouble(input);
	double num1 = Double.parseDouble(input1);
	double num2 = Double.parseDouble(input2);
	
	// 정수형으로 변경하여 총합을 구함
	System.out.printf("sum %d%n",(int)num+(int)num1+(int)num2);
	// 3개의 합을 구한후 3으로 나눠 평균을 구하고 정수형변경하여 출력
	System.out.printf("avg %d",(int)(num+num1+num2)/3);
	
}
}
