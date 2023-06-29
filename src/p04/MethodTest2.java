package p04;

import java.util.Random;

public class MethodTest2 {
	
	public static int getRandomNum(int max) {
		Random r = new Random();
		return r.nextInt(max)+1;
	}
	public static void main(String[] args) {
		System.out.println(getRandomNum(2));
		System.out.println(getRandomNum(3));
		System.out.println(getRandomNum(3));
		System.out.println(getRandomNum(3));
	}
}
