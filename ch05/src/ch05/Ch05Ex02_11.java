package ch05;

import java.util.Scanner;

public class Ch05Ex02_11 {
	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split(" ");*/
		// 주사위 던져 나온 수들을 저장하는 배열
		// 인덱스 0 번부터 1~6의 개수를 저장
	/*	int num[] = new int[arr.length];
		int count[] = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
			if(1 <= num[i] && num[i] <= 6) {
				if(num[i] == 1) {
					count[0]++;
				} else if(num[i] == 2) {
					count[1]++;
				} else if(num[i] == 3) {
					count[2]++;
				} else if(num[i] == 4) {
					count[3]++;
				} else if(num[i] == 5) {
					count[4]++;
				} else if(num[i] == 6) {
					count[5]++;
				}
			}
		}
		System.out.println("1 : " + count[0]);
		System.out.println("2 : " + count[1]);
		System.out.println("3 : " + count[2]);
		System.out.println("4 : " + count[3]);
		System.out.println("5 : " + count[4]);
		System.out.println("6 : " + count[5]);*/
		
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split(" ");
		int[]counter = new int[6];
		
		// 입력받은 주사위 수들을 하나씩 꺼낸다
		for(int i = 0; i < arr.length; i++) {
			// 꺼낸 문자열을 정수로 변환
			int num = Integer.parseInt(arr[i]);
			
			// 주사위 눈의 수 - 1 한 것은 인덱스 번호와 일치
			// 해당 counter 배열의 인덱스에 1 증가
			counter[num -1]++;
		}
		for(int i = 0; i < counter.length; i++) {
			System.out.println(i+1 +" : " + counter[i]);
		}
	}
}	
