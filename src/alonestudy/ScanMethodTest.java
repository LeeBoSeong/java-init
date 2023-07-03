package alonestudy;

import java.util.Scanner;


public class ScanMethodTest {

	public static void InPutScannerAndPrint(String pname) {
		Scanner scan = new Scanner(System.in);
		String pname1 = scan.nextLine();
		System.out.println("입력하신 이름은 : " + pname1);
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("이름을 입력해 주세요 : ");
		InPutScannerAndPrint("");
		
		
		
	}
	
}
