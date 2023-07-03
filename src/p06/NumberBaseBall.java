package p06;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class NumberBaseBall {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] nums = new int[3];
		for(int i = 0; i < nums.length; i++ ) {
			nums[i] =  random.nextInt(10);
			for(int j = 0; j < i; j++) {
				if(nums[i] == nums[j]) {
					i--;
					break;
				}
			}
			
		}
		boolean check = true;
		
		int count = 0;
		while(check) {
		count++;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 , 기준으로 3개 입력: ");
		String numStr = scan.nextLine();
		String[] numStrs = numStr.split(",");
		
		int[] compNums = new int[numStrs.length];
		for(int i = 0; i< numStrs.length; i++) {
			compNums[i] = Integer.parseInt(numStrs[i]);
		}
		
	
		int ball = 0;
		int strike = 0;
		for(int i = 0; i < compNums.length; i++) {
			for(int j = 0; j < compNums.length; j++) {
				if(compNums[i] == nums[j]) {
					++ball;
					if(i == j) {
						++strike;
						--ball;
					}
				}
				
			}
		}
		
		System.out.println("스트라이크:" + strike);
		System.out.println("중복이"+ball +"개 있음");
		System.out.println();
		
		
		if(strike == 3) {
			check = false;
			System.out.println(count+"만에 정답입니다!");

			
			}
		}
	}
}
