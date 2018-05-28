package ch03;

public class OperatorEx06 {
	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
		//byte c = a + b; 컴파일 에러 발생, 명시적 형변환 필요 -> 바이트로 초기화 해놨지만, 다시 계산할 때는 기본형인 int로 변경되어서 컴파일이 안됨
		byte c = (byte)(a + b);
		System.out.println(c);
		/*
		 * 자바의 정수 기본형은 int 이다.
		 * 따라서 계산을 다시 할때는 다시 int형으로 변경해서 계산하게 된다.
		 * 결론은 별일 없으면 그냥 int 를 사용하라
		 */
	}
}
