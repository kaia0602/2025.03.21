package practiceArr;

import java.util.Arrays;


public class q2_6 {

	public static void main(String[] args) {
//		배열을 사용하여 다음의 숫자를 정렬하라. 정렬방법은 선택정렬, 삽입정렬, 버블정렬을 수행하라.
//		 15, 7, 2, 9, 10, 12, 17, 11, 20, 5
		
		// 선택정렬
		int[] a = {15, 7, 2, 9, 10, 12, 17, 11, 20, 5};
//		int tempValue, tempJ = 0;
//		for(int i = 0; i < a.length; i++) {
//			// MAX_VALUE상수: int에 저장할 수 있는 가장 큰값
//			int min = Integer.MAX_VALUE; // 임시로 가장 큰값을 저장
//			// 첫번째 반복 이후에는 배열에서 가장 작은 값이 전달
//			for (int j = i; j< a.length; j++) {
//				// a[j] 값이 min에있는 값보다 작으면
//				if (a[j] < min) {
//					// min에 j를저장
//					min  = a[j];
//					// tempJ에 가장 작은값이 있는 배열의 위치값(인덱스)를 저장
//					tempJ = j;
//				}
//			}
//			tempValue = a[i]; // 제일처음 반복이 시작될때의 값을 tempValue에 저장
//			a[i] = a[tempJ]; // 반복이 시작될때의 배열에 가장 작은 값을 저장
//			a[tempJ] = tempValue; // 가장작은 값이 있던 배열에 반복이 시작될때의 값을 저장
//		}
//		System.out.println(Arrays.toString(a));
		
		// 삽입정렬
		int target, tempValue = 0;
		for(int i = 1; i < a.length; i++) {
			tempValue = a[i];
			target = i - 1;
			while(target >= 0 && a[target] > tempValue) {
				a[target+1] = a[target];
				target--;
			}
			a[target+1] = tempValue;
		}
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
	}

}
