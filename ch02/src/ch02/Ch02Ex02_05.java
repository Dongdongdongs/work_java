package ch02;
import java.util.*;

public class Ch02Ex02_05 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double num, num1;
		
		String input = scanner.nextLine();
		num = Float.parseFloat(input);
		String input1 = scanner.nextLine();
		num1 = Float.parseFloat(input1);
		
		double a = num * num1;
		System.out.printf("%.0f * %f = %f%n", num, num1, a);
	}
}
