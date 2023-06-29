package p04;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown2 {

	public static int getNumber() {
		Random r = new Random();
		int rNum = r.nextInt(50)+1;
		
		return rNum;
	}
		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean stop = true;
		while(stop) {
			
			System.out.print("1~50 : ");
			String numstr = scanner.nextLine();
			int number = Integer.parseInt(numstr);
			
			if(getNumber() > number) {
				System.out.println("UP!!!!!");
			}else if(getNumber() < number) {
				System.out.println("DOWN!!!!");
			}else {
				System.out.println("맞췃습니다!!!!!");
				stop = false;
			}
		}
	}
}

