package chapter22;

import java.util.ArrayList;
import java.util.Comparator;

interface Unit3 {
	void move();
}

class HumanCamp3 {
	private int speed = 10;

	public Unit3 gerMarine() {
//		// 지역내부 클래스
//		class Marine3 implements Unit3 {
//			
//			public void move() {
//				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
//				
//			}
//		}
//
//		return new Marine3();

		return new Unit3() {
			public void move() {
				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
			}
		};
	}
}

public class Ex03_AnonymousInner1 {

	public static void main(String[] args) {

		HumanCamp3 hc = new HumanCamp3();
		Unit3 unit = hc.gerMarine();
		unit.move();
		
		Unit3 unit2 =  new Unit3() {

			@Override
			public void move() {
				System.out.printf("인간형 유닛이" + 10 + "속도로 이동합니다.\n");
			}
		};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(4);
		list.add(2);
		
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return  o1 - o2;
			}
		});
		System.out.println(list);
}

}
