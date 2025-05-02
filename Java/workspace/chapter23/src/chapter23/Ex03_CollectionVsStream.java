package chapter23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex03_CollectionVsStream {

	public static void main(String[] args) {

		int[] arr = {1, 5, 3, 2, 4};
		
		// Arraylist 컬렉션을 이용하여 저장공간 생성
		List<Integer> list = new ArrayList<>();
		
		// list의 홀수만 저장
		for (int i : arr) {
			if (i % 2 == 1) {
				list.add(i);
			}
		}
		
		// list의 데이터를 오름차순 정렬
		Collections.sort(list);
		
		// list의 데이터를 출력
		for (int i : list) {
			System.out.print(i + "\t");
		}
		
		System.out.println("");
		
		
		Arrays.stream(arr) // 스트림 생성
		.filter(n -> n %2 ==1) // filter(): 홀수만 저장하는 반복문 
		.sorted() // sorted():list의 데이터를 오름차순 정렬			
		.forEach(n -> System.out.print(n +"\t"));
		
		System.out.println();
	}

}
