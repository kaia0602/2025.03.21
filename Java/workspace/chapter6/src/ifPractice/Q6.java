package ifPractice;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		6. 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 10원
//		짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라. 힌트 참조. [난이도 중] 
//		돈의 액수를 입력하세요>>65245 
//		오만원1개, 만원1개, 천원5개, 500원0개, 100원2개, 10원4개, 1원5개 
//		힌트)정수 n의 값이 36이라고 할 때 정수 3과 6을 분리하는 방법은 다음 코드를 참고하
//		라. 
//		int first = n/10; // 10으로 나눈 몫 = 3 
//		int second = n%10; // 10으로 나눈 나머지 = 6
		
		System.out.println("돈의 액수를 입력하세요 >>");
		int money = sc.nextInt();
		int fiveM = money / 50000;
		money = money % 50000;
		int oneM = money / 10000;
		money = money % 10000;
		int oneT = money / 1000;
		money = money % 1000;
		int fiveH = money / 500;
		money = money % 500;
		int oneH = 100;
		money = money % 100;
		int ten = 10;
		money = money % 10;
		int one = 1;
		money = money % 1;
		System.out.println("오만원" + fiveM + "개, " + 
				"만원" + oneM + "개, " + 
				"천원" + oneT + "개, " + 
				"오천원" + fiveH + "개 " + 
				"100원" + oneH + "개 " + 
				"10원" + ten + "개 " +
				"1원" + one + "개 " );
//		for (i = 0; i == money; i++;) {
//			if 
//		}
		

	}

}
