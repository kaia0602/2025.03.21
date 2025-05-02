package chapter11;

public class Ex03_UtilMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator calc1 = new MyCalculator();
		int num1 = calc1.adder(1, 2);
		System.out.println(num1);
		
		// 자주 사용하는 기능의 경우 static으로 작성하여 빠르게 처리할 수 있다
		int num2 = MyCalculator.adder(2, 3);
		// System이 대표적인 static 사용방식
		System.out.println(num2);
		// math
		System.out.println(Math.random());
	}

}
