package prac1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class pra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 학점(‘A’, ‘B’, ‘C’, ‘D’, ‘F’)을 컬렉션에 저장하라. 그러고 나서 컬렉션을 검색하여 학점을 점수
//		(A=4.0, B=3.0, C=2.0, D=1.0, F=0.0)로 변환하여 출력하는 프로그램을 작성하라.
//		1) Array 컬렉션을 이용 
//		2) HashMap 컬렉션을 이용 

		List<String> arr = new ArrayList<>();
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add("D");
		arr.add("F");

		for (String s : arr) {
			if (s.equals("A")) {
				System.out.println(s + "=4.0");
			} else if (s.equals("B")) {
				System.out.println(s + "=3.0");
			} else if (s.equals("C")) {
				System.out.println(s + "=2.0");
			} else if (s.equals("D")) {
				System.out.println(s + "=1.0");
			} else {
				System.out.println(s + "=0.0");
			}
		}
		
		HashMap<String, Double> map = new HashMap<>();
		map.put("A", 4.0);
		map.put("B", 3.0);
		map.put("C", 2.0);
		map.put("D", 1.0);
		map.put("F", 0.0);
		
		Set<String> ks = map.keySet();
		
		for (String s : ks) 
			System.out.println(s + "=" +map.get(s).toString());
	}

}
