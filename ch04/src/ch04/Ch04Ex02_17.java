package ch04;

import java.util.Scanner;

public class Ch04Ex02_17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*int num = Integer.parseInt(scanner.nextLine());
		int num1 = 1;
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(i <= j) {
				System.out.print(num1);
				num1++;
				if(num1 == 10) {
					num1 =num1 % 10;
				}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		
		// 1. 자연수 하나 입력받기
		int num = Integer.parseInt(scanner.nextLine());
		// 3. 숫자를 출력할 변수 선언 및 초기화
		int count = 1;
		
		// 2. 틀 작성
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(j >= i) {
				System.out.print((count % 10) + " ");
				count++;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}


// 1,1 1,2 1,3
// 2,1 2,2 2,3
// 3,1 3,2 3,3