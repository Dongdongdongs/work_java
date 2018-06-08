package ch04;

public class Ex4_01 {
	public static void main(String[] args) {
		
	
	int x = 15;
	char ch = 'A';
	int year = 2000;
	boolean powerOn = false;
	String str = "yes";
	
	//1
	boolean one = 10 < x && x <20;
	//2
	boolean twoOne = !(ch == ' ' || ch == '\t');
	boolean twoTwo = ' ' != ch || ch != '\t'; //내가 한거
	//3
	boolean three = ch == 'x' || ch == 'X';
	//4
	boolean four = '0' <= ch && ch <= '9';
	//5
	boolean five = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'A');
	boolean fivetwo = 'a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'A'; // 내가한거
	//6. 윤년계산식
	boolean six = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
	boolean sixtwo = year%400 == 0 && year%4 == 0 && year %100 != 0;//
	//7
	boolean seven = !powerOn;
	boolean seventwo = powerOn == false;
	//8
	boolean eight = str.equals("Yes");
	boolean eighttwo = "yes".equals(str);
	
}
}