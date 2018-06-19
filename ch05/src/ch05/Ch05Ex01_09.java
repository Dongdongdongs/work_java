package ch05;

import java.util.Scanner;

public class Ch05Ex01_09 {
	public static void main(String[] args) {
		int[] num = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		/*String[] arr = scanner.nextLine().split(" ");
		
		for(int i = 0; i < arr.length; i++) {	// 배열에 저장
			num[i] = Integer.parseInt(arr[i]);
				int max = num[0];
				if(num[i] > max) {
					
				}
		}*/
		for(int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		for(int i = 0; i < num.length; i++) {
			for(int j = i+1; j < num.length; j++) {
				if(num[i] < num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
