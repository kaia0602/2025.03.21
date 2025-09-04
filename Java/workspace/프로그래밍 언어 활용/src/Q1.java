import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int computer = (int) (Math.random() * 100) + 1;
		System.out.println("=== 숫자맞추기 게임을 시작합니다. ===");
		System.out.println("컴퓨터가 숫자를 생각했습니다.");
		
		if(computer % 2 == 0) {
			System.out.println("힌트는 짝수 입니다.");
		} else {
			System.out.println("힌트는 홀수 입니다.");
		}
		
		int count = 0;
		
		while (true) {
			System.out.print("1~100 사이 값을 입력 >> ");
			int user = sc.nextInt();
			
			if(user<1 && user>100) {
				System.out.println("1~100 사이 값만 입력");
				continue;
			}
			
			if(computer == user) {
				count++;
				break;
			} else if (computer > user) {
				System.out.println("더 큰 수입니다.");
				count++;
			} else {
				System.out.println("더 작은 수 입니다");
				count++;
			}
			
			
		}
		System.out.println(count + "회 만에 맞췄습니다.");
		System.out.println("=== 게임을 종료합니다. ===");
	}

}
