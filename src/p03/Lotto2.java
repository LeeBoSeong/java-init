package p03;

import java.util.Random;

public class Lotto2 {
	public static void main(String[] args ) {
		 int [] lotto = new int[7];
		 Random random = new Random();
		 for(int i = 0; i < lotto.length; i++) {
			 int rNum = random.nextInt(6)+1;
			 lotto[i] = rNum;
			 for(int j = 0; j < i; j++) {
				 if (lotto[j] == rNum) {
					i--;
					break;
				}
			 }
			 if(lotto[i] == 0) {
				lotto[i] = rNum;
			 }
		 }
		 for(int i = 0; i < lotto.length; i++) {
			 System.out.println("Lotto : ["+ i + "] = "+ lotto[i]);
		 }
	}

}
