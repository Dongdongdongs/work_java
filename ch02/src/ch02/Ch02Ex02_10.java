package ch02;
import java.util.*;

public class Ch02Ex02_10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a, aa;
		
		String input = scanner.nextLine();
		a = Integer.parseInt(input);
		String input1 = scanner.nextLine();
		aa = Integer.parseInt(input1);
		
		int aaa = a + aa;
		
		System.out.printf("%d + %d = %d", a, aa, aaa);
		
		
		
	}
	
}
