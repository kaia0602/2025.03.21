package loopPractice;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// *******  0 0 7
		//  *****	1 1 5
		//   ***	2 2 3
		//    *		3 3 1
		int start = 7;
		for (int i = 0; i <4; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < start; k++) {
				System.out.print("*");
			}
			start -= 2;
				System.out.println();
		}
	}

}
