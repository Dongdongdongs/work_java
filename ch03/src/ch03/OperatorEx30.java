package ch03;

public class OperatorEx30 {


	// 코드 자동정렬 법
	// 1. Ctrl + a 눌러서 범위 지정(전체범위)
	// 2. Ctrl + i 눌러서 지정한 범위의 코드 자동 정렬

	public static void main(String[] args) {
		int dec = 8;

		// 비트를 오른쪽으로 0칸이동
		System.out.printf("%s%n", toBinaryString(dec >> 0));

		//비트를 오른쪽으로 1칸이동
		System.out.printf("%s%n", toBinaryString(dec >> 1));

		// 비트를 오른쪽으로 2칸 이동
		System.out.printf("%s%n", toBinaryString(dec >> 2));

		// 비트를 왼쪽으로 0칸이동
		System.out.printf("%s%n", toBinaryString(dec << 0));

		//비트를 왼쪽으로 1칸이동
		System.out.printf("%s%n", toBinaryString(dec << 1));

		// 비트를 왼쪽으로 2칸 이동
		System.out.printf("%s%n", toBinaryString(dec << 2));

		dec = -8;

		// 비트를 오른쪽으로 0칸이동
		System.out.printf("%s%n", toBinaryString(dec >> 0));

		//비트를 오른쪽으로 1칸이동
		System.out.printf("%s%n", toBinaryString(dec >> 1));

		// 비트를 오른쪽으로 2칸 이동
		System.out.printf("%s%n", toBinaryString(dec >> 2));

		// 비트를 왼쪽으로 0칸이동
		System.out.printf("%s%n", toBinaryString(dec << 0));

		//비트를 왼쪽으로 1칸이동
		System.out.printf("%s%n", toBinaryString(dec << 1));

		// 비트를 왼쪽으로 2칸 이동
		System.out.printf("%s%n", toBinaryString(dec << 2));

		
	}
	static String toBinaryString(int x) {

		String zero = "00000000000000000000000000000000";	//32비트(32개)
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);

	}
}
