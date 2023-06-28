package p02;

import java.math.MathContext;
import java.util.Iterator;
import java.util.Random;

public class LottoTest {
	public static void main(String[] args ) {
		
		int[] Lotto = new int[6];
		for(int i = 0; i < Lotto.length; i++) {
			Random ran = new Random();
			int r = ran.nextInt(45)+1;
			Lotto[i] = r;
			
			System.out.println("Lotto : ["+ i + "] = "+ Lotto[i]);
		}
	}
}
