package ch02;

public class FloatToBinEx {
	public static void main(String[] args) {
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i);	// 16진수로 출력, 원래 AD 가 나와야하는데 오차가 발생하여 AE가 나옴
	}
}
