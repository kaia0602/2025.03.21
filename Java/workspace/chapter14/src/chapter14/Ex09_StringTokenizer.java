package chapter14;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex09_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// StringTokenizer(원본 문자열): 공백을 기준으로 문자열을 분리함 (공백생략)
		// StringTokenizer(원본 문자열, 구분문자): 구문분자를 기준으로 문자열을 분리함 (구분 문자 생략)
		// StringTokenizer(원본 문자열, 구분문자, true): 구문분자도 함께 분리함
		StringTokenizer st1 = new StringTokenizer("a b c");
		
		// hasMoreTokens(): 다음글자가 있는지 확인하고 있으면 true, 없으면 false를 출력함
		while (st1.hasMoreTokens()) {
			// nextToken(): 다음문자를 출력
			System.out.println(st1.nextToken());
		}
		// Iterator 클래스
		// has 메서드로 확인하고 next 메서드로 데이터를 꺼내는 클래스
			
		// split(): StringTokenizer처럼 문자열을 분리하는 메서드
		// 구분자를 저장하는 기능이 없음
		// 대신 정규표현식을 사용하여 더욱 유연하게 구분 가능
		String str = "010-1234-56789";
		String[] parts = str.split("-");
		System.out.println(Arrays.toString(parts));
		for (int i = 0; i < parts.length; i++) {
			System.out.println(parts[i]);
		}
		

	}

}
