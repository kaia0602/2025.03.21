package 프로그래밍언어응용;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> customer = new HashMap<>();

		System.out.println("<< 통장 관리 프로그램입니다. >>");
		while (true) {
			System.out.print("이름과 금액 입력>>");
			String name = sc.next();
			if (name.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			} else {

				Integer money = sc.nextInt();

				if (customer.get(name) == null) {
					customer.put(name, money);
				} else {
					int sum = customer.get(name) + money;
					customer.put(name, sum);
				}

				Set<String> ks = customer.keySet();
				for (String s : ks) {

					System.out.print("(" + s + ">" + customer.get(s) + "원)");
				}

				System.out.println();
			}

		}

	}

}
