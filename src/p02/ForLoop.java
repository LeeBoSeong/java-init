package p02;

import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ForLoop {
	public static void main(String[] args) {
		
		for(int i = 1; i <10; i++) {
			System.out.println(1 + "X" + i + "="+ i);
		}
		
		System.out.println();
		for(int j = 1; j <10; j++) {
			System.out.println(j + "X" + 1 + "="+ j);
		}
		
		System.out.println();
		for(int m = 9; m > 0; m--) {
			System.out.println(m + "X" + 1 + "=" + m);
		}
	}
}
