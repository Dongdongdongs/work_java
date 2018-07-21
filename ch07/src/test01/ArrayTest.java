package test01;

public class ArrayTest {
	public static void main(String[] args) {
		int[] a = new int[5];
		System.out.println(a[0]);
		
		for(int i = 0; i < a.length; i++) {
			int b = (int)(Math.random()*10);
			
			a[i] = b;
			
			for(int j = i -1; j >= 0; j--) {
				if(b == a [j]) {
					j = 0;
					i--;
				}
			}
			
		}
		for(int i= 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
