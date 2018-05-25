package ch02;
import java.util.*;

public class Ch02Ex02_08 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		double a = Double.parseDouble(input);
		String input1 = scanner.nextLine();
		double aa = Double.parseDouble(input1);
		String input2 = scanner.nextLine();
		
		
		System.out.printf("%5.2f%n", a);
		System.out.printf("%5.2f%n", aa);
		System.out.printf("%s", input2);
	}
}
