package ch05;

import java.util.Scanner;

public class Ch05Ex01_15 {
	public static void main(String[] args) {
		int [][] stu = new int [5][4];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < stu.length; i++) {
			String[] input = scanner.nextLine().split(" ");
			for(int j = 0; j < stu[i].length; j++) {
				stu[i][j] = Integer.parseInt(input[j]);
			}
		}
		int count = 0;
		for(int i = 0; i < stu.length; i++) {
			int sum = 0;
			for(int j = 0; j < stu[i].length; j++) {
				sum += stu[i][j];
			}
			if(sum / stu[i].length >= 80) {
				System.out.println("pass");
				count++;
			} else {
				System.out.println("fail");
			}
		}
		System.out.println("Successful : " + count);
	}
}
