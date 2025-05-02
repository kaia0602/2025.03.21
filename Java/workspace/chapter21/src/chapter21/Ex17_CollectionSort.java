package chapter21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLength implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
	
}

public class Ex17_CollectionSort {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("홍길동", "전우치", "손오공", "멀린");
		list = new ArrayList<String>(list);
		
		System.out.println(list);
		
		Collections.sort(list); // 리스트를 정렬 => sort(리스트변수)
		// 직접만든 클래스에는 comparable을 상속받아야 사용가능
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		// 내림차순 정렬
		
		Collections.sort(list, new StringLength());
		System.out.println(list);
		// sort(리스트변수, Comparetor 클래스): 정렬방식을 집접설정
	}

}
