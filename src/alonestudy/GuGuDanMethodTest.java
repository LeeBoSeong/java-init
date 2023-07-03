package alonestudy;

import java.util.Scanner;

public class GuGuDanMethodTest {
	
	public static void GuGudanPrint(int number) {
		for(int i = 1; i <= number; i++) {
			System.out.println("");
			for(int j =1; j < 10; j++) {
				System.out.println(i+" X "+j+" = "+ i*j);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 한개 입력하세요! : " );
		int number1 = scanner.nextInt();
		GuGudanPrint(number1);
	}
}
