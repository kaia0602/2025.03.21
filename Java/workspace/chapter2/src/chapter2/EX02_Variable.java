package chapter2;

public class EX02_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언하기
		// 자료형 변수이름 = 자료형에 맞는 값;
		int number = 10;
		number = 20;
		String str = "hello";
		System.out.println(number);
		System.out.println(str);
		// 변수 선언 시 주의점 
		// 1. 변수 이름은 중복불가
		// 2. 카멜표기법을 사용하여 변수명을 작성 ex) firstName
		// 3. 변수에는 의미 있는 이름을 작성
		// 4. 예약어(자료형, 조건문, 반복문 etc)는 변수명으로 사용불가
		
		// 상수 선언하기
		// 상수: 한번 데이터를 저장하면 더이상 바꿀 수 없는 저장공간
		// 상수 선언과 대입을 동시에 실행하기
		final int MAX_NUM = 10;
		// MAX_NUM = 20; > ERROR 값 변경 불가능
		
		// 상수 선언과 대입을 따로 실행하기
		final int MIN_NUM; // 선언
		MIN_NUM = 6; // 대입한적이 없기에 실행가능
		// MIN_NUM = 4; // 이미 대입했기에 변경불가 ERROR
		System.out.println(MIN_NUM);
		// 상수 선언시 주의점
		// 1. 한번 대입을 하면 두번째 대입은 불가능
		// 2. 언더스코어 표기법으로 상수 이름을 설정 ex) FIRST_NAME
		// 3. 상수명에는 의미 있는 이름을 작성
		// 4. 예약어(자료형, 조건문, 반복문 etc)는 상수명으로 사용불가
		
		// 자동 형 변환: 자료형이 자동으로 변경되어 저장되는 것
		byte a = 100;
		// 숫자를 직접적으로 적으면 모두 int 타입으로 생성되고 byte에 저장시 byte에 저장시 자동으로 변환
		// byte b = 128; > ERROR: byte의 범위를 int인 128데이터가 초과했기 때문
		// long c = 2147483648; > 숫자는 int형이기에 int의 범위가 넘어가면 ERROR
		long d = 2147483648L; // 숫자뒤에 L을 붙이면 long타입으로 변경됨
		long e = 1;
		
		float f = 3.14f;
		// 실수를 입력하면 double이 기본 자료형으로 인식된다.
		double g = 3.14;
		
		// 연산 시 자동형 변환
		int num1 = 10;
		byte num2 = 20;
		               // int   byte
		// byte result1 = num1 + num2; int 보다 작은 byte타입엔 자동 형 변환 불가
		int result2 = num1 + num2; // byte 타입을 자동 형 변환으로 int 변경 후 저장

		// 수동 형 변환(cast): (자료형)변수명
		byte result3 = (byte)(num1 + num2);
		
		// 산술 연산자: +, -, *, /, %
		// 대입 연산자: =, +=, -=, *=, /=
		// 비교 연산자: ==, !=, <, <=, >, >=
		// 논리 연산자: &&(and), ||(or), !(not)
		// 삼항 연산자: 조건식 ? 참 : 거짓
	}

}
