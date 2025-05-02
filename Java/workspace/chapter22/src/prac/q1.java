package prac;


interface Ques1{
	int result(int start, int end, int num);
}

interface Ques2 {
	int height(int floor);
}

interface Ques3 {
	int y(int x);
}

interface Ques4 {
	void grade(String score);
}

public class q1 {


	public static void main(String[] args) {
//		아래의 문제를 람다식을 이용하여 풀어보자 입력부분을 매개변수로 설정할 것
//		1~100까지의 수중에서 3의 배수의 합을 출력하라
		Ques1 result = (start, end ,num) -> {
			int sum = 0;
			for(int i=start; i<=end; i+=num) {
				sum+=i;
			}
			return sum;
		};
//		한층의 높이가 5m일때 건물의 층를 입력하면 몇미터인지 출력하라
		Ques2 result2 = (int floor) -> floor * 5;
		System.out.println(result2.height(10));

//		y=x*x-3x+7을 계산하여 y를 출력하라
		Ques3 result3 = (int x) -> x * x - 3 * x + 7;
		System.out.println(result3.y(5));

//		학점이 A,B면 Excellent, D, C이면 Good, F이면 Bye라고 출력하라
		Ques4 result4 = (String score) -> {
			if (score.equals("A") || score.equals("B")) {
				System.out.println("Excellent");
			} else if (score.equals("C") || score.equals("D")) {
				System.out.println("Good");
			} else {
				System.out.println("Bye");
			}
		};
		result4.grade("A");;

	}

}
