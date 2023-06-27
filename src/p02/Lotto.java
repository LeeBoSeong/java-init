package p02;

import java.util.Iterator;

public class Lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
		int rNum = (int)(Math.random()*45+1);
		 lotto[i] = rNum;
		}
		 for(int i = 0; i < lotto.length; i++) {
			 System.out.println("Lotto : ["+ i + "] = " + lotto[i]);
		 }
		
	}
}
