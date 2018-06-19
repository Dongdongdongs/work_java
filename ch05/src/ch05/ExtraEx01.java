package ch05;

public class ExtraEx01 {
	public static void main(String[] args) {
		
		String a = "KOITT";
		String b = "APPLE";
		String c = "CAR";
		
		char[] result = new char[5];
		
		result[0] = a.charAt(0);
		result[1] = a.charAt(1);
		result[2] = c.charAt(2);
		result[3] = b.charAt(4);
		result[4] = b.charAt(0);
		
		System.out.println(result);
		
		
	}
}
