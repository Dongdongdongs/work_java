package ch04;

public class FlowEx22 {
	public static void main(String[] args) {
		// C언어 사용자를 위한 배열 선언 및 초기화 코드
		// 자세한 내용은 5장에서 설명
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		// 기존 for문
		for(int i=0; i < arr.length; i++) {		// 배열변수.length; 배열의 크기(여기서는 5)
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		// 향상된 for문 (JDK 1.5 버전부터 사용가능), 배열의 처음부터 끝까지 다 씀
		// 형태 : for (타입 변수명 : 배열 또는 컬렉션)
		// 컬렉션은? 11장에서 설명
		for(int tmp : arr) {		// 배열에 들어가있는 값과 형태가 같아야함
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.println("sum="+sum);
		}
	}

