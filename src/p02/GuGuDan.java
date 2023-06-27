package p02;

import java.util.Iterator;
import java.util.Scanner;

public class GuGuDan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.print("1~9 까지 숫자 입력: ");
			String numStr = scanner.nextLine();
			System.out.println("입력한 숫자: "+ numStr);
			int num = Integer.parseInt(numStr);
			
			for(int i = 1; i < 10; i++) {
				System.out.println(num + "X" + i + "=" + num*i);
			}
	}
}
