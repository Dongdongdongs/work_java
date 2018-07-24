package test04;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest3 {

	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();
		
		HashMap<String, String> animal1 = new HashMap<String, String>();
		animal1.put("동물이름", "리트리버");
		animal1.put("나이", "4");
		aList.add(animal1);
		
		HashMap<String, String> animal2 = new HashMap<String, String>();
		animal2.put("동물이름", "코리안숏헤어");
		animal2.put("나이", "6");
		aList.add(animal2);
		
		HashMap<String, String> animal3 = new HashMap<String, String>();
		animal3.put("동물이름", "섀퍼트");
		animal3.put("나이", "5");
		aList.add(animal3);
		
		HashMap<String, String> animal4 = new HashMap<String, String>();
		animal4.put("동물이름", "샴");
		animal4.put("나이", "7");
		aList.add(animal4);
		
		for(int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}
	}
}
