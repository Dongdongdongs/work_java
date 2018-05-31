package ch03;

import java.util.Scanner;

public class Ch03Ex01_03 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	String input = scanner.nextLine();
	int num = Integer.parseInt(input);
	String input1 = scanner.nextLine();
	int num1 = Integer.parseInt(input1);
	
	num++;
	int numA = num;
	int numB = --num1;
	int numC = numA*numB;
	
	System.out.printf("%d %d %d", numA, numB, numC);
	//int numC = num++*--num1;
	
	//System.out.printf("%d %d %d", num, num1, numC);
	
	
	
	
}
}
