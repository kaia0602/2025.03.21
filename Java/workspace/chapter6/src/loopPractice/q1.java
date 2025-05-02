package loopPractice;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 
// 구구단을 짝수단만 출력하도록 프로그램을 만들어 보세요
//(continue 사용)
		int i = 0;
		int j = 0;
		for(i=2 ; i <= 9; i++) {
			if(i % 2 != 0) {
				continue;
			}
			for(j=1; j <= 9; j++) {
				System.out.println(i +"*"+ j +"="+ (i*j));
			}
			
		}
		
		
	}

}
