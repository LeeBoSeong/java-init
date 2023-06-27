package p02;

import java.util.Iterator;
import java.util.Random;

public class Lotto2 {
	public static void main(String[] args) {
		int[] lottoNum = new int[6];
		for(int i = 0; i < lottoNum.length; i++) {
		Random ranNumRandom = new Random();
	
		lottoNum[i] =  ranNumRandom.nextInt(45)+1;
		
		System.out.println("Lotto : ["+i+"]" + "=" + lottoNum[i]);
		}
	}
}
