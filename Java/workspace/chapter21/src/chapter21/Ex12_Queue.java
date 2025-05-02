package chapter21;

import java.util.LinkedList;
import java.util.Queue;

public class Ex12_Queue {

	public static void main(String[] args) {

		Queue<String> que = new LinkedList<>();
		
		// offer(): 데이터 추가 메서드
		que.offer("A");
		que.offer("B");
		que.offer("C");
		// size(): 저장된 데이터 개수 출력
		System.out.println(que.size());
		
		System.out.println("next: " + que.peek()); // peek(): 데이터를 출력
		System.out.println(que.poll()); // pool(): 데이터를 출력후 삭제
		System.out.println(que.size());
		
		System.out.println("next: " + que.peek());
		System.out.println(que.poll());
		System.out.println(que.size());
		
		System.out.println("next: " + que.peek());
		System.out.println(que.poll());
		System.out.println(que.size());
		
		
 	}

}
