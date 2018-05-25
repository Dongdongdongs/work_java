package ch02;
import java.util.*;
public class Ch02Ex02_14 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("yard? ");
		String input = scanner.nextLine();
		double a = Double.parseDouble(input);
		
		double aa = a*91.44;
		
		System.out.printf("%.1fyard = %.1fcm", a, aa);
	}
	
}
