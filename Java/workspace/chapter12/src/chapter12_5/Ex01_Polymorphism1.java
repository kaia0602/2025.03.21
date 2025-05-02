package chapter12_5;

abstract class Calc {
	int a = 5;
	int b = 6;
	
	abstract void plus();
}

class MyCalc extends Calc {
	void plus() {System.out.println(a + b);}
	void minus() {System.out.println(a - b);}
}

class YourCalc extends Calc {
	void plus() {System.out.println(a + b + "YourCalc's plus result");}
	void minus() {System.out.println(a - b + "YourCalc's minus result");}
}

public class Ex01_Polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCalc mycalc1 = new MyCalc();
		// 부모클래스를 오버라이드한 내용을 실행
		mycalc1.plus();
		// 자식클래스에서 추가한 메서드를 실행
		mycalc1.minus();
		
		Calc myCalc2 = new MyCalc();
		// 부모 클래스의 타입에 자식클래스 생성자를 사용하여 인스턴스 생성
		myCalc2.plus();
		// 부모클래스의 plus 메서드는 실행가능 => 실행코드: 자식클래스의 코드
		
		MyCalc change = (MyCalc)myCalc2;
		change.minus();
		
		
		Calc yourCalc1 = new YourCalc();
		yourCalc1.plus();
		
		// 부모클래스의 인스턴스를 자식 클래스로 변경하는 방법
		YourCalc changeYour = (YourCalc)yourCalc1;
		changeYour.minus();

	}

}
