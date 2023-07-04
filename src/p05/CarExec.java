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
		
		
		for(int i = 0; i < cars.length; i++) {
			Car max = cars[i];
			int max1 = max.price;
			int idx = i;
			for(int j = i+1; j < cars.length; j++) {
				if(max1 < cars[j].price) {
					max = cars[j];
					idx = j;
				}
			}
			Car temp = cars[i];
			cars[i] = max;
			cars[idx] = temp;
			
			System.out.println(cars[i].name);
		}
	}
}
