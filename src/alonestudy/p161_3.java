package alonestudy;

import java.util.Random;

public class p161_3 {
	public static void main(String[] args) {
		Random random1 = new Random();
		Random random2 = new Random();
		
		
		Boolean checkBoolean = true;
		while(checkBoolean) {
			int rNum1 = random1.nextInt(6)+1;
			int rNum2 = random2.nextInt(6)+1;
			if (rNum1+rNum2 == 5) {
				checkBoolean = false;
			}
			System.out.println(rNum1 +","+ rNum2);
		}
		
		
	}

}
//자꾸 마지막 주사위 숫자에는 합쳐서 5가되는 수가 나옴