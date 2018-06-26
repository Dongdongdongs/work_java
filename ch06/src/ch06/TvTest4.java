package ch06;

public class TvTest4 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];		// 길이가 3인 tv객체 배열
		
		// tv 객체를 생성해서 v객체 배열의 각 요소에 저장
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;		// tvArr[i]의 채널에 i+10 저장
		}
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();	// tvArr[i]의 메서드를 호출. 채널이 1증가
			System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
		}
	}
}
