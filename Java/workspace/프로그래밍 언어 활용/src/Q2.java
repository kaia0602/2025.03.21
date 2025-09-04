import java.util.HashMap;
import java.util.Scanner;

class Phone {
	String name;
	String tel;
	String address;

	Phone(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

}

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashMap<String, Phone> pm = new HashMap<>();

		System.out.println("인원수 >> ");
		int count = sc.nextInt();
		while (pm.size() < count) {
			System.out.println("이름과 전화번호(번호는 연속적으로 입력), 주소 >> ");
			String name = sc.next();
			String tel = sc.next();
			String address = sc.next();
			pm.put(name, new Phone(name, tel, address));
		}
		System.out.println("저장되었습니다...");

		while (true) {
			System.out.print("검색할 이름 >> ");
			String n = sc.next();
			if (n.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}

			Phone p = pm.get(n);
			if (p == null) {
				System.out.println(n + " 은(는) 없습니다.");
			} else {

				System.out.println(p.name + "의 번호와 주소는 " + p.tel + ", " + p.address + "입니다.");
			}
		}
	}

}
