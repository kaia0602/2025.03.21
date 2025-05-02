package practice;

import java.util.Arrays;
import java.util.List;





class Customer {
	private String name;
	private int age;
    
    public Customer(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Q1 {

	public static void main(String[] args) {
		// 아래의 정수리스트에서 양수만 출력하도록 스트림을 작성하자
		List<Integer> numbers = Arrays.asList(-3, -1, 0, 2, 5, -10, 7);
		numbers.stream()
		.filter(n -> n > 0)
		.forEach(n -> System.out.print(n + " "));
		// .forEach(System.out::print);
		// 메서드 참조
		// .매개변수 생략, 메서드에 매개변수가 자동설정, 실행
		System.out.println();
		
		// 아래의 리스트에서 문자열의 길이를 출력하는 스트림을 작성하자
		List<String> strings = Arrays.asList("java", "HTML", "CSS", "JavaScript");
		strings.stream()
		.forEach(s -> System.out.print(s.length() + " ") );
		System.out.println();

		// 아래의 문장을 공백을 기준으로 나누고 각 단어의 길이를 출력하는 프로그램을 작성하자 
		String sentence = "The quick Brown fox";
		String[] words = sentence.split(" ");
		Arrays.stream(words)
		.forEach(w -> System.out.print(w.length() + " "));
		System.out.println();
		
		// 고객 정보가 담긴 리스트가 있습니다. 각 고객은 이름(String)과 나이(int)를 
		// 갖고 있습니다. 다음 조건에 따라 고객 이름 목록을 출력하는 프로그램을 작성하세요.
		// 고객 중 20세 이상인 사람들만 필터링합니다.
		// 이름을 알파벳 순으로 정렬합니다.
		// 이름을 대문자로 변환하여 출력합니다.
		List<Customer> customers = Arrays.asList(
			    new Customer("alice", 22),
			    new Customer("bob", 17),
			    new Customer("charlie", 25),
			    new Customer("david", 19),
			    new Customer("eve", 30)
			);
		customers.stream()
		.filter(n -> n.getAge() >= 20)
		.sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
		.map(n -> n.getName().toUpperCase())
		.forEach(n -> System.out.print(n + " "));
	}



}
