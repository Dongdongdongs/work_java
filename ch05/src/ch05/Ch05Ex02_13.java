package ch05;

import java.util.Scanner;

public class Ch05Ex02_13 {
	public static void main(String[] args) {
		/*		Scanner scanner = new Scanner(System.in);

		String[] arr = scanner.nextLine().split(" ");
		int[] num = new int[12];
		int[] num1 = new int[12];

		for(int i = 0; i < arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
		}
		for(int i = 0; i < 12; i++) {
			num[i + 2] = (num[i]+num[i+1]) % 10;
			System.out.print(num[i] + " ");
		}*/
		// 1. 배열생성(첫항과 두번째 항만 저장하는 배열 우선 생성)
		int[] stream = new int[2];

		// 2. 첫번째 항과 두번째 항은 입력받은 수로 초기화
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");

		// 입력받은 수를 stream 배열 첫항과 두번째항에 저장
		stream[0] = Integer.parseInt(numbers[0]);
		stream[1] = Integer.parseInt(numbers[1]);

		// 첫항과 두번째항 다음 항부터 반복 시작
		// 문제에서는 최대 10개를 출력하는 프로그램 작성하라고 되어있으므로
		// 9번 인덱스까지 반복
		for(int i = 2; i < 10; i++) {
			// 만약 배열 공간이 부족하면 늘리기
			if(i == stream.length) {
				int[] tmp = new int[stream.length * 2];
				System.arraycopy(stream, 0, tmp, 0, stream.length);
				stream = tmp;
			}
			// 전전항(i-2)과 전항(i-1)의 합에서 1의 자리를 배열에 채우기
			int result = (stream[i - 2] + stream[i - 1]) % 10;
			stream[i] = result;
		}
		// 0번 인덱스부터 9번 인덱스까지 값을 출력
		for(int i = 0; i < 10; i++) {
			System.out.print(stream[i] + " ");
		}
	}
}
