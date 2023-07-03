package alonestudy;

import java.awt.FocusTraversalPolicy;
import java.util.Random;
import java.util.Scanner;

public class Lotto4 {
	public static void main(String[] args) {
		
		System.out.println("1~45중에 숫자 6개를 입력하세요 : " );
		Scanner scanner = new Scanner(System.in);
		String scan = scanner.nextLine();
		String[] num = scan.split(",");
		int[] myNum = new int[6];
		for(int i = 0; i < myNum.length; i++) {
			myNum[i] = Integer.parseInt(num[i]);
		}
		
		int[] lotto = new int[6];
		Random random = new Random();
		
		
		for(int i = 0; i < lotto.length; i++) {
			int ranNum = random.nextInt(45)+1;
			lotto[i] = ranNum;
			System.out.println("로또 번호는!: "+ lotto[i]);
		}
		
		int checkNum = 0;
		for(int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < myNum.length; j++) {
				if(lotto[i] == myNum[j]) {
					checkNum++;
				}
			}
		}
		System.out.println("맞춘 갯수: " + checkNum);
		
	}
}
