package ch05;

public class ArrayEx14 {
	public static void main(String[] args) {
		String src = "ABCED";
		
		for(int i= 0 ; i < src.length(); i++) { // src.length() 문자열 src의 길이를 알고싶을때
			char ch = src.charAt(i);			// src의 i번째 문자르 ch에 저장
			System.out.println("src.charAt("+i+") : "+ ch);
		}
		// String 을 char[]로 변환
		char[] chArr = src.toCharArray();
		
		// char배열을(char[])을 출력
		System.out.println(chArr);
				
	}
}
