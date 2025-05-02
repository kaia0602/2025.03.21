package chapter23;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex01_Stream1 {

	public static void main(String[] args) {
		// 스트림에 사용할 배열선언
		int[] arr = {1, 2, 3, 4, 5};
		
		// 스트림 생성
		IntStream stm1 = Arrays.stream(arr);
		
		// 중간연산 filter 실행
		// filter(매개변수 -> 조건식)
		// : 조건식에서 true값의 데이터만 저장
		//filter는 중간 연산이기 때문에 데이터 저장 후 스트림 반환
		IntStream stm2 = stm1.filter(n -> n%2 ==1);
		
		int sum = stm2.sum();
		System.out.println(sum);
		
		// 파이프라인: .을 이용하여 메서드의 실행을 계속하는 방식
		int result = Arrays.stream(arr).filter( n -> n%2 ==1).sum();
		System.out.println("파이프라인으로 실행한 결과: " + result);
	}

}
