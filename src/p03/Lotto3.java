package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto3 {
	public static void main(String[] args) {
		int[] lotto = new int[6]; //로또 방 만들었고
		Random random = new Random();
		
		
		System.out.println("1부터 45까지 숫자 6개를 입력하세요 : " );
		Scanner scnner = new Scanner(System.in);
		String lotto1 = scnner.nextLine();
		String[] str = lotto1.split(",");
		int[] str1 = new int[6];
		for(int i = 0; i < str1.length; i++) {
			str1[i] = Integer.parseInt(str[i]);
		}
			
		for(int i = 0; i < lotto.length; i++) {
			int rNum = random.nextInt(45)+1; // 랜덤으로 로또 숫자 만들었고
			lotto[i] = rNum;
			}
		
			int cnt = 0;
			for(int i = 0; i < str.length; i++) {
				for(int j = 0; j < lotto.length; j++) {
					if(str1[i] == lotto[j]) {
						cnt++;
					}
				}
			}
			System.out.println(cnt+"개 ");
		}
	}


//쪽지 시험 범위임
