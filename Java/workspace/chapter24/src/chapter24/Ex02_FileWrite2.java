package chapter24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex02_FileWrite2 {

	public static void main(String[] args) {

		OutputStream out = null;

		try {
			// 입출력 스트림은 예외처리를 하지 않으면 컴파일 에러가 발생한다
			out = new FileOutputStream("data.txt");
			out.write(65);
		} catch (IOException e) {

		} finally {
			// 입출력 스트림이 만들어져있는지 확인
			if (out != null) {
				try {
					out.close();
				} catch (IOException e2) {

				}
			}
		}
	}

}
