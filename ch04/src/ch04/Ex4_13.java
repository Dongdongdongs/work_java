package ch04;

public class Ex4_13 {
	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
		// 하나씩 읽어서 검사한다.
		for(int i=0; i < value.length() ;i++) {
			/*ch = value.charAt(i);
			if(isNumber = '0' <= ch && ch <= '9' ? false : true) {
			isNumber = false;
			break;				
			}*/
			// value 문자열에 있는 문자 하나씩 끄집어내기
			ch = value.charAt(i);
			// 끄집어 낸 문자가 '0'과 '9'사이에 포함이 안되는경우
			if(!('0' <= ch && ch <= '9')) {
				// 숫자가 아님을 표시하기 위한 변수 
				isNumber = false;
				
				break;
			}
		}
		if (isNumber) {
		System.out.println(value+"는 숫자입니다.");
		} else {
		System.out.println(value+"는 숫자가 아닙니다.");
		}
	}
}
