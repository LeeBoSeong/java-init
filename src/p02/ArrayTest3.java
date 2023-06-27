package p02;

import java.util.Iterator;

public class ArrayTest3 {
	public static void main(String[] args) {
		
		String[] strsStrings = new String[10];
			for(int j = 0; j < 10; j++) {
				strsStrings[j] = 10-j+"";
				System.out.println(j+"->"+strsStrings[j]);
			
		}
	}
}
