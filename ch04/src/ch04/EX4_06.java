package ch04;

public class EX4_06 {
	public static void main(String[] args) {
		/*for(int i = 1; i <=6; i++) {
			for(int j = 1; j <= 6; j++) {
			if(i+j == 6) {
			System.out.printf("%d %d%n", i, j);
			}					
			} 내가한거
			}*/ 
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i+j == 6) {
					System.out.printf("%d+%d=%d%n",i,j,i+j);
				}
			}
	
		}
	}
}
