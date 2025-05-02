package chapter22;

class HumanCamp2 {
	private int speed = 10;

	public void getMarine() {
		// 지역내부 클래스: getMarine 메서드 안에서 실행
		class Marine2 {
			public void move() {
				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
			}
		}

		Marine2 inner = new Marine2();
		inner.move();
	}
}

public class Ex02_LocalInner {

	public static void main(String[] args) {

		HumanCamp2 hc = new HumanCamp2();
		hc.getMarine();

	}

}
