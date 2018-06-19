package ch05;

import java.util.Scanner;

public class Ch05Ex01_01 {
	public static void main(String[] args) {
	/*	char[] alpha = new char[10];
		
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		
		for(int i = 0; i < input.length; i++) {
			alpha[i] = input[i].charAt(0); // charAt(0) 배열의 인덱스가 아닌 문자열의 인덱스 번호
		}
		for(int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i]);
		}*/
		
		//1. 문자 10개를 저장하는 배열
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split(" ");
		
		//2. 입력받은 문자열 배열을 문자 배열로 변경
		char[] result = new char[arr.length];
		for(int i = 0; i < arr.length; i++) {
			result[i] = arr[i].charAt(0);
				// 2-1. arr String 배열에 들어있는 알파벳 문자열 하나를 끄집어 낸다.
				String tmp = arr[i];
				// 2-2. 1번에서 끄집어 낸 문자열을 char형으로 변경한다.
				char tmp2 = tmp.charAt(0);
				// 2-3. 2번에서 char 형으로 변경한 값을 result 배열에 집어넣는다.
				result[i] = tmp2;
		}		
		// 3. 문자들이 담긴 result 배열에 들어가잆는 값을 출력하기
		System.out.println(result);
	}
}
