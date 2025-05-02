 package chapter16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09_ThrowsInMethod {
	
	public static void myMethod1() {
		myMethod2();
	}
	
	public static void myMethod2() 
		throws ArithmeticException, InputMismatchException
	
		{
	
			Scanner sc = new Scanner(System.in);
		
			int num1 = sc.nextInt(); // 글자입력시 예외
			int num2 = 10 / num1; // 0으로 나누면 예외
			System.out.println(num2);
		}

	public static void main(String[] args) {
		try  {
			myMethod1();
		} catch (ArithmeticException | InputMismatchException e) {
			e.printStackTrace();
		}
		System.out.println("BB");
		
	
	}

}
