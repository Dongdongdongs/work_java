package test03;

import java.util.ArrayList;

public class ListTest01 {
	public static void main(String[] args) {
		String[] arr = new String[3];// 데이터 타입은 스트링 배열
		String[] arr2 = {"a", "b", "c"};
		System.out.println(arr);
		System.out.println(arr2);

		ArrayList<String> al;			// 스트링만 저장할수 있는 어레이리스트
		al = new ArrayList<String>();	
		al.add("a");					// 메소드 호출				// 메소드 2가지 타임, 리턴이 있냐 없냐
		al.add("b");
		al.add("c");
		System.out.println(al);
		
		
	}
}
