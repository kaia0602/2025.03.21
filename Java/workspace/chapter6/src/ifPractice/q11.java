package ifPractice;

import java.util.Scanner;

public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		가위바위보 게임 만들기
		Scanner sc= new Scanner(System.in);
		System.out.print("가위, 바위, 보 중에 입력해주세요>>");
		String player = sc.next();
//		0~2 사이의 랜덤 숫자를 저장
//		while(true) {
			int computer = (int)(Math.random()*3);
			int result = 0;
			if(player.equals("가위")) {
				result = 0;
			}else if(player.equals("바위")) {
				result = 1; 
			}else if(player.equals("보")) {
				result = 2; 
			}else {
				System.out.println("가위, 바위, 보 중 입력하세요.");
			}
			
			if(computer == result) {
				System.out.println("비겼습니다");
			}else if(computer == 0 && result == 1
					|| computer == 1 && result == 2
					|| computer == 2 && result == 0) {
				System.out.println("이겼습니다");
			}else {
				System.out.println("졌습니다");
			}
			
			
			// int result2 = result - computer;
			// 졌을때 : -1, 2
			// 이겼을때 : -2, 1
			// if(computer == result2) {
			//	System.out.println("비겼습니다");
			// }else if(result2 == -2 && result == 1){
			//	System.out.println("이겼습니다");
			// }}else {
			//	System.out.println("졌습니다");
			// }
//		}
		
	}

}








