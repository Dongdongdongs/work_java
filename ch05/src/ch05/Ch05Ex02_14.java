package ch05;

public class Ch05Ex02_14 {
	public static void main(String[] args) {
		int sum = 0;
		int[][] num = {
				{3, 5, 9},
				{2, 11, 5},
				{8, 30, 10},
				{22, 5, 1},
		};
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.printf("%d ", num[i][j]);
				sum += num[i][j];
			}
			System.out.println();
		}
		System.out.println(sum);
	}
}
