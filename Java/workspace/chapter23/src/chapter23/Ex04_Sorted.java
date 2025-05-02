package chapter23;

import java.util.Arrays;
import java.util.List;

public class Ex04_Sorted {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("홍길동", "멀린", "해리포터");
		
		list.stream() // 컬렉션의 경우 stream()메서드로 Stream을 생성
		.sorted() // 기본은 오름차순
		.forEach(n -> System.out.print(n +"\t"));
		
		System.out.println();
		
		list.stream() 
		// 정렬방식 변경시 Comparator와 같이 람다식 사용
		.sorted((s1, s2) -> s1.length() - s2.length()) // 글자수 기준 정렬 			
		.forEach(n -> System.out.print(n +"\t"));
		
		System.out.println();
		
		
	}

}
