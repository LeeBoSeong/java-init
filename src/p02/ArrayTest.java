package p02;

public class ArrayTest {
	
	public static void main(String[]args) {
//		String[] strs;
//		String[] strs2 = new String[2];
//		System.out.println(strs2[0]);
//		System.out.println(strs2[1]);
//		
		String[] strNumStrings = new String[10];
		//0번째 방에 1이 들어가고 1번째 방에는 2 
		
		for(int i = 0; i <10; i++) {
			String num = i+1+"";
			strNumStrings[i] = num;
			System.out.println(strNumStrings[i]);
			
		}
	}
}
