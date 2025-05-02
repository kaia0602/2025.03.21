package prac1;

import java.util.ArrayList;
import java.util.List;

public class Q1 {

	public static void main(String[] args) {

		// 1. 1~100의 숫자중 3의 배수를 리스트에 저장
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				list.add(i);
				System.out.println(i);
			}
		}
		// 2. 1900년도 부터 2025년 까지의 윤년을 리스트에 저장
		List<Integer> list2 = new ArrayList<>();

		for (int j = 1900; j <= 2025; j++) {
			if (j % 400 == 0 || (j % 4 == 0 && j % 100 != 0)) {
				list2.add(j);
				System.out.println(j);
			}
		}

	}
}
