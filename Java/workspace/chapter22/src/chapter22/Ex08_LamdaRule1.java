package chapter22;

interface Unit8 {
	void move(String s);
}

interface Unit9 {
	int calc(int x, int y);
}

public class Ex08_LamdaRule1 {

	public static void main(String[] args) {

		Unit8 unit;
		
		unit = (String s) -> {System.out.println(s);};
		unit.move("Lamda: 줄임없는 표현 : 앞 예제 동일");
		
		// 실행 코드가 한 줄만 있기 때문에 중괄호의 생략이 가능하다.
		unit = (String s) -> System.out.println(s);
		unit.move("Lamda: 중괄호 생략");
		
		// 매개변수가 하나이기 때문에 자료형 생략가능
		unit = (s) -> System.out.println(s);
		unit.move("Lamda: 매개변수 형 생략");
		
		// 매개변수가 하나이기 때문에 소괄호 생략가능 
		unit = s -> System.out.println(s);
		unit.move("Lamda: 매개변수 소괄호 생략");
		
		Unit9 unit2;
		// 매개변수가 2개이면 소괄호 생략 불가
		unit2 = (x, y) -> {return x + y; };
		
		// 실행코드가 한줄이고 return값을 설정하면 중괄호와 return 생략가능
		unit2 = (x, y) -> x + y;
		
		int num = unit2.calc(10, 20);
		System.out.println();
	}

}
