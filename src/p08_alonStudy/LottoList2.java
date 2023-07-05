package p08_alonStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LottoList2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1부터 10까지 숫자 다섯개를 입력하세요 : ");
		String strNum = scanner.nextLine();
		String[] slicNum = strNum.split(",");

		List<Integer> intNums = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			intNums.add(Integer.parseInt(slicNum[i]));
			System.out.println("내 번호 : " + intNums.get(i));
		}

		Random random = new Random();
		List<Integer> lottos = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			int lottoNum = random.nextInt(10) + 1;
			if (lottos.indexOf(lottoNum) == -1) {
				lottos.add(lottoNum);
			} else {
				--i;
			}
		}
		for (int i = 0; i < lottos.size(); i++) {
			System.out.println("로또 번호는 : " + lottos.get(i));
		}

		int check = 0;
		for (int i = 0; i < lottos.size(); i++) {
			for (int j = 0; j < intNums.size(); j++) {
				if (lottos.get(i) == intNums.get(j)) {
					check++;
				}
			}
		}
		System.out.println("맞춘 갯수 : " + check);

	}

}
