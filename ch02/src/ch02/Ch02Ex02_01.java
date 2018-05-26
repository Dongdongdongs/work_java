package ch02;

import java.util.*;

public class Ch02Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("kor ");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.printf("mat ");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		
		System.out.printf("eng ");
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		
		int sum = num + num1 + num2;
		System.out.printf("sum %d%n",sum) ;
		
		int avg = (num + num1 + num2)/3;
		System.out.printf("avg %d",avg);		
		
		//System.out.printf("sum %d%n", num1+num2+num3);
		/* scaaner를 이용해서 성적 문자열로 입력 받기(3번)
		 * String strKor = scanner.nextLine();
		 * String strMat = scanner.nextLine();
		 * String strEng = scanner.nextLine();
		 * 
		 * 문자열로 입력받은 성적을 정수(int)형으로 변경
		 * 
		 * int kor = Integer.parseInt(strKor);
		 * int mat = Integer.parseInt(strMat);
		 * int eng = Integer.parseInt(strEng);
		 * 
		 * int sum = kor + mat + eng;
		 * int avg = sum /3;
		 * 
		 * printf() 이용해서 출력
		 * System.out.printf("kor %d%n, kor);
		 * System.out.printf("mat %d%n, mat);
		 * System.out.printf("eng %d%n, eng);
		 * System.out.printf("sum %d%n, sum);
		 * System.out.printf("avg %d%n, avg);
		 */
	}
}
