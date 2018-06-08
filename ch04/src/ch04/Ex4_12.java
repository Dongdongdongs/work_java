package ch04;

public class Ex4_12 {
public static void main(String[] args) {
	/*int i = 0, j = 0;
	for(j = 1; j <= 3; j++) {
	for(i = 2; i <= 4; i++) {
	System.out.printf("%d*%d=%d	", i, j, i*j);
	}
	System.out.println();
	}
	System.out.println();		
	for(j = 1; j <= 3; j++) {
	for(i = 5; i <= 7; i++) {
	System.out.printf("%d*%d=%d	", i, j, i*j);	
	}
	System.out.println();
	}
	System.out.println();
	for(j = 1; j <= 3; j++) {
	for(i = 8; i <= 9; i++) {
	System.out.printf("%d*%d=%d	", i, j, i*j);	
	}
	System.out.println();
	}*/
	
	//어려운방법
	/*// i는 행 j 는 열
	for(int i = 1; i <= 9; i++) {
		for(int j = 1; j <= 3; j++) {
			int x = (j + 1) + (((i-1)/3)*3);
			int y = i % 3 == 0 ? 3 : i % 3; // i를 3으로 나눠서 0이면 3, 아니면 i를 3으로 나눈 나머지 값 사용
			
			if(x < 10) {
			System.out.printf("%d*%d=%d\t", x, y, x * y);
			}
		}
		System.out.println();
		if(i % 3 == 0) {
			System.out.println();
		}
	}*/
	
	// 방법2
	for(int i = 1; i <= 3; i++) {
		for(int j = 2; j <= 4; j++) {
			System.out.printf("%d*%d=%d\t", j, i, j*i);
		}
		System.out.println();
	}
	System.out.println();
	for(int i = 1; i <= 3; i++) {
		for(int j = 5; j <= 7; j++) {
			System.out.printf("%d*%d=%d\t", j, i, j*i);
		}
		System.out.println();
	}
	System.out.println();
	for(int i = 1; i <= 3; i++) {
		for(int j = 8; j <= 9; j++) {
			System.out.printf("%d*%d=%d\t", j, i, j*i);
		}
		System.out.println();
	}
	System.out.println();
}
}
