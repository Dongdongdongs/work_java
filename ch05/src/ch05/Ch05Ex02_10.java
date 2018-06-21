package ch05;

import java.util.Scanner;

public class Ch05Ex02_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int humen = Integer.parseInt(scanner.nextLine());
		int[] score = new int[humen];
		String[] num = scanner.nextLine().split(" ");
				
		for(int i = 0; i < humen; i++) {
			score[i] = Integer.parseInt(num[i]);
		}
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score.length; j++) {
				if(score[i] > score[j]) {
					int tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}
}
