package ch05;

import java.util.Scanner;

public class Ch05Ex02_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] arr = scanner.nextLine().split(" ");
		int num[] = new int[arr.length];
		int count[] = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
			if(1 <= num[i] && num[i] <= 6) {
				if(num[i] == 1) {
					count[0]++;
				} else if(num[i] == 2) {
					count[1]++;
				} else if(num[i] == 3) {
					count[2]++;
				} else if(num[i] == 4) {
					count[3]++;
				} else if(num[i] == 5) {
					count[4]++;
				} else if(num[i] == 6) {
					count[5]++;
				}
			}
		}
		System.out.println("1 : " + count[0]);
		System.out.println("2 : " + count[1]);
		System.out.println("3 : " + count[2]);
		System.out.println("4 : " + count[3]);
		System.out.println("5 : " + count[4]);
		System.out.println("6 : " + count[5]);
	}
}	
