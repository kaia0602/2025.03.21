package practiceArr;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 한 문자를 입력하세요 >>");
		String s = sc.next();
		char c = s.charAt(0);
		
		
		for(char i = 'a'; i <= c; i++) {
			for(char j = i; j <= c; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
	}

}
