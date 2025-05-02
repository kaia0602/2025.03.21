package prac1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prac3 {

	public static void main(String[] args) {
//		3. Array 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램을 작성하라. 강수량을 입력
//		하면 Array에 추가하고 현재 입력된 모든 강수량의 평균을 출력하라.

		Scanner sc = new Scanner(System.in);
		List<Integer> arr = new ArrayList<>();

		while (true) {
			System.out.print("강수량 입력(0 입력시 종료)>> ");
			int amount = sc.nextInt();
			if (amount == 0) {
				System.out.println("End");
				break;
			} else {
				arr.add(amount);
				System.out.println(arr);
				int sum = 0;
				for (int i = 0; i < arr.size(); i++) {
					sum += arr.get(i);
				}
				System.out.println("현재 평균: " + sum / arr.size());
			}
		}

	}

}
