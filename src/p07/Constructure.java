package p07;

public class Constructure {
	
	public	Constructure(){
		System.out.println("나 불름?");
	}
	public Constructure(int num) {
		System.out.println("int num 불름?");
	}
	
	public static void main(String[] args) {
		Constructure c = new Constructure();
	}
}
