package alonestudy;

import java.util.Random;

public class Test23 {
	public static void main(String[] args) {
		int[] randomNums = new int[5];
		Random r = new Random();
		for (int i = 0; i < randomNums.length; i++) {
			int rNum = r.nextInt(5);
			randomNums[i] = rNum;
			for (int j = 0; j < i; j++) {
				if (randomNums[j] == rNum) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < randomNums.length; i++) {
			System.out.println(randomNums[i]);
		}
	}
}
