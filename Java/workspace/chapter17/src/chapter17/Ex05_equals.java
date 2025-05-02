package chapter17;

class Book2 {
	Long id; //주민번호, 학번, 군번 등
	String name;
	String author;
	Book2 (String name, String author) {
		this.author = author;
		this.name = name;
	}
	@Override
	public String toString() {
		return name + "," + author;
	}
	@Override
	public boolean equals(Object obj) {
		// name.equals: String 클래스의 equals, 문자열만 비교
		// obj.toString(): Book2 의 toString이 실행되어 name을 반환
		String str = this.toString();
		return str.equals(obj.toString());
	}
}

public class Ex05_equals {

	public static void main(String[] args) {

		// equals: Object 클래스에 있는 메서드로 인스턴스끼리 비교할때 사용
		// equals는 오버라이드 하지 않으면 메모리주소 끼리 비교한다, ==으로 비교하는 것과 같음
		
		Book2 book1 = new Book2("java programming", "Leejaehwan");
		Book2 book2 = new Book2("HTML", "Leejaehwan");
		Book2 book3 = new Book2("java programming", "Leejaehwan");
		// false가 나오는 이유: 두개의 인스턴스 모두 new를 이용했기에 다른 객체이다
		System.out.println(book1 == book3);
		// equals를 오버라이딩하여 제목과 저자가 같으면 같은 책으로 출력하도록 변경
		System.out.println(book1.equals(book3));
	}

}
