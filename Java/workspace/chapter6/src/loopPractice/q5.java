package loopPractice;

public class q5 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
			//    *     0 3 1
		 	//   ***	1 2 3
		 	//  *****	2 1	5 
		 	// *******	3 0 7
		for(int i = 0; i < 4; i++) {
			for(int j = 3 - i; j >0; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i * 2 ; k ++) {
				System.out.print("*");
			}
			System.out.println();
			
//			byte a = 10;
//			byte aa = 10;
//			char aaa = (char) (a+aa);
//			System.out.println(aaa);
		}

	}

}
