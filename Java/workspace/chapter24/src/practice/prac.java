package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class prac {


	public static void main(String[] args) {

		// gugudan.txt 파일에 1~9단까지의 구구단을 출력해보자
		
	
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("gugudan.txt"))) {
			int i = 0;
			int j = 0;
			for(i=1 ; i <= 9; i++) {
				bw.write(i + "단");
				bw.newLine();
				for(j=1; j <= 9; j++) {
					bw.write(i +" * "+ j +" = "+ (i*j));
					bw.newLine();
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// year.txt파일에 1900년도부터 2025년까지의 윤년을 출력해보자
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("year.txt"))) {
			
			for (int K = 1900; K <= 2025; K++) {
				if (K % 400 == 0 || (K % 4 == 0 && K % 100 != 0)) {
					bw.write(K + "년");
					bw.write("\r\n");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 가위바위보 게임의 결과를 log.txt 파일에 출력해보자
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt"))) {
			Scanner sc = new Scanner(System.in);
			String result = "";
			int win = 0;
			int lose = 0;
			int draw = 0;
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
						draw++;
					} else if (computer == 1 && user == 2 || computer == 2 && user == 3 || computer == 3 && user == 1) {
						result = "승리";
						win++;

					} else {
						result = "패배";
						lose++;
					}
					System.out.println("플레이어" + checkNum(user) + "vs 컴퓨터 " + checkNum(computer) + result);
					System.out.println("승리 :" + win + " 패배 :" + lose + " 무승부 : " + draw);
					
					bw.write("플레이어: " + checkNum(user) + " vs 컴퓨터: " + checkNum(computer) + " " +result);
					bw.newLine();
					bw.write("승리 :" + win + "패배 :" + lose + " 무승부 : " + draw);
					bw.newLine();

				} catch (InputMismatchException e) {
					System.out.println("1,2,3 만선택");
					sc.nextLine();
				}
			}
			System.out.println("END");
			bw.write("END");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
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
