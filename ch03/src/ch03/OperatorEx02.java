package ch03;

public class OperatorEx02 {
	public static void main(String[] args) {
		int i = 5, j = 0;
		
		j = i++;	// i=5 가 j에 먼저 초기화 된 후, ++이 되어 i 는 6, j 는 5
		System.out.println("j=i++; 실행후, i=" + i +", j=" + j);
		
		i = 5;	// 결과를 비교하기 위해, i와 j 값을 다시 5와 0으로 변경
		j = 0;
			
		j = ++i;
		System.out.println("j=++i; 실행후, i=" + i +", j ="+ j);
	}
}
