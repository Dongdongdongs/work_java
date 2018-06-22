package ch05;

import java.util.Scanner;

public class Ch05Ex02_06 {
	public static void main(String[] args) {
		char[] apple = {'A', 'P', 'P', 'L', 'E', '!'};

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char ch = input.charAt(0);
		
		//입력받은 문자오 ㅏ일치하는 문자가 에플 배열에 속해 있다면
		// isFind 값은 true, 아니면 false
		boolean isFind = false;
		
		// 에플 배열을 처음부터 차례로 탐색한다.
		for(int i = 0; i < apple.length; i++) {
			// 만약 입력한 문자와 배열에 있는 문자가 일치할 경우
			if(ch == apple[i]) {
				// 일치하는 문자가 있다는 표시로 isFind 값을 true로 변경
				isFind = true;
				// 이떄의 인덱스 번호를 출력
				System.out.print(i + " ");
				// 반복문을 나온다
				//break;
			}
		}
		// 만약 일치하는 문자가 없는 경우는 "none"을 출력
		if(isFind == false) {
			System.out.println("none");
		}
/*
		
		for(int i = 0; i < apple.length; i++) {
			if(apple[i] == ch) {
				System.out.print(i);
				break;
			}
		}
		for(int i = 0; i < apple.length; i++) {
			if(apple[i] != ch) {
				System.out.println("none");
			}
		}
*/	}
}