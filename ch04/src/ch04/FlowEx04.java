package ch04;

import java.util.Scanner;

public class FlowEx04 {
	public static void main(String[] args) {
		int score = 0;		// 점수를 저장하기 위한변수
		char grade = ' ';	// 학점을 저장하기 위한 변수. 공백으로 초기화한다.
		
		System.out.print("점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();	// 화면을 통해 입력받은 내용을 tmp에 저장
		score = Integer.parseInt(tmp);		// 입력받은 문자열(tmp)을 숫자로 변환
		
		if (score >= 90) {
			grade = 'A';	// 스코어가 90점보다 같거나 크면 	A
								
		} else if (score >= 80) {
			grade = 'B';	// 스코어가 80점보다 같거나 크면 B
					
		} else if (score >= 70) {
			grade = 'C';	// 스코어가 70점보다 같거나 크면 C
						
		} else {
			grade = 'D';	// 나머지는 D
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}
}
