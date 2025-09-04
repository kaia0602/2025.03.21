
public class Q4 {

	public static void main(String[] args) {

		int[][] scores = {
			    {80,60,70}, {90,95,80}, {75,80,100}, {80,70,95}, {100,65,80}
			};
		System.out.println("학생번호   국어     영어     수학      총점      평균");
		System.out.println("=============================================");
//		int sum = 0;

		
		for (int i = 0; i < scores.length ; i ++) {
			int sum = 0;
			double avg = 0;
			System.out.print(i + 1 + "번 학생: ");
			for (int j = 0; j < scores[i].length; j ++) {
				sum += scores[i][j];
				avg = sum / scores[j].length;
				System.out.print(scores[i][j] +  "\t" );
			}
			System.out.print(sum + "\t");
			System.out.print(avg);
			System.out.println();
		}
		

		

	}

}
