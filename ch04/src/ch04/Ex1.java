package ch04;

public class Ex1 {
	public static void main(String[] args) {
		int i = 0, j = 0;
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
		}

			}	 // end of main
		} // end of class