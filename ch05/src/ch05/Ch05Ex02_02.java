package ch05;

import java.util.Scanner;

public class Ch05Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split(" ");
		
		// 문자열 배열인 num을 int형으로 변환하여 저장할 배열 선언
		int[] num = new int[arr.length];

		// num 배열에 있는 문자열을 하나씩 끄집어내어 int형으로 변경
		for(int i = 0; i < arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
		}
		
		System.out.print(num[0] + num[2]+ num[4]);
	}
}
