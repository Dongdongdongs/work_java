package ch05;

public class ArrayEx06 {
	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];	// 배열의 첫 번재 값으로 최대값을 초기화한다.
		int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화한다.
		
		for(int i = 1; i < score.length; i++) {		// 배열의 두번째 요소보투어 읽기 위해서 변수 i의 값을 1로 초기화, 이미 max, min에 0번째 값을 저장해놈	
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}	// end of for
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
}
