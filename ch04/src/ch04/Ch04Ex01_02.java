package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] numbers = scanner.nextLine().split(" ");
		int weight = Integer.parseInt(numbers[1]);
		int height = Integer.parseInt(numbers[0]);

		int Obersity = weight + 100 - height;

		if(Obersity > 0) {
			System.out.println(Obersity);
			System.out.println("Obersity");
		}


		/*String input = scanner.next();
		String input1 = scanner.next();

		int Hight = Integer.parseInt(input);
		int Weight = Integer.parseInt(input1);

		int Obersity = Weight + 100 - Hight;

		if(Obersity > 0) {
			System.out.println(Obersity);
			System.out.println("Obersity");
		}*/
	}
}
