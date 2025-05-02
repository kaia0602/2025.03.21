package chapter21;
import java.util.Set;
import java.util.TreeSet;

// Comparable 인터페이스: 
// 클래스에 오름차순 내림차순 정렬시 사용하는 compateTo메서드를 추가
// 클래스마다 1가지 방식으로만 정렬가능
// 클래스를 수정(상속)해야 정렬방식을 설정가능
class Student3 implements Comparable<Student3> {
	private String name;
	private int age;
	
	public Student3 (String name, int age) {
		this.name = name;
		this.age =age;
	}
	
	public String toString( ) {
		return name + ":" + age;
	}

	@Override
	public int compareTo(Student3 p) {
		return this.age - p.age; //나이 오름차순
	//	return p.age - this.age; 나이 내림차순
	//  return this.name.compareTo(p.name) 이름 오름차순 
	//  return p.name.compareTo(this.name) 이름 내림차순 
	}
}

public class Ex09_Comparable {

	public static void main(String[] args) {
		Set<Student3> tree = new TreeSet<>();
		tree.add(new Student3("홍길동", 30));
		tree.add(new Student3("전우치", 40));
		tree.add(new Student3("손오공", 20));
		
		for(Student3 s : tree) {
			System.out.println(s);
		}
		
		
	}

}
