package chapter14;

public class Ex03_ContentsCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("Apple");
		String str2 = new String("apple");
		String str3 = new String("Banana");
		int cmp;

		// equals: 객체와 객체를 비교하는 메서드
		// String의 경우 안에 저장되있는 문자열이 일치하는지 확인
		if (str1.equals(str3)) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}

		// compareTo: 문자의 순서에 맞게 strN이 앞에 있는지 뒤에 있는지 출력
		// 사전의 순서는 아스키코드에 의해 정의
		// 결과 >
		// 음수: 사전 상으로 앞에 위치
		// 0: 같은 값으로 위치
		// 양수: 사전 상으로 뒤에 위치
		cmp = str2.compareTo(str3);

		if (cmp == 0) {
			System.out.println("두 문자열은 일치합니다.");
		} else if (cmp < 0) {
			System.out.println("사전의 앞에 위치하는 문자: " + str2);
		} else {
			System.out.println("사전의 앞에 위치하는 문자: " + str3);
		}

		// compareToIgnoreCase(): 대소문자 구분을 하지 않고 비교
		if (str1.compareToIgnoreCase(str2) == 0) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}
	}

}
