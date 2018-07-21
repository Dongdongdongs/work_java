package test01;

public class Clac {
		
		private int add(int n1, int n2) {
			return n1+n2;
		}
		public int minus(int n1, int n2) {
			return n1-n2;
		}
		int multiple(int n1, int n2) {
			return n1 * n2;
		}
		int divide(int n1, int n2) {
			return n1/n2;
		}
		
	
		public static void main(String[] args) {
			Clac c = new Clac();
			int result = c.add(1, 2);
			System.out.println(result);
			result = c.minus(5, 2);
			System.out.println(result);
			result = c.multiple(5, 2);
			System.out.println(result);
			result = c.divide(5, 2);
			System.out.println(result);
			System.out.println(c.divide(5, 2));
		}
}
