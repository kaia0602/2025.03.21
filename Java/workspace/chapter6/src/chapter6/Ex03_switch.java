package chapter6;

public class Ex03_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		switch(변수) {
//			case 비교값 :
//				실행할 코드;
//				break;
//			case 비교값 :
//				실행할 코드;
//				break;
//			default :
//				실행할 코드;
//		}

		int n = 4;
		switch (n % 3) {
		case 1:
			System.out.println("나머지가 1");
			break;
		case 2:
			System.out.println("나머지가 2");
			break;
		default:
			System.out.println("나머지가 0");
		}

		// banana, apple, tomato, mango, melon, carrot
		// 위의 과일과 야채중에 banana, apple, mango, melon이라면
		// 과일이라고 출력 tomato, carrot 이라면 야채라고 출력

		String food = "banana";
		switch (food) {
		case "banana":
		case "apple":
		case "mango":
		case "melon":
			System.out.println("fruit");
			break;
		case "tomato":
		case "carrot":
			System.out.println("vegi");
			break;
		default:
			System.out.println("none");
		}

		// 월별 날짜 출력하기
		// 1, 3, 5, 7, 8, 10, 12 월은 31일
		// 4, 6, 9, 11 월을 30일
		// 2월은 28일
		// 을 출력
		int mm = 11;
		switch (mm) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(mm + "월은 31days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(mm + "월은 30days");
			break;
		default:
			System.out.println(mm + "월은 28days");
		}

	}

}
