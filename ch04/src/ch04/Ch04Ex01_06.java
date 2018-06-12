package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		String gender = scanner.next();
		String input1 = scanner.next();
		
		 int age = Integer.parseInt(input1);
		*/
		
		String[] inputs = scanner.nextLine().split(" ");
		String gender = inputs[0];
		int age = Integer.parseInt(inputs[1]);
		/*
		if(gender.equals("M") && age >= 18) {
			System.out.println("MAN");
		}
		if(gender.equals("F") && age >= 18) {
			System.out.println("WOMAN");
		}
		if(gender.equals("M") && age < 18) {
			System.out.println("BOY");
		}
		if(gender.equals("F") && age < 18) {
			System.out.println("GIRL");
		}
		
		switch(gender) {
		 case "F" :
			 if(age >= 18) {
				 System.out.println("WOMAN");
			 } else {
				 System.out.println("GIRL");
			 }
			 break;
		 case "M" :
			 if(age >= 18) {
				 System.out.println("MAN");
			 }else {
				 System.out.println("BOY");
			 }
		 }
		 */

	}
}
