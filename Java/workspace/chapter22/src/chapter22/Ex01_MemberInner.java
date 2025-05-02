package chapter22;

// 외부 클래스 선언
class Outer1 {
	private int speed = 10; // 외부 클래스의 변수는 내부에서 자유롭게 사용가능
	
	// 내부 클래스 선언
	class MemberInner1 {
		// 내부 클래스의 메서드
		public void move() {
			System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
		}
	}	
	public void getMarine() {
		// 내부 클래스를 사용하기 위한 선언
		MemberInner1 inner = new MemberInner1();
		// 내부 클래스의 move() 메서드 실행
		inner.move();
	}
}

public class Ex01_MemberInner {

	public static void main(String[] args) {
		Outer1 out = new Outer1();
		// 외부 클래스를 사용하기 위한 선언
		
		out.getMarine();
		// 외부 클래스의 메서드를 실행하여 내부 클래스의 move도 함께 실행
		
		Outer1.MemberInner1 inner = out.new MemberInner1();
		// 내부 클래스를 main에서 직접선언 => 내부클래스도 외부 클래스처럼 사용가능
		// => 외부 클래스를 선언하지 않으면 내부 클래스도 선언할 수 없음
		
		inner.move();

	}

}
