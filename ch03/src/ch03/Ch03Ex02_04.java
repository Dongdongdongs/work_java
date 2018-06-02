package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	/*
	String input = scanner.next();
	String input1 = scanner.next();
	String input2 = scanner.next();
	String input3 = scanner.next();
	
	int num = Integer.parseInt(input);
	int num1 = Integer.parseInt(input1);
	int num2 = Integer.parseInt(input2);
	int num3 = Integer.parseInt(input3);
	
	System.out.println(num);
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	
	System.out.printf("%b", num > num2 && num1 > num3);
	*/
	
	  String[] numbers01 = scanner.nextLine().split(" ");
	  int mh = Integer.parseInt(numbers01[0]);
	  int mw = Integer.parseInt(numbers01[1]);
	  
	  String[] numbers02 = scanner.nextLine().split(" ");
	  int kh = Integer.parseInt(numbers02[0]);
	  int kw = Integer.parseInt(numbers02[1]);
	  
	  boolean isGreatMinsoo = mh > kh ? 
	  		( mw > kw ? true : false) : false;
	  
	  System.out.println(isGreatMinsoo);
	 
}
}
