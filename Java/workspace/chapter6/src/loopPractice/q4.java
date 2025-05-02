package loopPractice;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요
		// *****
		// ****
		// ***
		// **
		// *
		
		for(int i = 5; i >= 1; i--) {
			String star = "";
			for(int j = 1; j <= i; j++) {
				 star += "*";
			}
			System.out.println(star);
		}
	}

}
