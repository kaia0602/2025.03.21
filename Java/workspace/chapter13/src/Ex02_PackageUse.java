import com.study.Banana;

public class Ex02_PackageUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple();
		apple.showName();
		
		// 패키지명을 클래스 앞에 직접 적는 방식
		// com.study.Banana banana = new com.study.Banana();
		Banana banana = new com.study.Banana();
		// 클래스 선언 부 위에 import를 사용하여 패키지명을 적는 방식
		banana.showName();
	}

}
