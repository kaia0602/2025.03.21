package chapter17;

class Car {
	Long id;
	String name;

	@Override
	public int hashCode() {
		return id.intValue();
	}

	@Override
	public String toString() {
		return id.toString();
	}

	@Override
	public boolean equals(Object obj) {
		return id.hashCode() == id.hashCode();
	}
}

public class Ex06_Hashcode {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.id = 1L;
		Car car2 = new Car();
		car2.id = 1L;

		// hashcode(): 메모리 주소를 10진법으로 반환
		// toString(): 가장뒤에 16진법 메모리구조를 반환
		System.out.println(car1.hashCode()); // 1940030785
		System.out.println(car1); // 73a28541
		System.out.println(car2.hashCode()); // 1869997857
		System.out.println(car2); // 6f75e721

		System.out.println(car1 == car2);
		System.out.println(car1.equals(car2));
	}

}
