package ch05;

import java.util.Scanner;

public class MultiArrEx01 {
	public static void main(String[] args) {
		final int SIZE = 10;
		int x = 0, y = 0;
		
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
				//1  2  3  4  5  6  7  8  9
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0},	// 1
				{ 1, 1, 1, 1, 0, 0, 1, 0, 0},	// 2
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0},	// 3
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0},	// 4
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0},	// 5
				{ 1, 1, 0, 1, 0, 0, 0, 0, 0},	// 6
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0},	// 7
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0},	// 8
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0},	// 9
		};
		// char배열인 board의 모든 칸을 문자 ' '로 초기화 한다.
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				board[i][j] = ' ';
			}
		}
		// 1행에 행번호를, 1열에 저장한다.
		for(int i = 1 ; i < SIZE; i++) {
			board[0][i] = board[i][0] = (char)(i + '0');	// 대입연산자가 여러게 있으면 맨 오른쪽 부터 계산
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.printf("좌표를 입력하세요.(죵료는 00)>");
			String input = scanner.nextLine();		// 화면입력받은 내용을 input에 저장
			
			if(input.length() == 2) {	// 두글자를 입력한 경우
				x = input.charAt(0) - '0';		// 문자를 숫자로 변환
				y = input.charAt(1) - '0';
				
				if(x == 0 && y == 0) {	// x와 y가 모두 0인 경우
					break;
				}
			}
			if(input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
				System.out.println("잘못된 입력입니다. 다시입력해주세요.");
				continue;
			}
			
			// shipBoard[x-1][y-1] 의 값이 1이면, '0'을 board[x][y]에 저장한다.
			board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X' ;
			    
			// 배열 board의 내용을 화면에 출력한다.
			for(int i = 0; i < SIZE; i++) {
				System.out.println(board[i]);	// board[i]는 1차원 배열 char 형이라서 1차원적으로 출력 가능
			}
			System.out.println();
		}
	}	// main의 끝	1300 430 = 1730
}
