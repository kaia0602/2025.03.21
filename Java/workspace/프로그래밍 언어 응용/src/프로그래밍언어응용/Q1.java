package 프로그래밍언어응용;

import java.util.Scanner;

class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * 3.14;
	}
}

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle[] arr = new Circle[4];
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + " 반지름 >> ");
			int radious = sc.nextInt();
			Circle circle = new Circle(radious);
			arr[i] = circle;
		}
		System.out.println("저장하였습니다...");

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].getArea();
		}
		System.out.println("원의 면적 전체 합은 " + sum);
	}
}
