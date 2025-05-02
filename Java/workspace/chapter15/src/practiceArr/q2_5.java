package practiceArr;

import java.util.Arrays;

public class q2_5 {

	public static void main(String[] args) {
//		 5. 크기가 10인 배열을 작성하고 Math.random()함수를 사용하여 1~100사이의 숫자를 랜덤하게 생성하
//		 고 생성된 숫자가 3의 배수인 것만 배열에 저장하는 프로그램을 작성하라. (단 배열의 각 요소는 서로 
//		 다른 값만 저장되도록 한다.)
		
		int[] arr = new int[10];
		int count = 0;
		while(count < 10) {
			int num = (int) (Math.random()*100 +1);
			if (num % 3 != 0) {
				continue;
			} 
			boolean flag = false;
			for(int i = 0; i < arr.length; i++) {
				if(num == arr[i]) {
					flag = true;
					break;
				}
			}
			if(!flag ) {
				arr[count] = num;
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
//			for (int i = 0; i < arr.length; i++) { // 배열의 크기만큼 반복(10)
//				int num = (int) (Math.random()*100 +1); // num에 1~100사이의 랜덤한 값을 반복(10)회 넣음
//				if(num % 3 == 0) {
//					// 중복값 확인하는 boolean 변수
//					boolean flag = false;
//					for(int j =0; j <= i; j++) {
//						if(num == arr[j]) {
//							flag = true;
//						}
//					}
//					if(!flag) {
//						arr[i] = num;
//					}else {
//						i--;
//					}
//					arr[i] = num; // num이 3의 배수일경우에만 배열을 추가
//					
//				} else {
//					i--;
//				}
//				
//			}
//			System.out.println(Arrays.toString(arr));
			
		
		
		
		
		
		
		
		
	}

}
