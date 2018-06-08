package ch04;
import java.util.Scanner;
public class Ch04EX01_03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int age = Integer.parseInt(input);
		
		if(age >= 20) {
			System.out.println("agult");
		} else {
			System.out.printf("%d years later", 20-age);
		}
	}
}
