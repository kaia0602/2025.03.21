package chapter23;

import java.util.Arrays;
import java.util.List;

public class Ex07_Reduce {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("홍길동", "전우치", "손오공");
		
		String name1 = list1.stream() // stream이 실행되고 저장할 변수를 선언
				.reduce("이순신",	(s1, s2) -> s1.length() >= s2.length() ? s1 : s2);
		System.out.println(name1);
		
		
		List<String> list2 = Arrays.asList("홍길동", "멀린", "해리포터");
		
		String name2 = list2.stream()
				.reduce("이순신",	(s1, s2) -> s1.length() >= s2.length() ? s1 : s2);
		System.out.println(name2);
	}

}
