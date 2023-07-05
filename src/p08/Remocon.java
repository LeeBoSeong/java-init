package p08;

public class Remocon implements Remote{

	@Override
	public void on() {
		System.out.println("킨다");
	}

	@Override
	public void off() {
		System.out.println("끈다");
	}
	
	
}
