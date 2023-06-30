package p05;

public class FoodExec {
	
	public static void printFood(Food[] foods) {
		for(Food f : foods) {
			System.out.println("음식 :"+f.name);
			System.out.println("가격 :"+f.price);
			System.out.println("타입 :"+f.type);
		}
	}
	public static void main(String[] args) {
		Food f = new Food();
		Food f1 = new Food();
		Food f2 = new Food();
		Food f3 = new Food();
		Food f4 = new Food();
		
		f.name = "삼겹살";
		f.price = 15000;
		f.type = "한식";
		
		f1.name = "돈까스";
		f1.price = 10000;
		f1.type = "일식";
		
		f2.name = "피자";
		f2.price = 16000;
		f2.type = "양식";
		
		f3.name = "파스타";
		f3.price = 17000;
		f3.type = "양식";
		
		f4.name = "떡볶이";
		f4.price = 5000;
		f4.type = "한식";
		
		Food[] foods = new Food[5];
		foods[0] = f;
		foods[1] = f1;
		foods[2] = f2;
		foods[3] = f3;
		foods[4] = f4;
		
		printFood(foods);
		
//		printFood(f);
//		printFood(f1);
//		printFood(f2);
//		printFood(f3);
//		printFood(f4);
		
//		System.out.println("음식 :"+f.name);
//		System.out.println("가격 :"+f.price);
//		System.out.println("타입 :"+f.type);
//		
//		System.out.println("음식 :"+f1.name);
//		System.out.println("가격 :"+f1.price);
//		System.out.println("타입 :"+f1.type);
//		
//		System.out.println("음식 :"+f2.name);
//		System.out.println("가격 :"+f2.price);
//		System.out.println("타입 :"+f2.type);
//		
//		System.out.println("음식 :"+f3.name);
//		System.out.println("가격 :"+f3.price);
//		System.out.println("타입 :"+f3.type);
//		
//		System.out.println("음식 :"+f4.name);
//		System.out.println("가격 :"+f4.price);
//		System.out.println("타입 :"+f4.type);
	}
}
