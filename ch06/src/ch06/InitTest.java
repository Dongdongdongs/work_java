package ch06;

class InitTest {
	int x;			// 인스턴스 변수 x = 0
	int y = x;		// 인스턴스 변수 y = 0
	
	void method1() {
		int i = 0;			// 지역변수 : 현재 i 값은 알수없음
		int j = i;		// 에러. 지역변수를 초기화하지 않고 사용
	}
	

}
