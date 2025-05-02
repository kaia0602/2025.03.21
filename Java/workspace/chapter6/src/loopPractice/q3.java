package loopPractice;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요
		// *
		// **
		// ***
		// ****
		// *****
		int i = 0;
		
		for( i = 1; i<=5; i++) {
			String star = "";
			for(int j = 0; j < i; j++) {
				
				star += "*" ;
			}
				System.out.println(star);
		}
		
	}

}
