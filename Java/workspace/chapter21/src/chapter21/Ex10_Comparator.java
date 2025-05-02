package chapter21;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyStringComparator implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
		// 글자길이 기준으로 비교
	}
}

public class Ex10_Comparator {

	public static void main(String[] args) {
//		Set<String> tree = new TreeSet<>(); 멀린	전우치	해리포터	홍길동
		Set<String> tree = new TreeSet<>(new MyStringComparator());
		// 멀린	홍길동	해리포터	
		// 이미 만들어진 String 클래스의 정렬기준을 변경할 수 있음
		tree.add("홍길동");
		tree.add("전우치");
		tree.add("전우치");
		tree.add("멀린");
		tree.add("해리포터");
		
		for(String s : tree)
			System.out.print(s.toString() + '\t');
		System.out.println();

	}

}
