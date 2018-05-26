package ch02;
import java.util.*;
public class Ch02Ex02_11 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		double a, aa;
		
		
		
		String input = scanner.nextLine();
		a = Double.parseDouble(input);
		String input1 = scanner.nextLine();
		aa = Double.parseDouble(input1);
		
		double aaa = a + aa;
		
		System.out.printf("%10.2f %10.2f %10.2f", a, aa, aaa);
	}
		
}
