package ch04;

public class Ex4_09 {
public static void main(String[] args) {
	String str = "12345";
	int sum = 0;
	for(int i=0; i < str.length(); i++) {
		/*char answer = str.charAt(i);
		sum += answer - '0';*/
		int num = str.charAt(i) - '0'; //문자열로 되어있기 때문에 2개의 문자 아스키 코드값을 빼줘서 저장
		sum += num;						// -48 해도 됨			
	}
	System.out.println("sum="+sum);
}
}
