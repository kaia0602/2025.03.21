package chapter14;

public class Ex04_StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// indexof("찾고싶은 문자열"): 문자열의 위치를 찾아주는 메서드
		String str = "AppleBananaOrange";
		System.out.println(str.indexOf("a")); // 6
		System.out.println(str.indexOf("Banana")); // 5
		
		// indexOf("문자열", 시작위치): 시작위치 부터 문자열을 찾아서 돌려주는 메서드
		System.out.println(str.indexOf("na", 7)); // 7
		System.out.println(str.indexOf("na", 8)); // 9
		
		if(str.indexOf("Banana") > 0) {
			System.out.println("바나나가 있다");
		} else {
			System.out.println("바나나 없다");
		}
		
		// substring(시작위치, 종료위치): 시작부터 종료까지의 문자열 반환
		System.out.println(str.substring(0, 5)); // Apple
		// substring(시작위치): 시작위치부터 문자열의 끝까지 돌려주는 메서드
		System.out.println(str.substring(5)); // BananaOrange
		
		// length(): 문자열 안에 있는 글자의 개수를 돌려주는 메서드
		System.out.println(str.length());
		
		// charAt(문자위치): 문자위치에 맞는 문자를 반환하는 메서드
		System.out.println(str.charAt(0)); // A
		System.out.println(str.charAt(1)); // p
		System.out.println(str.charAt(3)); // l
		
		// String.valueOf(): 다른 타입의 자료형을 String으로 전환하는 메서드 
		double e = 2.718281;
		Double e2 = 2.718281;
		
		// 다른 타입의 변수를 String에 저장하여야 하는 경우에 사용하는 메서드
		String se = String.valueOf(e);
		String se2 = e2.toString();
		System.out.println(se);
		
		// toLowerCase(): 대문자를 소문자로
		System.out.println(str.toLowerCase());
		// toUpperCase(): 소문자를 대문자로
		System.out.println(str.toUpperCase());
		// trim(): 공백을 삭제
		System.out.println("   trim   ".trim());
		
		// 문자열 연산하기
		// concat(더하고 싶은 문자열): 문자열과 문자여를 더해주는 메서드
		System.out.println(str.concat("Berry")); // AppleBananaOrangeBerry
		// 문자열에 +, +=을 사용하면 자동으로 concat() 메서드를 실행한다.
		System.out.println(str + "Melon"); // AppleBananaOrangeMelon
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
