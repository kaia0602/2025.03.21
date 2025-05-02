package loopPractice;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // *
		  //***
		 //*****
		//*******
		 //*****
		  //***
		   //*
		for(int i = 0; i < 4; i++) {
			for(int j = 3 - i; j >0; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i * 2  ; k ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int start = 5;
		for (int l = 0; l <3; l++) {
			for(int m = 0; m <= l; m++) {
				System.out.print(" ");
			}
			for(int n = 0 ; n < start; n++) {
				System.out.print("*");
			}
				start -= 2;
				System.out.println();
		}

	}

}
