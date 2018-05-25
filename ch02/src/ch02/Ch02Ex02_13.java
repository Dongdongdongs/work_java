package ch02;
import java.util.*;

public class Ch02Ex02_13 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int a = Integer.parseInt(input);
		String input1 = scanner.nextLine();
		int aa = Integer.parseInt(input1);
		String input2 = scanner.nextLine();
		int aaa = Integer.parseInt(input2);
		
		int a1 = a + aa + aaa;
		int a2 = (a+aa+aaa)/3;
		
		System.out.printf("sum = %d%n", a1);
		System.out.printf("avg = %d", a2);
		
				
				
				
				
	}
}
