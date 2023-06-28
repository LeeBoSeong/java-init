package p03;

import java.util.Iterator;

public class ThreeSixNine {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++){
			String str = i + "";
			int num = i % 5;
			if(num == 0) {
				System.out.println("만세, ");
			
			}else if(str.contains("3") || str.contains("6") || str.contains("9")) {
				System.out.println("짝, ");
		
			}else {
				System.out.println(i +",");
			}
		}
	}
}
