package ch07;

class Tv2{		// 자바는 단일상속만 된다
	boolean power;	// 전원상태
	int channel;
	
	void power()		{power = !power;}
	void channelUp()	{++channel;}
	void channelDown()	{--channel;}
	}

class VCR{
	boolean power;
	int counter = 0;
	void power()	{power = !power;}
	void play()		{ /*내용생략*/}
	void stop()		{ /*내용생략*/}
	void rew()		{ /*내용생략*/}
	void ff()		{ /*내용생략*/}
}
	
class TVCR extends Tv2{
	VCR vcr = new VCR();
	int counter = vcr.counter;
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}
