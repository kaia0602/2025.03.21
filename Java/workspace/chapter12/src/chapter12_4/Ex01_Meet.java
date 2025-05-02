package chapter12_4;

// 인터페이스
// 클래스 생성시의 구조를 정해놓은 인터페이스
// 메서드 이름과 호출방식, 매개변수를 작성하여 실제 실행 코드는 없음

// interface의 경우 abstract를 적을 필요없이 추상메서드 생성
interface Greet {
	void greet();
}

interface Talk {
	void talk();
}

// 인터페이스 상속하기
// implements를 이용하여 interface를 상속받는다
// 클래스, 추상 클래스와 다르게 여러 인터페이스 상속 가능
class Morning implements Greet, Talk {

	@Override
	public void talk() {
		System.out.println("How are you?");
	}

	@Override
	public void greet() {
		System.out.println("Hello");
	}
	
}

public class Ex01_Meet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Morning morning= new Morning();
		morning.greet();
		morning.talk();
	}

}
