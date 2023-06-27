package p01;

import java.util.Random;

public class RandomTest {
	
	public static void main(String[] args) {
		Random r = new Random();
		int i = r.nextInt(10);//0~9까지 
		System.out.println(i);
		int i1 = r.nextInt(10);
		System.out.println(i1);
		int i2 = r.nextInt(10); 
		System.out.println(i2);
		
		int[] lotto = new int[3];
		
		lotto[0] = i;
		lotto[1] = i1;
		lotto[2] = i2;
		int b;
		for(b = 0; b<3; b++) {
			System.out.print(lotto[b]);
		}
		
	}
}
