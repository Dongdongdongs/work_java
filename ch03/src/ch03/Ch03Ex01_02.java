package ch03;

import java.util.Scanner;

public class Ch03Ex01_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		// ++num = num + 1; 굳이 대입연산자를 쓸필요가 없음
		System.out.println(num++);	
		
					
		++num;
		
	
		System.out.println(num);
	}
}

