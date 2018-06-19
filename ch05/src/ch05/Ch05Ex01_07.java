package ch05;

import java.util.Scanner;

public class Ch05Ex01_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split(" ");
		int[] num = new int[10];
		int max = num[0];
		int min = num[0];
		
		for(int i = 0; i < arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
			
			if (0 <= num[i] && num[i] <= 10000) {
				if(num[i] < 100) {
					for(int j = 1; j < num.length; j++) {
						if(num[j] > max) {
							max = num[j];
						}	// i일떈 나오ㅁ...
					}
				} else if(100 <= num[i] && num[i] < 10000) {
					for(int k = 1; k < num.length; k++) {
						if(num[k] > 100) {
							min = num[k];
						}
					}
				}
			} else {
				System.out.println(100);
			}
		}
		System.out.printf("%d %d", max, min);
	}
}
