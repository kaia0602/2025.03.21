package chapter21;

import java.util.HashMap;

public class Ex14_HashMap {

	public static void main(String[] args) {
		HashMap<String,	String> map = new HashMap<>();
		// Map은 key와 value 값을 가진 자료구조
		// key: value를 꺼내기위해 설정하는 id, PK의 데이터를 설정
		// value: 데이터, 테이블에 들어있는 데이터를 객체로 만들어 저장 
		
		map.put("홍길동", "010-1234-1443");
		map.put("전우치", "010-4321-1446");
		map.put("손오공", "010-9876-1443");
		// put(key, value): 데이터 추가 메서드
		
		System.out.println("홍길동: " + map.get("홍길동"));
		System.out.println("전우치: " + map.get("전우치"));
		System.out.println("손오공: " + map.get("손오공"));
		// get(key): value를 출력하는 메서드
		
		map.remove("손오공");
		// remove(key): 해당하는 key의 값을 찾아서 삭제하는 메서드
		
		System.out.println("손오공: " + map.get("손오공"));
		System.out.println(map.keySet());
	}

}
