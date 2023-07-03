package p06;

class Car{
	public String name;
	public static String type;
}

public class InstanceTest { //메모리를 새로 생성하는 행위를 Instance 라고 함 ex) Random random = new Random
	
	public static void main(String[] args) {
		Car.type = "승용차";
		
		Car sonata = new Car();
		sonata.name = "소나타";
		sonata.type = "da";
		
		System.out.println(sonata.name + sonata.type);
	}
}
