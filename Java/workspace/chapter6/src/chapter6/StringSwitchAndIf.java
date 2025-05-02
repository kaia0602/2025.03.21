package chapter6;

public class StringSwitchAndIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "홍길동";
		switch(name) {
		case "홍길동" :
			System.out.println("제 이름은 홍길동입니다.");
			break;
		case "전우치" :
			System.out.println("제 이름은 전우치입니다.");
			break;
		case "손오공" :
			System.out.println("제 이름은 손오공입니다.");
			break;
		default :
			System.out.println("일치하는 이름이 없습니다.");
		// switch는 문자열을 == 연산자로 비교가능
		}
		
		// if문의 경우 문자열 비교시 ==을 사용하여 비교할 수 없음
		String name2 = "홍길동";
		if (name == name2) {
			System.out.println("제 이름은 홍길동입니다.");
		}else if (name == "전우치") {
			System.out.println("제 이름은 전우치입니다.");
		}else if (name == "손오공") {
			System.out.println("제 이름은 손오공입니다.");
		}else {
			System.out.println("일치하는 이름이 없습니다.");
		}
		
		// .equals(): 데이터를 비교 
		// String의 경우 클래스 자료형이기 때문에 equals()로 비교해야 결과가 정상적으로 출력
		String name3 = "kaia";
		String name4 = new String ("kaia");
		System.out.println(name3.equals(name4));
		
		// 기초 자료형: byte, short, int, long, float, double, boolean, char
		// == 으로 비교 
		// 클래스 자료형: Byte, Short, Integer, Long, Float, Double, Boolean, Character
		// equals()로 비교
	
	}
	
}
