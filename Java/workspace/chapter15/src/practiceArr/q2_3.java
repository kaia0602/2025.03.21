package practiceArr;

public class q2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("   | 1  2  3  4  5  6  7  8  9");
		System.out.println("---+------------------------");

		for(int i = 1; i <= 9; i++) {
			System.out.print(" " + i + "| ");
			for (int j = 1; j <= 9; j++) {
				System.out.print(j * i);
				if((i * j) >= 10) {
					System.out.print(" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
