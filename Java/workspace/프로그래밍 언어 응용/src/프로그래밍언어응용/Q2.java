package 프로그래밍언어응용;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			while(true) {
			String line = sc.nextLine();
			if(line.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			} else  {
				String[] strs = line.split(",");

				System.out.println("어절 개수는: " + strs.length);
			}
			
		}

	}

}
