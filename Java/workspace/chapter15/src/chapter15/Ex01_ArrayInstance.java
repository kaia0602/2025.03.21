package chapter15;

public class Ex01_ArrayInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자바의 배열은 자료형이 동일한 데이터가 같은 변수 이름으로 저장되는 자료구조
		// 배열의 선언
		// 자료형[] 변수이름 = new 자료형[배열의 길이];
		
		int[] intArr = new int[3]; // int 값을 3개 저장할수 있는 배열
		double[] doubleArr = new double[4]; // double 값을 3개 저장하는 배열
		String[] strArr = new String[5]; // String 값을 3개 저장하는 배열
		
		// length: 배열의 길이를 출력, 데이터의 개수X 
		System.out.println(intArr.length);
		System.out.println(doubleArr.length);
		System.out.println(strArr.length);
		
		// 배열에 데이터 저장하기
		// 배열이름[위치] = 값;
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		
		// 배열의 데이터 출력하기
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
	 // System.out.println(intArr[3]); : Index 3 out of bounds for length 3
		System.out.println(doubleArr[3]); // 0.0 기본 자료형의 경우 0이 출력
		System.out.println(strArr[3]); // 클래스 자료형의 경우 null이 출력
		
		// 배열의 선언과 데이터 저장을 한번에 하는 방식
		int[] intArr2 = {90, 50, 70, 30};
		String[] strArr2 = {"국어", "영어", "수학", "과학"};
		System.out.println(intArr2[0]);
		System.out.println(intArr2[1]);
		System.out.println(strArr2[0]);
		System.out.println(strArr2[1]);
		
	}

}
