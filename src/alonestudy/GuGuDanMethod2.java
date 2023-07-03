package alonestudy;


import java.util.Scanner;

public class GuGuDanMethod2 {
	
	public static int GuGudan(int number) {
		
		for(int i = 1; i <= number; i++) {
			System.out.println("");
			for(int j = 1; j < 10; j++) {
				System.out.println(i+" X "+j+" = "+ i*j);		
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 한개만 입력해 주세요");
		int scan = scanner.nextInt();
		
		GuGudan(scan);
	}
}
