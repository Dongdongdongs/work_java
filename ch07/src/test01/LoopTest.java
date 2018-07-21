package test01;

public class LoopTest {
		
	public static void main(String[] args) {
		for(int i =1; i <= 10; i++) {
			//홀수 일땐 홀수 출력
			//짝수 일땐 짝수 출력
			
			if(i%2 == 0) {
				System.out.printf("%d, 짝수%n",i);
			} else {
				System.out.printf("%d, 홀수%n",i);
			}
			
		}
	}
}
