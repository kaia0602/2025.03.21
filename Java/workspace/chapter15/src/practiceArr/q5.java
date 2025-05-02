package practiceArr;

import java.util.Arrays;
import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5.정수를 10개 입력받아 배열에 저장하고 증가 순으로 정렬하여 출력하라.
		                             
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 10개 입력>>");
		int[] intArr = new int[10]; 
		for(int i = 0; i< intArr.length; i++) {
			intArr[i] = sc.nextInt();
			}
		for(int i = 0; i< intArr.length; i++) {
			for(int j =0; j < intArr.length-1; j++) {
				if (intArr[j] > intArr[j+1]) {
					int num = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] =num;
				}
			}
//				17 3 9 -6 77 234 5 23 -3 1 
		
		}
		System.out.println(Arrays.toString(intArr));
			
		

			
			
	}

}
