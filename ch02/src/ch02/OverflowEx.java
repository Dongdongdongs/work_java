package ch02;

public class OverflowEx {
	public static void main(String[] args) {
		short sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;
		
		System.out.println("sMin = " + sMin);	// 숏 최솟값 출력
		System.out.println("sMin-1=" + (short)(sMin-1));	// 숏 최솟값에 -1 해서 최대값됨
		System.out.println("sMax =" + sMax);	// 숏 최댓값 출력
		System.out.println("sMax+1 =" + (short)(sMax+1));	// 숏 최댓값에 +1 해서 최솟값됨
		System.out.println("cMin =" + (int)(cMin));		//
		System.out.println("cMin-1 =" + (int)--cMin);	// --cMin 1먼저 감소하고 사용, 0이 최솟값이므로 최솟값 -1 은 최댓값 따라서 65535 가 출력됨
		// cMin-- cMin 먼저사용후 1 감소 -> 0 출력됨
		System.out.println("cMax =" + (int)(cMax));		// 
		System.out.println("cMax+1= " + (int)++cMax);	//
		System.out.println(1);
	}
}
