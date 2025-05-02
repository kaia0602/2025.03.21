package ifPractice;

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		윤년확인하기
//		연도가 400으로 나누어 나머지가 0이면 윤년입니다
//		연도가 100으로 나누어 나머지가 0이면 윤년이 아닙니다
//		연도가 4로 나누어 나머지가 0이면 윤년 입니다.
//		그 이외에 연도는 모두 윤년이 아닙니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력해주세요>>");
		
		int year = sc.nextInt();
		if (year % 400 == 0 
		|| (year % 4 ==0 && year % 100 != 0) ) {
			System.out.println("윤년입니다");
		}else{
			System.out.println("윤년이 아닙니다");
		}
		
		
		int y400 = year % 400 > 0 ? 0: 1;
		int y100 = year % 100 > 0 ? 0: 1;
		int y4 = year % 4 > 0 ? 0: 1;
		String result = ""+y400+y100+y4;
		System.out.println(result);
		switch(result) {
		case  "100":
		case  "110":
		case  "111":
		case  "001":
		case  "101":
			System.out.println("윤년입니다");
			break;
		case  "010":
		case  "011":
		case  "000":
			System.out.println("윤년이 아닙니다");
			break;
		default:
			System.out.println("윤년이 아닙니다");
			
		}
//		if문으로 작성하기
//		switch으로 작성하기
		
	}

}
