package p08;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		String str1 = "안녕,";
		String str2 = "내 소개를";
		String str3 = " 하지";
		String str4 = " 내 직업은";
		String str5 = " 개발자 입니다";
		
		String[] strs = new String[5];
		strs[0] = str1;
		strs[1] = str2;
		strs[2] = str3;
		strs[3] = str4;
		strs[4] = str5;
		
		for(int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]);
		}
		System.out.println();
		
		ArrayList<String> strList = new ArrayList<String>();//배열과 비슷하지만 크기가 늘었다 줄었다 함, 방개수 지정 안해줘도 댐
		System.out.println(strList.size());//순차적으로 뺴고 넣을떄 씀,방 개수를 size로 함, 그냥 배열은 length 
		strList.add("1");	
		System.out.println(strList.size());//<>(다이아몬드) 안에 데이터 타입이 들어감, 근데 기본형은 ex)int -> Intager로 너헝야함
		strList.add("a");	
		System.out.println(strList.size());
		strList.add("2");	
		System.out.println(strList.size());
		strList.add("가");
		System.out.println(strList.size());
		
		strList.remove(0);
		System.out.println(strList.size());
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		
	}	
}
