package p04;

import java.util.Scanner;

public class Cafe {
	
	public static String getCoffe(String order, int price, int money) {//else if 안해줘도 되고 if만 해도 도ㅓㅣㅁ
		if(price > money) {
			return order +"와"+price + "입니다, 더 내야할 돈 : "+""+ (price - money);
		}else if(price < money) {
			return order +"와"+price + "입니다, 거스름 돈은 : "+""+ (money - price);
		}else {
			return order +"와"+price + "입니다";
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("돈을 내세요 : ");
		int sc = scan.nextInt();
		String coffee = getCoffe("아아",2000,sc);
		System.out.println(coffee);
	}
}
