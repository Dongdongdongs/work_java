package ch05;

import java.util.Scanner;

public class Ch05Ex02_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int[] num = new int[100];
		
		for(int i = 0; i < 100; i++) {
			num[i] = scanner.nextInt();
			count++;
			if(num[i] == 0) {
				System.out.println(count - 1);
				break;		
			}
		}
		for(int i = 0; i < count - 1; i++) {	// 홀수 2배곱, 짝수 2나누기
			if(num[i] % 2 != 0){
				System.out.printf("%d ", num[i] * 2);
			} else if(num[i] % 2 == 0) {
				System.out.printf("%d ", num[i] / 2);
			}
		}
		
	}
}
