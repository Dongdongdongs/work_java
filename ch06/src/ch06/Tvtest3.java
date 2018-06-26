package ch06;

public class Tvtest3 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
		
		t2 = t1;		// t1이 지정하고 있는 값(주소)를 t2에 저장한다. -> 객체를 옮김
		t1.channel = 7;	// 채널을 7
		System.out.println("t1의 channel 값을 7 로 변경하였습니다.");
		
		System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
	}
}
