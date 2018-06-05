package ch04;

public class FlowEx33 {
	public static void main(String[] args) {
		
		// for문에 loop1 이라는 이름을 붙였다.
		loop1 : for(int i = 2; i <= 9; i++) {
				for(int j = 1; j <= 9; j++) {
					if(j==5)
						break loop1;
//						break
	//					continue loop1;
		//				continue;
					System.out.println(i+"*"+ j +"="+ i*j);
				}	// end of for i
				System.out.println();
				}	// end of loop1
	}
}
