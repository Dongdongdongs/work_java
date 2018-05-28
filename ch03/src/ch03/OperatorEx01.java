package ch03;

public class OperatorEx01 {
	public static void main(String[] args) {
		int i = 5;
		i++;		// i = i+1과 같은 의미이다. ++1; 로 바꿔써도 결과는 같다.
		
		System.out.println(i);
		i = 5;		// 결과를 비교하기 위해 i 값을 다시 5로 변경.
		++i;
		
		System.out.println(i);
		
		/*
		 * i++ 는 변수 i 를 사용하고 1증가
		 * ++i 는 먼저 1 증가시키고 변수 i를 사용
		 */
		
		i = 5;
		System.out.println(i++);	// 사용하고 1 증가이기 때문에 5 출력, i = 6
		// 먼저사용(출력)이 되어서 5로 나오지만, 6으로 초기화 되어있음
		System.out.println(i);
		i = 5;
		System.out.println(++i);	// 1 증가하고 사용하기 때문에 6출력, i = 6
		
	}
}
