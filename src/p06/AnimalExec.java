package p06;

public class AnimalExec {
	
	public static void printAnimals(Animal[] animals) {
		
		for(int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			animal.run();
			if(!"냥이".equals(animal.name)) {
				animal.hunt();
			}
				animal.eat();
			if("새".equals(animal.type)) {//String을 비교할땐 문자를 먼저 .equals 하기
				animal.fly();
			}
		}
	}
	
	public static void main(String[] args) {
		Animal tiger = new Animal();
		tiger.name = "호돌이";
		tiger.type = "호랑이";
//		tiger.eat();
//		tiger.run();
//		tiger.hunt();
		
		Animal cat = new Animal();
		cat.name = "냥이";
//		cat.type = " 고양이";
//		cat.eat();
//		cat.run();
//		cat.hunt();
		
		Animal bird = new Animal();
		bird.name = "구구";
		bird.type = "새";
		
		Animal[] animals = new Animal[3];
		animals[0] = tiger;
		animals[1] = cat;
		animals[2] = bird;
		
		printAnimals(animals);
		
	}
}
