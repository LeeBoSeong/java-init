package p04;

import java.util.Scanner;

public class GuGuDan2 {

	
	public static void printGuGuDan(int num, int num2) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num2; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 두개를 입력 하세요: " );
		int scan = scanner.nextInt();
		int scan2 = scanner.nextInt();
		 printGuGuDan(scan,scan2);
	}
}
