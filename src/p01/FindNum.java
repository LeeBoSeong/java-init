package p01;

import java.util.Random;
import java.util.Scanner;

public class FindNum {
	
	public static void main(String[] args) {
		Random r = new Random();
		int rNum = r.nextInt(3) +1;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 1; i<=3; i++) {
			System.out.print("맞출 숫자 입력: ");
			int num = scan.nextInt();
			
			if(rNum == num) {
				System.out.println("정답!!!!!!!!!!");
			}else {
				System.out.println("떙!!!!!!!!!!!!");
			}
		}
	}
}
