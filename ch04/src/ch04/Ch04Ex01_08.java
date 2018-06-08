package ch04;

import java.util.Scanner;

public class Ch04Ex01_08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		double score = Double.parseDouble(input);
		if(0 <= score && score <= 4.5) {
		switch((int)score) {
		case 4 :
			if((int)score >= 4) {
			System.out.println("scholarship");}
			break;
		case 3 :
			if((int)score >= 3) {
			System.out.println("next semester");}
			break;
		case 2 :
			if((int)score >= 2) {
				System.out.println("seasonal semester");
			} else if((int)score < 2) {
				System.out.println("retake");
			}
			break;
		}
		}
	}
}
