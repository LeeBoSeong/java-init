package p02;

import java.util.Iterator;

public class GuGuDan3 {
	public static void main(String[] args) {
		
		
		for(int i = 1; i < 10; i++) {
			System.out.println();
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + (j*i));
			}
		}
	}
}
