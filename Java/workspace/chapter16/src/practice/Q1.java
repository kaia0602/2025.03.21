package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		int win = 0;
		int lose = 0;
		while (win < 5) {
				try	{
				System.out.print("가위(1),바위(2),보(3)중에 선택해주세요. >>");
				int user = sc.nextInt();
				if(user<1 && user>3) {
					System.out.println("1,2,3 만선택");
					continue;
				}
				int computer = (int) (Math.random() * 3) + 1;

				if (computer == user) {
					result = "무승부";
				} else if (computer == 1 && user == 2 || computer == 2 && user == 3 || computer == 3 && user == 1) {
					result = "승리";
					win++;

				} else {
					result = "패배";
					lose++;
				}

				System.out.println("플레이어" + checkNum(user) + "vs 컴퓨터 " + checkNum(computer) + result);
				System.out.println("승리 :" + win + "패배 :" + lose);

			} catch (InputMismatchException e) {
				System.out.println("1,2,3 만선택");
				sc.nextLine();
			}
		} 
		System.out.println("END");
	}

	public static String checkNum(int num) {
		String result = "";
		if (num == 1) {
			result = "가위";
		} else if (num == 2) {
			result = "바위";
		} else if (num == 3) {
			result = "보";
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		return result;
	}
}
