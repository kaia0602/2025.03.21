package prac;

class Song {

	private String title;
	
	Song(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}


	
}

public class q1 {

	public static void main(String[] args) {

//		1. 아래 실행 결과와 같이 출력하는 다음 main()을 가진 Song 클래스를 작성하라.  
//		Song클래스는 노래 제목 title필드, 생성자, getTitle() 메소드로 구성된다. 
//		[목적 – 클래스 만들기 연습] [난이도 하] 

	Song mySong = new Song("Nessum Dorma"); 
	Song yourSong = new Song("공주는 잠 못 이루고"); 
	System.out.println("내 노래는 " + mySong.getTitle()); 
	System.out.println("너 노래는 " + yourSong.getTitle()); 
	 
		
	}

}
