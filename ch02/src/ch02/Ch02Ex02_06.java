package ch02;
import java.util.*;
public class Ch02Ex02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		// String strNum1 = scanner.nextLine();
		// String strNum2 = scanner.nextLine();
		
		String input = scanner.nextLine();
		float num = Float.parseFloat(input);
		String input1 = scanner.nextLine();
		float num2 = Float.parseFloat(input1);
		
		// double num1 = Double.parseDouble(strNum1);
		// double num2 = Double.parseDouble(strNum2);
		
		float a = 91.44f; // 소수 기본형 더블이므로 f 를 넣어주던가 변수를 더블로 저장
		float num1 = num * a;
		
		// double fromYard = num1 * 91.44;
		// double fromInch = num2 * 2.54;
		
		float b = (float) 2.54;
		float num3 = num2 * b;
		
		// System.out.printf("%4.1fyd = %5.1fcm#n", num1, formYard);
		// System.out.printf("%4.1fin = %5.1fcm", num2, formInch);
		
		System.out.printf("%4.1fyd = %5.1fcm%n", num, num1);
		System.out.printf("%4.1fin = %5.1fcm", num2, num3);
		
	}

}
