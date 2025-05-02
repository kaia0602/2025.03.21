package practiceArr;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		정수를 입력받아 짝수이면 “짝”, 홀수이면 “홀”을 출력하는 프로그램을 작성하라. 사용자
//		가 정수를 입력하지 않는 경우에는 프로그램을 종료하라. [목적-자바의 예외 처리 연습] 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>>");

		String str = sc.next();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c<'0' || c>'9') {
				System.out.println("수를 입력하지 않아 프로그램을 종료합니다.");
				return;
			}
		}
		int num = Integer.parseInt(str);
		if(num%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
		
//		String num = sc.next();	
//		int result = num.charAt(-1);
//		
//		if (result % 2 == 0) {
//			System.out.println("짝수");
//		}else if (result % 2 != 0) {
//			System.out.println("홀수");
//		}else {
//			System.out.println("수를 입력하지 않아 프로그램을 종료합니다.");
//		}
		
		
		
		
	
	}
}
