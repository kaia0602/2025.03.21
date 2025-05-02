package chapter5;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("출력 할 문자문");
		// println: 문자열 출력 후 엔터를 쳐주는 메서드
		System.out.println("두번째 줄");
		// print: 문자열을 출력하고 엔터를 치지 않음
		System.out.print("Hello, ");
		System.out.print("I am kaia");
		System.out.println();
		String name = "kaia";
		int age = 20;
		double height = 178.8;
		System.out.println(name +"의 나이는 " + age + "이고, 키는 " + height + "입니다." );
		
		// printf: 포맷을 이용한 변수 출력
		System.out.printf("%s의 나이는 %d이고, 키는 %.22니다.",name, age, height);
		// %s: 문자열, String
		// %d: 숫자, int
		// %f: 실수
		
	}

}
