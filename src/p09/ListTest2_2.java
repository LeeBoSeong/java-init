package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2_2 {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();

		Random random = new Random();
		while (numList.size() < 20) {
			int rNum = random.nextInt(100) + 1;
			if (numList.indexOf(rNum) == -1) {
				numList.add(rNum);
			}
		}
		System.out.println(numList);

		for (int i = 0; i < numList.size(); i++) {
			int num = numList.get(i);
			int mod = num % 10; //나머지가
			int qou = num / 10; 
			if(mod == 3 || mod == 6 || mod == 9 || qou == 3 || qou == 6 || qou == 9) {//1의 자리와 10의자리가 "짝"일때
				if((mod == 3 || mod == 6 || mod == 9 ) && (qou == 3 || qou == 6 || qou == 9)) {//짝짝이 나오기 위해
					System.out.println(num + ": 짝짝");
				}
				System.out.println(num + ": 짝");
			}else {
				System.out.println(num);
			}
		}
	}
}
