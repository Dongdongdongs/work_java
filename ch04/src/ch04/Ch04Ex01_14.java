package ch04;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Ch04Ex01_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int month = Integer.parseInt(input);
				
		
		if(1 <= month && month <= 12) {
			switch(month) {
			case 1 : case 3 : case 5 : case 7 : case 8 :
			case 10 : case 12 :
				System.out.println("31");
				break;
			case 2 :
				System.out.println("28");
				break;
			case 4 : case 6 : case 9 : case 11 :
				System.out.println("30");
				break;
			
			}
		}
		if(1 <= month && month <= 12) {
			boolean isOdd = month % 2 != 0; // 홀수이면 true
			boolean is90rLess = month <= 9; // 9d월 이하이면 true
			
			if (isOdd && is90rLess) {
				System.out.println(31);
			} else if (month == 2) {
				System.out.println(28);
			} else if(month == 10 || month == 12) {
				System.out.println(31);
			} else {
				System.out.println(30);
			}
		}
	}
}
