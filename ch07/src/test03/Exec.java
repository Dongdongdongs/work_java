package test03;

import java.util.ArrayList;

public class Exec {

	public static void main(String[] args) {
/*		Person p1 = new Person();
	
		p1.setName("동동");
		p1.setAge(27);
		p1.setPoint(20);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getPoint());
*/	
	
/*		ArrayList<Person> pList = new ArrayList<Person>();*/
/*		Person p = new Person();
		System.out.println(p.getName());
		pList.add(p);
		p.setName("홍길동");
		
		System.out.println(pList.get(0).getName());
		*/
		//pList.add(new Person());		// == Person p = new Person();
		
		ArrayList<Person>pList = new ArrayList<Person>();
		
		for(int i = 0; i<5; i++) {
			Person p = new Person();	
			p.setName("테스트"+(i+1));
			p.setAge((i+1)*10);
			pList.add(p);
		}
		
		for(int i = 0; i < 5; i++) {
			Person p = pList.get(i);
			System.out.println(p.getName() + "," + p.getAge());
		}
	}
}
