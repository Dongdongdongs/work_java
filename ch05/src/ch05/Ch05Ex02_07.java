package ch05;

import java.util.Scanner;

public class Ch05Ex02_07 {
	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		String[] arr = new String[100];
		int num[] = new int[arr.length];
		int num1 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextLine();
			num[i] = Integer.parseInt(arr[i]);
			
			if(num[i] == 999) {
				num1 = i; 
				break;
			}
		}
		int max = num[0];
		int min = num[0];
		
		for(int i = 0; i < num1- 1; i++) {
			if(num[i] > max) {
				max = num[i];
			} else if(num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);*/
		
		// 999가 나타나기 전까지 입력이 무한하므로 우선 크기 2인 배열생성
		int[] stream = new int[2];
		// stream 배열의 현재 인덱스 번호를 저장 하는 변수 i
		int i = 0;
		// 무한히 입력 받으므로 무한반복한다.
		while(true) {
			// 숫자하나 입력받기
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			// 배열 길이 늘리는 코드
			if(i == stream.length) {
				int[] tmp = new int[stream.length * 2];
				System.arraycopy(stream, 0, tmp, 0, stream.length);
			}
			// 입력받은 정수를 배열에 저장
			stream[i] = num;
			// 만약 999일 경우 무한 반복문을 빠져나온다.
			if(stream[i] == 999) {
				break;
			}
			// stream 배열의 인덱스 번호 1증가
			i++;
		}
		// 최소값과 최대값의 초기값은 입력받은 stream 배열의 첫번째 값으로 한다.
		int min = stream[0];
		int max = stream[0];
		//stream 배열의 현재 인덱스 번호를 0으로 초기화.
		i = 0;
	
		// stream 배열에서 꺼낸 정수가 999가 아닐 동안 계속 반복
		while(stream[i] != 999) {
			min = min < stream[i] ? min : stream[i];
			max = max > stream[i] ? max : stream[i];
			i++;
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
