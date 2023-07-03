package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto3 {
	public static void main(String[] args) {
		
	
		System.out.println("1부터 45까지 숫자 6개를 입력하세요 : " );
		Scanner scnner = new Scanner(System.in);
		String lotto1 = scnner.nextLine();
		String[] str = lotto1.split(",");//str에 내가 입력한 숫자가 들어가 있는 lotto1변수에 ","만 제거 하여 strig[] str에 넣어줌
		int[] str1 = new int[6]; //인트 배열형 str1을 하나 만듬 
		for(int i = 0; i < str1.length; i++) {
			str1[i] = Integer.parseInt(str[i]);
		}//이 for문은 내가 숫자를 넣어준 string배열 str을 형변환 하여 int 형 배열 인 str1에 넣어줌
			
		int[] lotto = new int[6]; //로또 방 만들었고
		Random random = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			int rNum = random.nextInt(45)+1; // 랜덤으로 로또 숫자 만들었고
			lotto[i] = rNum;
			System.out.println("로또 번호는!: "+ lotto[i]);
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
