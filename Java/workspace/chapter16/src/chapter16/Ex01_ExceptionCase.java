package chapter16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01_ExceptionCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ERROR: 예외가 아닌 심각한 문제를 의미, 코드로는 해결 불가능
		// 하드웨어나 자바의 설정 문제가 있을 때 발생
		// 컴파일 에러: 컴파일 시 일어나는 문제, 이클립스(IDE)에서 알려주는 에러, 빨간밑줄
		// 런타임 에러: 실행도중 발생하는 에러, 값 설정오류, 부적절한 산술연산 등
		// 런타임 에러의 종류: 시스템 에러, 예외
		// 시스템에러: 메모리 부족, 운영체제에서 에러가 발생
		// 예외 (Exception): 값 설정오류, 부적절한 산술연산 등
		// 예외처리: try catch문을 이용하여 예외가 발생하더라도 프로그램이 진행되도록 코딩

		Scanner sc = new Scanner(System.in);
		try {
			// 예외될 가능성이 있는 코드
			int num1 = sc.nextInt(); // 문자열 입력시 예외발생
			int num2 = 10 / num1; // num1에 0을 입력시 예외발생
			System.out.println(num2);
			System.out.println("예외 발생시 미실행");
		// catch (예외클래스 예외의 데이터가 저장될 변수 이름) {
		//		예외의 내용에 처리할 내용 } 
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력해주세요");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		} catch (Exception e) {
			// 예외 발생시 실행할 코드
			System.out.println("예외가 발생했습니다.");
		} finally {
			// 정상실행 되던 예외가 일어나던 무조건 실행되는 코드
			System.out.println("무조건 실행되는 코드");
		}
		// 예외처리시 프로그램이 계속실행된다
		System.out.println("프로그램이 정상 종료 됬습니다.");

//		MyBook book1 = new Mybook(); => 컴파일에러
	}

}
