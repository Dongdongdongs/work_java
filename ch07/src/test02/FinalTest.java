package test02;

class Test{
	public final void test() {
		System.out.println("abc");
	}
}

public class FinalTest extends Test{
	public static final int NUM_TEST = 1;
	
/*	public void test() {			// 메소드에 fianl 들어가서 오버라이딩이 안됨
		System.out.println("재정의");
	}*/
	
	public static void main(String[] args) {
		System.out.println(FinalTest.NUM_TEST);
	}
	
}
