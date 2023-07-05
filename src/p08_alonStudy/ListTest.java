package p08_alonStudy;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {

		ArrayList<String> strs = new ArrayList<String>();
		strs.add("안녕");
		strs.add("내 이름은 ");
		strs.add("이보성이야 ");
		strs.add("나이는 24임");

		System.out.println(strs.get(0));
		System.out.println(strs.get(1));
		System.out.println(strs.get(2));
		System.out.println(strs.get(3));
		
		System.out.println(strs.indexOf("d"));
		System.out.println(strs.indexOf("4"));//찾을 수 없는 값을 넣으면 인덱스값(자리 번호)가 -1로 
		

		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < 4 ; i++) {
			nums.add(i+1);
			System.out.println(nums.get(i));
		}

	}
}
