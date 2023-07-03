package p05;

import java.util.Iterator;

public class CarExec {
	public static void main(String[] args) {
		Car[] cars = new Car[5];
		
		cars[0] = new Car();
		cars[0].name = "벤츠";
		cars[0].made = "독일";
		cars[0].price = 50000;
		
		cars[1] = new Car();
		cars[1].name = "포드";
		cars[1].made = "미국";
		cars[1].price = 20000;
		
		cars[2] = new Car();
		cars[2].name = "현대";
		cars[2].made = "한국";
		cars[2].price = 14000;
		
		cars[3] = new Car();
		cars[3].name = "푸조";
		cars[3].made = "프랑스";
		cars[3].price = 30000;
		
		cars[4] = new Car();
		cars[4].name = "람보르기니";
		cars[4].made = "이탈리아";
		cars[4].price = 120000;
		
		Car carPric = cars[0];
		Car carPric2 = cars[0];
		Car carPric3 = cars[0];
		
		for(int i = 1; i < cars.length; i++) {
			if (carPric.price < cars[i].price) {
				carPric = cars[i];
			}
			for(int j = i; j < (cars.length); j++) {
				if(carPric2.price < cars[j].price) {
				carPric2 = cars[j];
				}
				for(int k = j; k < (cars.length);k++) {
					if(carPric3.price < cars[k].price) {
						carPric3 = cars[k];
					}
				}
			}
		}
		System.out.println("비싼차 : "+carPric.name + "||두번째 차 : "+carPric2.name +"||세번째 차 :" + carPric3.name);
	}
}
