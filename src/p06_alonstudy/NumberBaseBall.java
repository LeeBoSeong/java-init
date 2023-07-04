package p06_alonstudy;

import java.util.Random;
import java.util.Scanner;

import javax.lang.model.element.NestingKind;

public class NumberBaseBall {
	public static void main(String[] args) {
		
		Random random = new Random();
		int [] balls = new int[4];
		
		for(int i = 0; i < balls.length; i++) {
			balls[i] = random.nextInt(10); 
			int tmp = i;
			for(int j = 0; j < i; j++) {
				if (balls[i] == balls[j]) {
					i--;
					break;
				}
			}
			if(tmp==i) {
				System.out.print(balls[i]+" ");
			}
		}
		
		
	
		boolean check = true;
		while (check) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 0~9까지 쉼표를 넣어서 4개 입력해 주세요 : ");
			String myNum = scanner.nextLine();
			String[] myNumbers = myNum.split(",");
			
			int[] myBalls = new int[myNumbers.length];
			for(int i = 0; i < myBalls.length; i++) {
				myBalls[i] = Integer.parseInt(myNumbers[i]);
//				System.out.print(myBalls[i]+" ");
				
			}
			
			int ball = 0;
			int strike = 0;
			for(int i = 0; i < balls.length; i++) {
				for(int j = 0; j < balls.length; j++) {
					if(balls[i] == myBalls[j]) {
						++ball;
						if(i == j) {
							++strike;
							--ball;
						}
					}
				}
			}
			if(strike != 0) {
				System.out.println(strike+"스트라이크 입니다");
			}
			
			if(ball != 0) {
				System.out.println(ball+"볼 입니다");
				System.out.println();
			}
			
			if (strike == 4) {
				System.out.println("드디어 성공!!!!");
				check = false;
			}
			
		}
			
			
	}
}
