package p07;

class Song{
	public int rank;
	public String title;
	
	public void printTitle() {
		System.out.println("노래 제목 : " + title);
	}
	
//	public static void printSomthing() {
//		System.out.println("노래 제목 : " + title);//스태틱 메소드 안에 title은 논 스태틱이기 때문에
//	}
}

public class SonExec {
	public static void main(String[] args) {
		Son s = new Son();
		s.name = "동동";
		s.job = "게발자";
		s.age = 30;
		s.hobby = "게임";
		s.printJob();
		s.printHobby();
		
		Father f = new Father();
		f.name = "퉁퉁이";
//		f.hobby = "낚시";
		
		Song song = new Song();
		song.title = "바보";
		song.printTitle();
	}
}
