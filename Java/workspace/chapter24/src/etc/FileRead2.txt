package chapter24;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex04_FileRead {

	public static void main(String[] args) {

		try (FileInputStream in = new FileInputStream("data.txt")) {
			// read: 글자 하나를 읽어 int 값으로 돌려주는 메서드
			int dat = in.read();
			System.out.println(dat); // 65
			System.out.printf("%c \n", dat); // A
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
