package loopPractice;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
//		조건문과 반복문을 이용하여 가위바위보 게임을 만들어보세요. 
//		5 번을 이겼을 경우 게임이 끝나게 되며 한번 가위바위보를 실행할 때마다 사
//		람과 컴퓨터의 가위바위보 내용 승패 승리횟수 패배횟수를 출력합니다, , , . 
//		 
//		실행결과----------------
//		가위바위보중에 선택해주세요(1), (2), (3) . >> 1
//		플레이어 가위 vs 바위 컴퓨터 :패배  
//		승리 패배 : 0/5 , : 1
//		가위바위보 중에 선택해주세요바위, , . >> 
//		플레이어 바위 vs 가위 컴퓨터 :승리 
//		승리 패배 : 1/5 , : 1
		String result = "";
		int win = 0;
		int lose = 0;
		while(win < 5) {
			System.out.print("가위(1),바위(2),보(3)중에 선택해주세요. >>");
			int user = sc.nextInt();
			int computer = (int) (Math.random()*3) + 1; 

			if(computer == user) {
				result = "무승부";
			}else if(computer == 1 && user == 2
					|| computer == 2 && user == 3
					|| computer == 3 && user == 1) {
				result = "승리";
				win++;

			}else {
				result = "패배";
				lose++;
			}

			System.out.println("플레이어" + checkNum(user) + "vs 컴퓨터 " + checkNum(computer) + result);
			System.out.println("승리 :" + win + "패배 :" + lose);
			
		}
		System.out.println("END");
	}
	
	public static String checkNum(int num) {
		String result = "";
		if(num == 1) {
			result = "가위";
		}else if(num == 2) {
			result = "바위";
		}else if(num == 3) {
			result = "보";
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		return result;
	}

}
