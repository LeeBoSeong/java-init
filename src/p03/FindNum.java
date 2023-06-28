package p03;

import java.util.Random;
import java.util.Scanner;

public class FindNum {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		boolean correct = false;
		Random random = new Random();
		int rNum = random.nextInt(10)+1;
		int i = 0;
		
		while(!correct) {
			i++;
			System.out.print("1부터 10까지 숫자를 입력하세요 : ");
			int inputNum = Integer.parseInt(scan.nextLine());
	
			if (inputNum == rNum) {
				correct = true;
				System.out.println(i+"번 만에 "+"정답입니다!");
			}
		}
	}
}
