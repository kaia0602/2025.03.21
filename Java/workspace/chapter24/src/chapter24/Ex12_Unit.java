package chapter24;

public class Ex12_Unit implements java.io.Serializable{
	// Serializable: 인스턴스를 파일에 저장하거나 네트워크로 전송할 때 설정하는 인터페이스
	// serialVersionUID: 인스턴스에 설정하는 고유한 식별자, 클래스의 버전 정보
	
	private static final long serialVersionUID = 1L;
	// Serializable를 상속하고
	// serialVersionUID를 자동완성하기
	
	private String name;
	
	public Ex12_Unit(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}


}
