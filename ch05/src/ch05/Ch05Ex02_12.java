package ch05;

import java.util.Scanner;

public class Ch05Ex02_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[100];
		int[] count = new int[10];
		for(int i = 0; i < 100; i++) {
			String input = scanner.nextLine();
			num[i] = Integer.parseInt(input);
			
		if(10 <= num[i] && num[i] < 20) {
				count[0]++;
			} else if(20 <= num[i] && num[i] < 30) {
				count[1]++;
			} else if(30 <= num[i] && num[i] < 40) {
				count[2]++;
			} else if(40 <= num[i] && num[i] < 50) {
				count[3]++;
			} else if(50 <= num[i] && num[i] < 60) {
				count[4]++;
			} else if(60 <= num[i] && num[i] < 70) {
				count[5]++;
			} else if(70 <= num[i] && num[i] < 80) {
				count[6]++;
			} else if(80 <= num[i] && num[i] < 90) {
				count[7]++;
			} else if(90 <= num[i] && num[i] < 100) {
				count[8]++;
			} else if(100 == num[i]) {
				count[9]++;
			}			
			if(num[i] == 0) {
				break;
			}
		}
		for(int i = count.length -1; i >= 0 ; i--) {
			if(count[i] > 0) {
				System.out.printf("%d : %d person%n", (i*10)+10, count[i]);
			}
		}
	}
}
