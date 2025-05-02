package chapter7;

public class Ex02_VariableScope {
	// 클래스변수(멤버 변수): class 이름 아래에 작성하는 static 변수
	// 인스턴스변수(멤버변수): class 이름 아래에 작성하는 변수
	// 지역변수(로컬변수): 메서드 이름 아래에 작성하는 변수
	// 매개변수(파라미터 parameter): 메서드 선언부 , 메서드의 이름 뒤 괄호에 작성
	
	// main메서드는 프로그램을 실행하는 메서드로 작성되었는 클래스와는 관련이 없음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main 메서드 안의 어디서든 사용 가능 myState, num1
		// main 메서드 중괄호 안에서 선언한 변수는 main안의 어디서든 사용가능
		boolean myState = true;
		int num1 = 11;
		
		if(myState) {
			num1++;
			System.out.println(num1);
		}
		// {}만 사용해 코드 작성이 가능하지만 일반적으로 사용 x
		{
			int num2 = 33;
			num2++;
			System.out.println(num2);
		}
		// System.out.println(num2); > ERROR
		// 중괄호 안에서 선언한 변수는 중괄호 밖에서 사용불가
		
		// for문안에서 작성한 i변수는 for문 안에서만 사용가능
		for(int i = 0; i < 3; i++) {
			System.out.println(i);
		}

	}

}
