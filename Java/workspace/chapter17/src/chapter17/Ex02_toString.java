package chapter17;

class Book {
	String name;
	String author;
	
	@Override
	public String toString() {
		return this.name + ", " + this.author;
	}
	
}

public class Ex02_toString {

	public static void main(String[] args) {

		// 자바의 기본 클래스
		// java.lang: 기본 클래스들이 들어있는 패키지명
		// object: 최상위 클래스로 기본 메서드를 제공
		Ex02_toString ex02 = new Ex02_toString();
		System.out.println(ex02);
		System.out.println(ex02.toString());
		// toString 메서드를 오버라이딩하여 내용을 변경하지 않으면 
		// 패키지명.클래스명@16진수메모리주소
		
		Object obj = new Object();
		// Object 모든 클래스가 상속받고 있으며
		// 직접만든 클래스의 경우에도 컴파일시 상속을 추가해줌
		// Object 있는 모든 메서드는 어떤 클래스이던 사용 가능

		String name = "홍길동";
		System.out.println(name);
		System.out.println(name.toString());
		// String 클래스의 경우 toString을 문자열만 출력하도록 오버라이딩한 상태
		
		Book book1 = new Book();
		book1.name = "java programming";
		book1.author = "leejaehwan";
		System.out.println(book1.toString());
		System.out.println(book1);
	}

}
