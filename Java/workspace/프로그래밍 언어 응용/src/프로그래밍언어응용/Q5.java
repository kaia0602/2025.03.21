package 프로그래밍언어응용;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();

		System.out.println("나라이름과 수도를 입력하세요. (예 : Korea 5000)");
		for (int i = 0; i < 5; i++) {
			System.out.print("나라 이름, 인구 >> ");
			String nation = sc.next();
			Integer num = sc.nextInt();
			nations.put(nation, num);
		}
		

		
		Set<String> ks = nations.keySet();

		int minNum = Integer.MAX_VALUE;
		String minName = "";
		for (String s : ks) {
			
			if (nations.get(s) < minNum) {
				minNum = nations.get(s);
				minName = s;
			}
		}
		System.out.println("제일 인구가 적은 나라는 (" + minName + "," + nations.get(minName).toString() + ")");
		
	
			
			
	

			
		
	}

}
