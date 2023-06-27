package p01;

import java.util.Scanner;

public class DataType2 {
	
	public static void main(String[]args) {
		String str = "1234";
		System.out.println(str.length());
		System.out.println(str.substring(1));
		System.out.println(str.substring(1,3));
		int index = str.indexOf("3");
		System.out.println("3의 index 는 " + index);
		
		Scanner scan = new Scanner(System.in);
	}
}
