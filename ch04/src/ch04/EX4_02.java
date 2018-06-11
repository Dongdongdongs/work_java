package ch04;

public class EX4_02 {
	public static void main(String[] args) {
		// 총합을 저장하는변수 선언 및 초기화
		int sum = 0;
		//1부터 20까지 정수를 활용하기 위해반복
		for(int i = 1; i <= 20; i++) {
			// 만약 2의 배수도 아니고 3의배수도 아니면
			if(i % 2 != 0 && i % 3 != 0) {
				sum += i;	// 총합을 저장하는 변수에 더하기
			}
		}
		//for 문을 끝내고 총합을 출력 73이나오면 정답
		System.out.println("sum = " + sum);
	}
}

