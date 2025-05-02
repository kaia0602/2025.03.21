package chapter21;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ex13_Deque {

	public static void main(String[] args) {
		
		// Stack 클래스는 옛날 방식으로 현재는 권장하지 않음
		// Deque보다 느림, Vector 기반의 자료구조라서 스레드 실행시 안정
		Deque<String> deq = new ArrayDeque<>();
		// Stack 보다 빠름, List 기반의 자료구조를 사용하고 스레드 실행시 불안전
		// Queue와 Stack의 기능을 모두 사용 할 수 있음
		
		deq.offerFirst("A");
		deq.offerFirst("B");
		deq.offerFirst("C");
		// 첫번째에 데이터를 추가
		
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		// pollFirst(): 제일 처음의 데이터를 출력 후 삭제

		System.out.println("---------------------------");
		
		deq.offerLast("A");
		deq.offerLast("B");
		deq.offerLast("C");
		// offerLast(): 마지막에 데이터를 추가
		
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		// pollLast(): 마지막의 데이터를 출력 후 삭제
		
		System.out.println("---------------------------");
		
		deq.offerLast("A");
		deq.offerLast("B");
		deq.offerLast("C");
		
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
	}

}
