package ch03;

public class OperatorEx24 {
	public static void main(String[] args) {
		int x = 0;
		char ch = ' ';
		
		// x 값이 10 초과이고 20 미만인지 확인
		x = 15;
		System.out.printf("x=%2d, 10 < x && x <20 =%b%n", x, 10 < x && x < 20);
		
		x = 6;
		// 나머지연산자 먼저, 6나누기2 는 0, 투르, 오어 연산자 처음에 트루가 나와서, 뒤에 계산하지 않고 투르로 나옴, 좌변이 트루가 되면 연산 안함
		// ||(OR)는 좌변이 ture일 경우 우변을 계산하지 않고 ture를 리턴한다.
		System.out.printf("x=%2d, x%%2==0 || x%%3==0 && x%%6!=0 =%b%n", x, x%2==0||x%3==0&&x%6!=0);
		// &&(AND)는 좌변이 false일 경우 우변을 계산하지 않고 false를 리턴한다.
		// 여기서는 좌변이 ture이기 때문에 우변까지 확인하고 결과를 리턴하게 된다.
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!=0 =%b%n", x, (x%2==0||x%3==0)&&x%6!=0);

		// 변수 ch가 문자 '0'이상 문자 '9' 이하인지 확인
		ch = '1';
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b%n", ch, '0' <= ch && ch <= '9');

		// 변수 ch가 문자 'a'이상 문자 'z' 이하인지 확인
		ch = 'a';
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' =%b%n", ch, 'a' <= ch && ch <='z');
		
		// 변수 ch가 문자 'A'이상 문자 'Z' 이하인지 확인
		ch = 'A';
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'z' =%b%n", ch, 'A' <= ch && ch <='Z');
		
		// 변수 
		ch = 'q';
		System.out.printf("ch='%c', ch=='q' || ch=='Q' =%b%n", ch, ch=='q' || ch=='Q');
		
	}
}
