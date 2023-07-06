package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ListTest2 {
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

		String[] strs = new String[numList.size()];

		for (int i = 0; i < numList.size(); i++) {
//			String numStr = numList.get(i) + "";
			String numStr = numList.get(i).toString();//numList가 Integer형이기 때문에 .toString()이 가능 int형은 .toString()안댐
			numStr = numStr.replace("3", "짝");
			numStr = numStr.replace("6", "짝");
			numStr = numStr.replace("9", "짝");
			System.out.println(numList.get(i) + " : " + numStr);
			
		
//			if (strs[i].contains("3") || strs[i].contains("6") || strs[i].contains("9")) {
//				System.out.println("짝");
//			} else {
//				System.out.println(strs[i]);
//			}

		}
	}
}
