package ch03;

import java.util.Scanner;

public class Ch03Ex01_06 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String input = scanner.nextLine();
	String input1 = scanner.nextLine();
	
	int num = Integer.parseInt(input);
	int num1 = Integer.parseInt(input1);
	
	System.out.printf("%b %b", (num!=0) && (num1!=0), (num!=0) || (num1!=0));
}
}
