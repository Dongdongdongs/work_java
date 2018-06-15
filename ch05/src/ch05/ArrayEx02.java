package ch05;

import java.util.Arrays;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];		// 1번배열
		int[] iArr2 = new int[10];		// 2번배열	
		//int[] iArr3 = new int[] {100, 95, 80, 70, 60};	//배열을 선언하고 바로 값을 초기화 하는 방법
		int[] iArr3 = {100, 95, 80, 70, 60};	// 위에꺼에서 new int[] 생략한 부분, 둘다 사용 가능
		char[] chArr = {'a', 'b', 'c', 'd'};	// 캐릭터형 배열
		
		for(int i = 0; i < iArr1.length ; i++) {
			iArr1[i] = i + 1;	// 1~10의 숫자를 순서대로 배열에 넣는다.
		}
		
		for(int i = 0; i < iArr2.length ; i++) {
			iArr2[i] = (int)(Math.random() * 10) + 1; // 1~10 의 값을 배열에 저장
		}
		
		// 배열에 저장된 값들을 출력한다.
		for(int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ",");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));		// toString 형식에 맞춰서 출력
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);	//[I@4e25154f    I 는 인티저, 가상의 메모리 주소(16진수), println 말고, 포문을 사용해서 출력하라는의미
		System.out.println(chArr);	// 형태 확인후, 메소드에 따라 출력
		//44 30 16 21 21
	}
}
