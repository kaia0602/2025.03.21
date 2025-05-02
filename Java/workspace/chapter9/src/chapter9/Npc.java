package chapter9;

// 코드 자동정렬 : ctr + shift + f

// 클래스: 객체와 관련된 데이터와 처리동작을 한데 모은 코드 뭉치
//		인스턴스		변수	  메서드       인스턴스 생성 코드(설계도)

public class Npc {
// 멤버변수 > 데이터를 저장하는 용도
	String name;
	int hp;

	void setHp(long amount) {
		if (amount < 1) {
			amount = 1;
		} else if (amount > 100) {
			amount = 100;
		}
		this.hp = (int) amount;
		// 멤버변수에 데이터를 설정하는 메서드 > set 메서드, setter
	}

	void setName(String name) {
		// 멤버변수 매개변수
		// 이름의 글자수가 2 ~10까지만 저장
		if (name.length() < 2) {
			System.out.println("2글자 이상 입력해주세요");
			name = "재설정필요";
		} else if (name.length() > 10) {
			System.out.println("10글자 이하로 입력해주세요");
			name = "재설정필요";
		}
		this.name = name;
		// this는 자기 자신(인스턴스 자신)
		// this의 .을 이용하여 메서드, 멤버변수를 사용할 수 있음
	}

	public int getHp() {
		return hp;
	}

	public String getName() {
		return name;
	}
	// setter 자동완성하기
	// 1. source를 열기 -> 2. generate getters and setters 클릭
	// 3. getter, setter을 생성할 멤버변수 선택하기 -> 4.generate버튼

	public void say() {
		System.out.println("Hi, i'm " + this.name + "입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클라스명 인스턴스명 = new 생성자();
		Npc n = new Npc();
		// 클래스를 이용한 인스턴스 생성
		// 클래스에 데이터 설정하기

		// 직접적으로 변수에 데이터를 저장하는 방식
		n.hp = 100;
		n.name = "경비";

		// 각변수에 맞는 setter를 사용
		n.setHp(100);
		n.setName("경비");
		// 클래스에서 데이터 꺼내쓰기
		System.out.println("이름: " + n.name);
		System.out.println("hp: " + n.hp);
		// 직접적으로 변수명을 사용
		System.out.println("이름: " + n.getName());
		System.out.println("hp: " + n.getHp());
		// getter을 사용하는 방식

		// 직접 사용하는 방식을 사용하지 않는 이유
		// 데이터 설정시 특정한 범위의 데이터를 저장하거나 특정한 조건이
		// 있는 경우 제한 할수 없음

		n.say();
	}

}
