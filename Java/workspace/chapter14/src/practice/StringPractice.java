package practice;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 1 주민등록 번호의 년월일을 각각의 변수에 저장하세요
		String str = "250417-1234567";
		String year = str.substring(0, 2);
		year = "20" + year;
		String month = str.substring(2, 4);
		String day = str.substring(4, 6);
		
		System.out.println(year + "년 " + month + "월 " + day + "일이 생일입니다.");
		
		// 문제 2 a/b/c/d를 a:b:c:d 로 바꾸어 저장하세요.
		String str2 = "a/b/c/d";
		str2 = str2.replace("/", ":");
		System.out.println(str2);
		
		
	}

}
