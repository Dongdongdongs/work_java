package ch03;

public class Ex {
public static void main(String[] args) {
	

	
	
	int fahrenheit = 100;
	float celcius = (float)((int)((float)5/9*(fahrenheit - 32)*100)+1)/100;
	System.out.println("Fahrenheit:"+fahrenheit);
	System.out.println("Celcius:"+celcius);

	/*
	char ch = '1';
	boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
	
	System.out.println(b);
	
	
	char ch1 = 'B';
	char lowerCase = (char) ('A' <= ch1 && ch1 <= 'Z' ? ch1+32 : ch1);
	System.out.println("ch:"+ch1);
	System.out.println("ch to lowerCase:"+lowerCase);
	*/
	
	
}
}
