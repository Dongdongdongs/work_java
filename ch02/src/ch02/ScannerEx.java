package ch02;

import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리의 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();
		// nextLine -> 다음 올때까지 대기
		int num = Integer.parseInt(input);	// 입력받은 문자열을 숫자로 변환
		// parseInt -> 문자열을 int형으로 변경
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n", num);
	
	}
}
