package chapter21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex11_ConvertExt {

	public static void main(String[] args) {
		List<String> fixedSizeList = Arrays.asList("홍길동", "전우치", "전우치", "손오공");
		// Arrays.asList: 변경 불가한 리스트 생성
		
		ArrayList<String> list = new ArrayList<>(fixedSizeList);
		// 변경가능한 리스트 생성
		
		for(String s : list) // 출력가능한 for문
			System.out.print(s.toString() + '\t');
		System.out.println();
		
		// list를 HashSet으로 변경하여 중복제거
		HashSet<String> set = new HashSet<String>(list);
		
		// ArrayList로 변경
		list = new ArrayList<String>(set);
		
		// list에 저장된 데이터 출력
		for(String s : list)
			System.out.print(s.toString() + '\t');
		System.out.println();
	}

}
