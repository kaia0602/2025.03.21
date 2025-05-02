package chapter6;

import java.util.Scanner;

public class Ex02_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("점수: ");
		int score = scr.nextInt();
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80){
			System.out.println("B");
		}else if(score >= 70){
			System.out.println("C");
		}else if(score >= 60){
			System.out.println("D");
		}else{
			System.out.println("F");
		}
		
		int num = 11;
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		int num2 = -30;
		int result = num2 + 20;
		if(result > 255) {
			System.out.println(255);
		}else if(result < 0) {
			System.out.println(0);
		}else {
			System.out.println(result);
		}
	}

}
