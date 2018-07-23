package test03;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {		// 방을 2개가지고 있는 배열생각해도됨, 멥과 키와 1:1 매칭을 해줘야함
		HashMap<String,String> personInfo =			// get 으로 키값을 가져옴
				new HashMap<String,String>();			// Linked, 입력값 순서대로 넣을때
		personInfo.put("이름", "홍길동");
		personInfo.put("나이","33");
		personInfo.put("주소","서울");	
		
		System.out.println(personInfo);
		
		String age = personInfo.get("나이");
		System.out.println("personInfo의 나이 : " + age);		// 33이라는 글자가 나옴 
															// arraylist 는 순서가 중요 하지만 맵은 아님
		
		ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
		
		al.add(new HashMap<String,String>());
		
		al.add(personInfo);
	}
}
