package p04;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	
	public static void main(String[] args) {
		Random r = new Random();
		int rNum = r.nextInt(50)+1;
		
		Scanner scanner = new Scanner(System.in);
		
		boolean stop = true;
		while(stop) {
			
			System.out.print("1~50 : ");
			String numstr = scanner.nextLine();
			int number = Integer.parseInt(numstr);
			
			if(rNum > number) {
				System.out.println("UP!!!!!");
			}else if(rNum < number) {
				System.out.println("DOWN!!!!");
			}else {
				System.out.println("맞췃습니다!!!!!");
				stop = false;
			}
		}
	}
}
