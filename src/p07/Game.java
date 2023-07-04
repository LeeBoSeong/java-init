package p07;

public class Game {
	public String name;
	public String genre;
	public int price;
	
	public void start()	{
		System.out.println(name + "를 시작합니다.");
	}
	
	public void play(){
		System.out.println(name + "을 플레이 하는 중입니다");
	}
	 
	public void stop() {
		System.out.println(name + "을 종료 합니다");
	}
}
