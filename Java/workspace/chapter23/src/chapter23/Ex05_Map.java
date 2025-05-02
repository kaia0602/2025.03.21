package chapter23;

import java.util.Arrays;
import java.util.List;

public class Ex05_Map {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("apple", "banana", "orange");
		
		list.stream()
		// map(): 각 데이터에 코드를 실행 후 Stream으로 저장하는 중간연산 메서드
		.map(s -> s.toUpperCase())
		.forEach(n -> System.out.println(n + "\t"));
		
		System.out.println();
		
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
		// numlist의 데이터에 2를 곱하여 출력하는 스트림
		
		numList.stream()
		.map(n -> n * 2)
		.forEach(n -> System.out.print(n + "\t"));
	}

}
