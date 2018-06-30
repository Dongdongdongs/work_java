package ch07;

import static java.lang.System.out;
import static java.lang.Math.*;			// * 메스 클래스 내부에있는 모든.

public class StaticImportEx1 {
	public static void main(String[] args) {
		//System.out.println(Math.random());
		out.println(random());
		
		//System.out.println("Math.PI : " + Math.PI);
		out.println("Math.PI : " + PI);
	}
}
