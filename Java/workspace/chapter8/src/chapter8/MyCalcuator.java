package chapter8;

import java.util.Scanner;

public class MyCalcuator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			showMenu();
			
			char myChar = sc.nextLine().charAt(0);
			if(!checkNum(myChar)) { // checknum 메서드를 이용하여 입력한 문자열이 숫자인지 아닌지 확인
				System.out.println("메뉴를 잘못 선택했습니다.");
				continue;
			}
			// 아스키코드에서 '0'을 빼면 숫자값 추출가능
			int num = myChar - '0';
			System.out.println(num);
			// 0~4의 선택을 입력한 문자열의 첫글자만 저장
			if (num == 0) {
				System.out.println("계산기를 종료합니다.");
				break;
			} else {
				if (num > 4) {
					System.out.println("메뉴를 잘못 선택했습니다.");
					continue;
				}
				System.out.println("첫 번째 숫자: ");
				int num1 = sc.nextInt();
				System.out.println("두 번째 숫자: ");
				int num2 = sc.nextInt();
				sc.nextInt(); // enter 실행
				// next(), nextint(), nextdouble() 같은 자료형의 경우
				// 데이터를 담는 경우 엔터키가 Scanner의 메모리에 남게됨
				
				if(num == 1) {
					addNum(num1, num2);
				}else if(num == 2) {
					minusNum(num1, num2);
				}else if(num == 3) {
					multiplyNum(num1, num2);
				}else if(num == 4) {
					divideNum(num1, num2);
				}
			
			
		}}
	}

	public static void showMenu() {
		System.out.println("메뉴를 선택하세요");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("0. 끝내기");
	}
	
	public static void addNum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	}
	public static void minusNum(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + result);
	}
	public static void multiplyNum(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(num1 + "*" + num2 + "=" + result);
	}
	public static void divideNum(int num1, int num2) {
		int result1 = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + result1);
		int result2 = num1 % num2;
		System.out.println(num1 + "%" + num2 + "=" + result2);
	}
	// 아스키코드 혹은 유니코드의 숫자값을 사용하여 범위구분
	public static boolean checkNum(char ch) {
		if (ch >= '0' && ch <= '9') { // ch 변수가 0~9사이의 숫자가 맞으면 true, 틀리면 false
			return true;
		}else {
			return false;
		}
	}

}
