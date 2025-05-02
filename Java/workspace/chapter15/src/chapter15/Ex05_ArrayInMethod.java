package chapter15;

import java.util.Arrays;

public class Ex05_ArrayInMethod {

	public static void main(String[] args) {

		// 메서드의 결과를 배열로 반환
		int[] arr = makeIntArray(5);

		// 메서드의 매개변수로 배열을 사용
		int sum = sumOfArray(arr);

		System.out.println(sum);
		
		String str = "010-1234-5678";
		String[] strSplit = str.split("-");
		System.out.println(Arrays.toString(strSplit));
	}

	public static int[] makeIntArray(int len) {
		// len 매개변수로 배열의 길이를 설정

		int[] arr = new int[len];

		// 0부터 len 까지의 반복문 실행
		for (int i = 0; i < len; i++) {
			arr[i] = i;
			// 0부터 len 까지의 배열에 i 데이터 저장
		}
		// 반복에서 저장한 배열을 return함
		return arr;
	}

	public static int sumOfArray(int[] arr) {
		// 매개변수 arr의 배열 길이만큼 반복
		int sum = 0;
		
		// sum변수에 arr의 첫번째 값부터 모두 더한다.
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
	}
		return sum;
	}
}
	
	
	
	
	
