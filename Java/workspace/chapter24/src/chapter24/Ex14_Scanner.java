package chapter24;

import java.io.File;
import java.util.Scanner;

public class Ex14_Scanner {

	public static void main(String[] args) {

		// 텍스트 데이터를 읽을때 여러가지 기능들을 사용할 수 있다.
		// 공백, 줄단위, 숫자, 단어 단위로 읽고싶을때
		// 파싱 기능이 뛰어남
		try (Scanner sc = new Scanner(new File("log.txt"))) {
			while (sc.hasNext()) {
				// 파일의 내용을 한중씩 읽을때
			System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//git 확인용
		
	}

}
