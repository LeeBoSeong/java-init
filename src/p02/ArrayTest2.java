package p02;

import java.util.Iterator;

public class ArrayTest2 {
	public static void main(String[] args) {
		String[] strsStrings = new String[10];
		
		for(int i = 0; i<10; i++) {
			strsStrings[i] = i*2+2+"";
			System.out.println(i+"->"+"["+strsStrings[i]+"]");
		}
		
	}

}
