package ch03;

import java.util.Scanner;

public class Ex03_02 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String input = scanner.next();
	String input1 = scanner.next();
	
	int num, leg, dog, chick;
	
	num = Integer.parseInt(input);
	leg = Integer.parseInt(input1);
	
	int dogleg = 4;
	int chickleg = 2;
	
	if(num <= 1000 && leg <= 4000) {
		
	} else if(num > 1000 && leg > 4000)   {
		System.out.printf("INPUT ERROR!");
			
	}  
		
	//if((1 <= num && num <= 1000) && (1 <= num1 && num1 <= 4000))   {
	//	System.out.printf("%d %d", num, num1);
	//}	

	
}
}
