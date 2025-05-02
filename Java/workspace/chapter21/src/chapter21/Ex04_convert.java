package chapter21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex04_convert {

	public static void main(String[] args) {
		
		// Arrays.asList 로 만든 리스트는 변경이 안됨
		List<String> list = Arrays.asList("홍길동", "전우치", "손오공", "전우치");
		list = new ArrayList<>(list); // 수정 가능한 리스트로 변경
		list.add("해리포터");
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();
		
		// ArrayList를 LinkedList로 변경하여 저장
		list = new LinkedList<>(list);
		
		for (String s : list)
			System.out.print(s + '\t');
		System.out.println();
	}

}
