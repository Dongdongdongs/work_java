package ch04;

import java.util.Scanner;

public class Ch04Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		int reslut = 0;
		int sum = 0;
		while(reslut <= num) {
			sum += reslut;
			reslut++;
		}
		System.out.println(sum);
	}
}
