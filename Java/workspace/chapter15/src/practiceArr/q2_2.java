package practiceArr;

import java.util.Scanner;

public class q2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 2. 임의의 수자를 입력하여 369게임을 간단하게 작성. 1-99까지 정수를 입력하고 3,6,9 중 하나가 있는 
//		 경우 ‘박수짝’을 출력하고, 두 개 있는 경우 ‘박수짝짝’을 출력하는 프로그램을 작성하라

		Scanner sc = new Scanner(System.in);
		System.out.println("1 - 99 사이의 정수: ");
		String num = sc.next();
		String result = "";
		int count = 0;
		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			if (c == '3' || c == '6' || c == '9') {
				if (count > 0) {
					result += "짝";
				} else {
					result = "박수짝";
					count += 1;
				}

			}

		}

		System.out.println(result);
	}

}
