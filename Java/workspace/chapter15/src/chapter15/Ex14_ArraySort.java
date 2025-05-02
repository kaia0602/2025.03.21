package chapter15;

import java.util.Arrays;
import java.util.Collections;

public class Ex14_ArraySort {

	public static void main(String[] args) {
		// int 배열의 경우 오름차순밖에 실행할 수 없다.		
		int[] arr1 = { 1, 2, 3, 4 };
		Double[] arr2 = { 4.4, 3.3, 2.2, 1.1 };
		String[] arr3 = { "홍길동", "전우치", "손오공", "멀린" };

		Arrays.sort(arr1);
		Arrays.sort(arr2, Collections.reverseOrder());
		//Integer 배열의경우 오름차순, 내림차순 둘다 가능
		Arrays.sort(arr3);

		for (int n : arr1)
			System.out.print(n + "\t");
		System.out.println();

		for (double d : arr2)
			System.out.print(d + "\t");
		System.out.println();

		for (String s : arr3)
			System.out.print(s + "\t");
		System.out.println();
	}

}
