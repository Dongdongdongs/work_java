package ch02;
import java.util.*;

public class Ch02Ex_09 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		double a = Double.parseDouble(input);
		String input1 = scanner.nextLine();
		double aa = Double.parseDouble(input1);
		String input2 = scanner.nextLine();
		double aaa = Double.parseDouble(input2);
		
		System.out.printf("%.3f%n", a);
		System.out.printf("%.3f%n", aa);
		System.out.printf("%.3f", aaa);
				
	}
}
