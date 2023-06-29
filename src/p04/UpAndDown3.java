package p04;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown3 {
	public static int getNumber() {
		Random r = new Random();
		int rNum = r.nextInt(50)+1;
		
		return rNum;
	}
	
	public static boolean match(int num1, int num2) {
		if(num1 == num2)
			return true;
		if (num1 > num2) {
			System.out.println("up");
		}else if(num1 < num2) {
			System.out.println("down");
		}
		return false;
	}
		
	public static void main(String[] args) {
		int rNum = getNumber();
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
		while(!match(rNum, number)) {
			
			System.out.print("1~50 : ");
			String numstr = scanner.nextLine();
			number = Integer.parseInt(numstr);
			}
				System.out.println("맞췃습니다!!!!!");
				
			}
	}

