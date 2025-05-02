package chapter21;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex02_LinkedList {

	public static void main(String[] args) {

		// List는 인터페이스이기에 List를 상속받는 자료구조는 모두 저장가능
		
				List<String> list = new LinkedList<>();
				// add(저장할 데이터): 리스트에 데이터를 저장하는 메서드
				list.add("orange");
				list.add("apple");
				list.add("apple");
				list.add("banana");

				// size(): 리스트에 저장되어 있는 데이터의 개수를 반환
				// length: 배열에 설정된 길이를 반환, 저장된 값과 무관
				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i) + '\t');
					// get(인덱스): list의 데이터를 반환하는 메서드

				}
				System.out.println();
				// remove(인덱스): 인덱스번째의 데이터를 삭제
				list.remove(0);

				// foreach, 향상된 for문을 사용한 데이터 출력
				// 리스트 안 데이터 타입 변수이름 : 반복할 리스트
				for (String str : list) {
					System.out.print(str + '\t');
					// get을 사용하지 않아도 데이터 출력가능
				}
				System.out.println();
				
				System.out.println("--------------------------");
				
				// Iterator: 반복자
				// 반복자 선언시 제네릭으로 리스트의 제네릭을 설정
				Iterator<String> itr = list.iterator();
				// hasNext: 다음 데이터가 있으면 true 없으면 false를 반환
				while(itr.hasNext()) {
					String str = itr.next();
					// next(): 다음 데이터를 반환하는 메서드
					// 다음 데이터가 없는 경우 에러 발생후 프로그램 종료
					// next는 반드시 hasNext와 세트로 사용
					System.out.print(str + '\t');
					if (str.equals("apple")) {
						itr.remove();
					}
				}
				System.out.println();
				
				itr = list.iterator();
				while(itr.hasNext()) {
					System.out.print(itr.next() + '\t');
				}
				System.out.println();

	}

}
