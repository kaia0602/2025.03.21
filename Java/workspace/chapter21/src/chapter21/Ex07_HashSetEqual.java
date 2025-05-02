package chapter21;

import java.util.HashSet;

class Student {

	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ": " + age;
	}
	// new로 생성된 객체를 해쉬코드를 바꿔서 같게 설정
	public int hashCode() {
		int num = age % 3;
		System.out.println(num);
		return num;
	}

	public boolean equals(Object obj) {
		System.out.println("비교를 합니다.");
		if (age == ((Student) obj).age)
			return true;
		else
			return false;
	}

}

public class Ex07_HashSetEqual {

	public static void main(String[] args) {

		HashSet<Student> set = new HashSet<>();
		// equals를 오버라이드 하여 나이가 같으면 같은 데이터로 설정
		set.add(new Student("홍길동", 20));
		// 같은 나이값을 가져 전우치는 미저장
		set.add(new Student("전우치", 20));
		set.add(new Student("홍길동", 25));

		System.out.println("객체 수: " + set.size());

		for (Student s : set) {
			System.out.println(s.toString() + '\t');
		}
		System.out.println();

	}

}
