package chapter21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex06_Set {
	public static void main(String[] args) {
		// set으로 자료형을 설정하면 set을 상속받는 class를 모두 저장할수 있다
		Set<String> set = new HashSet<>();
		// HashCode(): 객체를 숫자로 변환하여 반환
		// 같은 HashCode를 가지면 중복으로 취급
		set.add("orange");
		set.add("apple");
		set.add("banana");
		set.add("apple");
		// orange	banana	apple	
		// 중복제거 저장된 순서 변경
		// 인덱스가 없음
		// remove(): 의경우에 정확한 데이터의 값을 넣어야함 (인덱스 없기때문)
		
		System.out.println("객체 수: " + set.size());
		// 인덱스를 이용한 출력이 불가하기에 iterator나 foreach문으로 출력
		
		for(Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();
		
		set.remove("banana");
		
		for(String s : set)
			System.out.print(s + '\t');
		System.out.println();
	}

}
