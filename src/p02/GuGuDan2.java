package p02;

import java.util.Iterator;
import java.util.Scanner;

public class GuGuDan2 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("1부터9까지 숫자입력해시오 : ");
		String snum = scanner.nextLine();
		
		int num = Integer.parseInt(snum);
		
		for(int i = 1; i<10; i++) {
			System.out.println(i + "X" + num + "=" + i*num);
		}
	}
}
