package chapter16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04_CatchConcat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		try {
			int num1 = sc.nextInt();
			int num2 = 20 / num1;
			System.out.println(num2);
			// or 기호를 이용하여 여러 예외를 동시에 처리
		} catch (ArithmeticException | InputMismatchException e) {
			// e 변수의 내용: 어떤 에러가 발생했는지의 정보
			System.out.println("예외 발생");
			e.printStackTrace();
			// 예외발생시 메세지만 반환하는 메서드
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// 예외 발생시의 메서지, 예외 이름, 발생위치의 코드
			
			// Exception e : 모든 예외를 의미
			System.out.println("위에서 작성하지 않은 모든 예외를 처리");
		}
		
		System.out.println("Good bye :)");
	}

}
