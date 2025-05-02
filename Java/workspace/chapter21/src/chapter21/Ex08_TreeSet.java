package chapter21;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex08_TreeSet {

	public static void main(String[] args) {

		TreeSet<String> tree = new TreeSet<>();
		// 0~9, a~z, ㄱ~ㅎ 순으로 정렬
		tree.add("홍길동");
		tree.add("전우치");
		tree.add("손오공");
		tree.add("멀린");
		tree.add("손오공");
		// 멀린	손오공	전우치	홍길동
		System.out.println("객체 수: " + tree.size());
		
		for (Iterator<String> itr = tree.iterator(); itr.hasNext();)
			System.out.print(itr.next().toString() + '\t');
		System.out.println();
		
		TreeSet<Integer> tree2 = new TreeSet<>();
		tree2.add(4);
		tree2.add(3);
		tree2.add(6);
		tree2.add(2);
		tree2.add(8);
		tree2.add(9);
		tree2.add(0);
		tree2.add(1);
		for(Integer t :tree2) {
			System.out.println(t + "\t");
		}
		System.out.println();
	}

}
