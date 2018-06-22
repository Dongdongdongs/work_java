package ch05;

import java.util.Scanner;

public class Ch05Ex02_09 {
	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		int count = 0;
		int[] num = new int[100];
		
		for(int i = 0; i < 100; i++) {
			num[i] = scanner.nextInt();
			count++;
			if(num[i] == 0) {
				System.out.println(count - 1);
				break;		
			}
		}
		for(int i = 0; i < count - 1; i++) {	// 홀수 2배곱, 짝수 2나누기
			if(num[i] % 2 != 0){
				System.out.printf("%d ", num[i] * 2);
			} else if(num[i] % 2 == 0) {
				System.out.printf("%d ", num[i] / 2);
			}
		}*/
		int [] numbers = new int[2];
		
		int i = 0;
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			if(i == numbers.length) {
				int[] tmp = new int[numbers.length * 2];
				System.arraycopy(numbers, 0, tmp, 0, numbers.length);
				numbers = tmp;
			}
			numbers[i] = num;
			if(numbers[i] == 0) {
				break;
			}
			i++;
		}
		
		System.out.println(i);
		
		for(int j = 0; j < numbers.length; j++) {
			if(numbers[j] == 0) {
				break;
			}
			System.out.print((numbers[j]%2 != 0 ? numbers[j] *2 : numbers[j] /2) + " ");
		}
	}
}
