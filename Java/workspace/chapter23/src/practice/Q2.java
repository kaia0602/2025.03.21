package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MStudent{
	String name;
	int grade;
	MStudent(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
}
class HStudent{
	String name;
	int grade;
	HStudent(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
}

public class Q2 {

	public static void main(String[] args) {

		// 리스트의 숫자 합계 출력하기 결과값 : 15
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(number.stream().reduce(0,(a,b) -> a + b));
		
		// 문자열 연결해서 출력하기 결과값 : JavaStreamAPI
		String[] strArr = {"Java", "Stream", "API"};
		System.out.println(Arrays.stream(strArr).reduce("",(a, b) -> a += b));
		
		
		// 리스트의 숫자를 모두 곱한 값 출력하기 결과값 : 750
		List<Integer> numList = Arrays.asList(5, 10, 15);
		System.out.println(numList.stream().reduce(1,(a, b) -> a *= b));
		
		// .collect(Collestors.toList());
		// 저장된 결과를 리스트로 저장
		
		List<MStudent> ms = new ArrayList<>();
		ms.add(new MStudent("홍길동", 1));
		ms.add(new MStudent("전우치", 2));
		ms.add(new MStudent("손오공", 3));
		ms.add(new MStudent("해리포터", 3));
		ms.add(new MStudent("멀린", 3));
		
		List<HStudent> hs = ms.stream()
				.map(s->new HStudent(s.name, s.grade))
//				map에서 저장된 결과를 List로 변경하여 저장
				.collect(Collectors.toList());
		for(HStudent s : hs) {
			System.out.println(s.name+","+"s.grade");
		}
	}

}
