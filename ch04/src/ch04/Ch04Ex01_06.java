package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String gender = scanner.next();
		String input1 = scanner.next();
		
		 int age = Integer.parseInt(input1);
		 
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
		 
		 
		/*if(gender == "M") {
		} else if (age >= 18) {
			System.out.println("Man");
		} else if (age < 18) {
			System.out.println("Boy");
		} else if(gender == "F") {
		} else if (age >= 18) {
			System.out.println("Woman");
		} else {
			System.out.println("Girl");
		}*/
		
	}
}
