package chapter9;


// 메서드 오버로딩: 매개변수의 개수나 자료형은 다르지만 메서드명을 같은 메서드를 정렬하는 방식
// 필요이유: 같은 이름으로 메서드 작성시 자료형이 달라도 실행되도록 만들기 위해
// 예시: System.out.println();

class Calc {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a) {
		return a + 1;
	}

	double add(double a, double b) {
		return a + b;
	}

	int add(double a) {
		return (int) a + 1;
	}

	// 메서드의 리름이 같아도 매개변수의 개수가 다르거나 자료형이 다르면
	// 다른 메서드로 생성 가능
	int i = 10;
	double d = 3.14;
	String s = "hong";
	
//	System.out.println();

}

public class OverloadingUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
