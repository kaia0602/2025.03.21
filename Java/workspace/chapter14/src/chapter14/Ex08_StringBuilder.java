package chapter14;

public class Ex08_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String의 단점
		// 객체를 저장하는 클래스 자료형이고 String 안의 내용을 변경할때마다
		// 객체가 생성되어 메모리 사용에 비효율적이다. => 내용 변경시 연산속도가 느림
		// StringBuilder는 위의 문제점을 해결하여 연산속도가 빠르다

		StringBuilder buf = new StringBuilder("동해물과");

		// append: 문자열을 더할때 사용하는 매서드
		buf.append("백두산이");
		System.out.println(buf);

		buf.append(12345);
		System.out.println(buf.toString());

		// delete(0, 4): 인덱스 0번 부터 4번까지 위치하는 문자열을 삭제
		buf.delete(0, 4);
		System.out.println(buf.toString());

		// replace(시작위치, 종료위치, 변경할 문자열)
		buf.replace(4, 8, "ABC");
		System.out.println(buf.toString());

		// reverse(): 문자열을 거꾸로 설정하는 메서드
		buf.reverse();
		System.out.println(buf.toString());

		// 1970년 1월 1일부터 현재까지의 밀리세컨드 계산한값
		long startTime = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < 100000; i++) {
			str += "apple"; // str 변수레 apple을 1000개 저장
		}
		long endTime = System.currentTimeMillis();
		System.out.println("String 연산시간: " + (endTime - startTime));

		startTime = System.currentTimeMillis();
		StringBuilder str2 = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			str2.append("apple"); // str 변수레 apple을 1000개 저장
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder 연산시간: " + (endTime - startTime));
		
		// StringBuilder, StringBuffer
		// 두개의 클래스가 실행하는 내용은 동일하다
		// 차이점: 스레드 사용시 StringBuffer의 경우 내용이 정상적으로 출력
		//				   StringBuilder의 경우 내용이 깨져서 출력 = 스레드 동기화를 하지않아 빠르다
		
		
		
		
		
		
		
		
		

	}

}
