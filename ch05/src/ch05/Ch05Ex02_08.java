package ch05;

import java.util.Scanner;

public class Ch05Ex02_08 {
	public static void main(String[] args) {
/*		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[100];
		int count = 0, sum = 0;
		double avg = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
			
			if(num[i] %5 == 0 && num[i] != 0) {
				sum += num[i];
				count++;
			} else if(num[i] == 0) {
				break;
			}
		}
		
		System.out.println("Multiples of 5 : " + count);
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double)sum / count);*/
		
		int[] numbers = new int[2];
		
		int i = 0;
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			if(i == numbers.length) {
				int[] tmp = new int [numbers.length *2];
				System.arraycopy(numbers, 0, tmp, 0, numbers.length);
				numbers = tmp;
			}
			numbers[i] = num;
			if(numbers[i] == 0) {
				break;
			}
			i++;
		}
		int multiplesOfFive = 0;
		int sum = 0;
		for(int j = 0; j < numbers.length; j++) {
			if(numbers[j] == 0) {
				break;
			}
			if(numbers[j] % 5 == 0) {
				multiplesOfFive++;
				sum += numbers[j];
			}
		}
		System.out.println("Multiples of 5 : " + multiplesOfFive);
		System.out.println("sum : " + sum);
		System.out.printf("avg %.1f%n", sum / (double)multiplesOfFive);
	}
}
