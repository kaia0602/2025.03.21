package 프로그래밍언어응용;

import java.util.HashMap;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> drinks = new HashMap<String, Integer>();
		
		drinks.put("밀키스", 700);
		drinks.put("코카콜라", 800);
		drinks.put("펩시", 1000);
		drinks.put("칠성사이다", 1200);
		
		System.out.println("밀키스, 코카콜라, 펩시, 칠성사이다 있습니다.");
		while (true) {
			System.out.print("선택 >> ");
			String result = sc.next();
			if (result.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			
			System.out.println(result + "는 " + drinks.get(result) + "원 입니다.");




		}

	}
}
