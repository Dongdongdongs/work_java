package ch02;
import java.util.*;
public class Ch02Ex02_12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a;
		double aa;
		
		String input = scanner.nextLine();
		a = Integer.parseInt(input);
		String input1 = scanner.nextLine();
		aa = Double.parseDouble(input1);
		
		double aaa = aa * a;
		
		System.out.printf("%.2f * %d = %.0f", aa, a, aaa);
				
	/*
	 * String strNum1 = scanner.nextLine();
	 * String strNum2 = scanner.nextLine();
	 * 
	 * int num1 = Integer.parseInt(strNum1);
	 * double num2 = Double.parseDouble(strNum2);
	 * 
	 * double result = num1 * num2;
	 * 
	 * System.out.printf(%.2f * %d = %.0f", num2, num1, result);	
	 */
	}
}
