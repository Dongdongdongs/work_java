package ch05;

public class Ch05Ex01_02 {
	public static void main(String[] args) {
		
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		for(int i = 0; i < num.length; i++) {
		System.out.print(num[i] + " ");
		}
		System.out.println();
		// 
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
