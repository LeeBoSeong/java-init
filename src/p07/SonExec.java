package p07;

class Song extends Son{//이렇게 되면 song은 son을 확장(상속) 한 것이고 Son은 Father를 확장(상속) 한것이기 때문에 Son에 name변수가 없더라도 Father에 있기 때문에 name을 쓸 수 있다.
	public int rank;
	public String title;

	public void printTitle() {
		System.out.println("노래 제목 : " + title +"| 부른 사람 : " + name);	
		printHobby();
	}
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
		
		Father f = new Son();
		f.name = "아빠";
		f.job = "농사꾼";
		Son ff = (Son)f;//캐스팅을 하여 Father로 생성한 f 가 Son에 있는 메서드를 가져올수 있게 함
		ff.hobby = "낚시";
		f.printJob();
		ff.printHobby();
		
		Song song = new Song();
		song.title = "바보";
		song.name = "이보성"; // Song class가 Son을 확장 하였기 때문에 사용가능
		song.hobby = "멍때리기";// Song class가 Son을 확장 하였기 때문에 사용가능
		song.printTitle();
	}
}
