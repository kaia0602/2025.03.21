package chapter12_2;

// 클래스 선언시 사용하는 final: 상속할 수 없는 클래스 선언
//final class Unit {
//	
//}

// final 클래스인 unit 을 사용불가
//class Marine extends Unit {
//	
//}

class Unit {
	// 메서드 작성시의 final: 오버라이딩 할 수 없는 메서드 선언
	final void doMove() {
		System.out.println("go");
	}
}

class Marine extends Unit {
	// Unit 의 doMove는 final 로 작성되어서 오버라이딩이 불가
//	@Override
//	void doMove() {
//		
//	}
}
public class Ex02_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		final int MAX_NUM = 10;
		// 변수 선언시 사용하는 final = 상수 선언으로 변경
	}

}
