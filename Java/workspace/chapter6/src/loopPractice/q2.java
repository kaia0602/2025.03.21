package loopPractice;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램
		// 을 만들어 보세요(break 사용)
		
		int i = 0;
//		int j = 0;
		for(i=2 ; i <= 9; i++) {
			
			for(int j=1; j <= 9 ; j++) {
			if (j == i+1) {
				break; }
			System.out.println(i +"*"+ j +"="+ (i*j));       }
			
		}
		
	

}}
