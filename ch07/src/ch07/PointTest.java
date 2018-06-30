package ch07;

public class PointTest {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
	}
}

class Point2 {		// Point2 의 기본생성자가 없어서 오류
	int x;
	int y;
	
	Point2(){
		
	}
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point2 {
	int z;
	
	Point3D(int x, int y, int z){
		//super(x, y);		// 부모의 기본생성자 호출 (명시적으로 작성하지 않으면 자동으로 컴파일러가 추가)
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override // 에노테이션
	String getLocation() {	// 오버라이딩 = 결과, 동적바인딩 = 과정     ,  <- 왼쪽에 초록색 화살이 오버라이딩 되었다 표시
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}