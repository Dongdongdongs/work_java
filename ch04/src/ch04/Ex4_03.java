package ch04;

public class Ex4_03 {
	public static void main(String[] args) {
		int count = 0;	// 몇번 반복했는지 체크하기 위한 변수
		
		/*// 방법1 : 55회 반복
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				sum += j;
				count++;
			}
		}
		
		System.out.println(sum);
		System.out.println(count);
		*/
		// 방법 2 : 10번 반복
		int sum = 0;		// 괄호 안의 부분 합
		int totalsum = 0;	// 총합
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
			totalsum += sum;
			count++;	// 반복문 몇번 수행했는지 체크
		}
		
		System.out.println(totalsum);
		System.out.println(count);
	}
}
