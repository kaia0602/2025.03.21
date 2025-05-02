package practice;

class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
}
class NamedCircle extends Circle {
	// 부모 클래스에 생성자가 있다면 자식클래스의 생성자에서 부모 클래스의 
	// 생성자를 실행
	String name;
	public NamedCircle(int radius, String name) {
		// super(매개변수): 부모의 생성자 실행
		super(radius);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	void show() {
		System.out.println(name + ", 반지름 = " + getRadius());
	}
}

public class CircleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
	}

}
