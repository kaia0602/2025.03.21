package chapter24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex11_BufferedReader {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("../text2.txt"))) {
			String str;

			while (true) {
				// readLine(): 파일의 한줄을 읽는 메서드
				str = br.readLine();
				if (str == null)
					break;
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
