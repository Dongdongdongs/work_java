package ch06;

class Tv {
		
	//TV의 속성(멤버변수)
	String color;		// 색상
	boolean power;		// 전원상태
	int channel;		// 채널

	//tv의 기능(메서드)
	void power() { power = !power; }	// tv를 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++channel; }	// tv의 채널을 높이는 기능을 하는 메서드
	void channelDown() { --channel; }	// tv의 채널을 낮추는 기능을 하는 메서드

	// 블리언에서 사용하는 파워랑 보이드 파워의 파워랑 같다는 거로 파란색 표시함
}
