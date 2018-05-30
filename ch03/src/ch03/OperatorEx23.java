package ch03;

public class OperatorEx23 {
public static void main(String[] args) {
	String str1 = "abc";
	String str2 = new String("abc");	// new 키워드 있으면 heap 영역에 저장
	
	System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");	// ==는 메모리주소 비교
	System.out.printf(" str1==\"abc\" ? %b%n",	str1=="abc");
	System.out.printf(" str2==\"abc\" ? %b%n",	str2=="abc");
	System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));	// String 클래스에 있는 메소드 equals()
	System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
	System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
	System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	
	// Str1.equals("abc");
	// ㄴ 변수의 값과 equals의 괄호안의 값 비교
	// Str1.equalsIgnoreCase()
	// ㄴ 대소문자 구분없이 값 비교

}
}
