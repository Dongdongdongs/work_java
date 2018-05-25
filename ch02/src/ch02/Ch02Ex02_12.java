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
				
		
	}
}
