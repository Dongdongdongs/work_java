package test03;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.lang3.StringUtils;

public class ListTest03 {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		// 1.반복문을 사용해서 1~30까지의 랜덤숫자를 총 10개를 strList에 추가하기
		// 2.출력
		
		for(int i = 0; i < 10; i++) {
			String num = (int)(Math.random()*30)+1 + "";
			/*if(num.length()<2) {
				num = "0" + num;
			}*/		//아래와 동일
			num = StringUtils.leftPad(num, 2, '0');
			
			strList.add(num);
			
/*			if(strList.indexOf(num)!= -1) {
				i--;
				continue;
			}*/
			
			}
		Collections.sort(strList);
		
		System.out.println(strList);
		
		for(int i = 0; i < 10; i++) {
			System.out.println(strList.get(i));
		}
	}
}
