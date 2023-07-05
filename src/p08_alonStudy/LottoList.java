package p08_alonStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoList {
	public static void main(String[] args) {
		Random rNum = new Random();

		List<Integer> lotto = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			int ranNum = rNum.nextInt(7) + 1;
			if (lotto.indexOf(ranNum) == -1 ) {
				lotto.add(ranNum);
			}else {
				--i;
			}
		}
		for (int i = 0; i < lotto.size(); i++) {
			System.out.println(lotto.get(i));
		}
	}
}
