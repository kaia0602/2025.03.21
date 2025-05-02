package chapter23;

import java.util.stream.IntStream;

public class Ex06_PreTerminal {

	public static void main(String[] args) {
		
		// 최종연산: 마지막에 한번만 사용가능, 최종연산전 중간연산은 여러개 사용가능
		
		int sum = IntStream.of(1, 3, 5, 7, 9)
				.sum();
		System.out.println("sum: " + sum);
		
		long cnt = IntStream.of(1, 3, 5, 7, 9)
				.count(); // 개수를 반환
		System.out.println("count: " + cnt);
		
		IntStream.of(1, 3, 5, 7, 9)
				.average() // 평균값을 반환
		.ifPresent(avg ->  System.out.println("avg: " + avg));
		// .ifPresent(매개변수 -> 실행할 코드)
		// : 매개변수가 null이면 실행하지 않고 매개변수가 null이 아니면 반환
		
		IntStream.of(1, 3, 5, 7, 9)
				.min()
		.ifPresent(min ->  System.out.println("min: " + min));
		
		IntStream.of(1, 3, 5, 7, 9)
				.max()
		.ifPresent(max ->  System.out.println("max: " + max));

		
	}

}
