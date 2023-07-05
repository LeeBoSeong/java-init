package p08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoList {

	public static void main(String[] args) {
		List<Integer> lotto = new ArrayList<>();
		Random r = new Random();
		//indexOf가 포문을 돌며 자릿수를 찾음
		for (int i = 0; i < 6; i++) {
			int rNum = r.nextInt(7) + 1;
			if(lotto.indexOf(rNum) == -1) {
				lotto.add(rNum);
			}else {
				--i;
			}
		}
		for(int i = 0; i < lotto.size(); i++) {
			System.out.println(lotto.get(i));
		}
	}
}
