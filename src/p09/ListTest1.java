package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Random random = new Random();
//		for(int i = 0; i < 6; i++) {
//			int rNum = random.nextInt(100)+1;
//			if(numList.indexOf(random) == -1) {
//				numList.add(rNum);
//			}else {
//				i--;
//			}
//		}
		
		while(numList.size() < 6) {
			int rNum = random.nextInt(100)+1;
			if(numList.indexOf(rNum) == -1) {
				numList.add(rNum);
			}
		}
		System.out.println(numList);
		
		int max = numList.get(0);
		int min = numList.get(0);
		int maxidx = 0;
		int minidx = 0;
		for(int i = 0; i < numList.size(); i++) {
				if(max < numList.get(i)) {
					max = numList.get(i);
					
				}
				if(min > numList.get(i)) {
					min = numList.get(i);
				
				}
		}
		
		System.out.println("최댓값 : "+max+" ||최소값 : "+ min);
		
//		for(int i = 0; i < numList.size(); i++) {
//			System.out.println(numList.get(i));
//		}
	}
}
