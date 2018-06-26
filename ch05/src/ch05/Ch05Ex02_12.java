package ch05;

import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class Ch05Ex02_12 {
	public static void main(String[] args) {
	/*	Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[100];
		int[] count = new int[10];
		for(int i = 0; i < 100; i++) {
			String input = scanner.nextLine();
			num[i] = Integer.parseInt(input);
			
		if(10 <= num[i] && num[i] < 20) {
				count[0]++;
			} else if(20 <= num[i] && num[i] < 30) {
				count[1]++;
			} else if(30 <= num[i] && num[i] < 40) {
				count[2]++;
			} else if(40 <= num[i] && num[i] < 50) {
				count[3]++;
			} else if(50 <= num[i] && num[i] < 60) {
				count[4]++;
			} else if(60 <= num[i] && num[i] < 70) {
				count[5]++;
			} else if(70 <= num[i] && num[i] < 80) {
				count[6]++;
			} else if(80 <= num[i] && num[i] < 90) {
				count[7]++;
			} else if(90 <= num[i] && num[i] < 100) {
				count[8]++;
			} else if(100 == num[i]) {
				count[9]++;
			}			
			if(num[i] == 0) {
				break;
			}
		}
		for(int i = count.length -1; i >= 0 ; i--) {
			if(count[i] > 0) {
				System.out.printf("%d : %d person%n", (i*10)+10, count[i]);
			}
		}*/
		
		int[] numbers = new int[2];
	
		int i = 0;
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int num = Integer.parseInt(scanner.nextLine());
			
			if(i == numbers.length) {
				int[] tmp = new int[numbers.length * 2];
				System.arraycopy(numbers, 0, tmp, 0, numbers.length);
				numbers = tmp;
			}
			
			numbers[i] = num;
			if(numbers[i] == 0) {
				break;
			}
			i++;
		}
		// 점수대별 학생 수를 저장하는 배열
		// 9번 인덱스 : 100점대 학생
		// 8번 인덱스 : 90점대 학생
		// 0 번인덱스 : 10점대 학생
		int[] counter = new int[10];
		// 현재 i변수의 값은 입력받은 점수(0포함)의 개수와 같다.
		// 0번부터 입력받은 점수 개수까지 반복
		for (int j = 0; j < i; j++) {
			// 실제 점수에 나누기 10을 한 몫에  -1을 하면 인덱스 번호와 일치한다.
			int index = numbers[j]/10 -1;
			counter[index]++;
		}
		for(int j = counter.length - 1; j >= 0; j--) {
			if(counter[j] != 0) {
				System.out.printf("%d : %d person%n",(j+1)*10, counter[j]);
			}
		}
		
	}
}
