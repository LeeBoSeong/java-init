package p08;

import java.util.ArrayList;

public class ListTest2 {
	public static void main(String[] args) {

		float[] fls = new float[3];
		fls[0] = 1.1f;
		fls[1] = 22.1f;
		fls[2] = 0.1111f;

		char[] charss = new char[3];
		charss[0] = 'a';
		charss[1] = 'b';
		charss[2] = 'd';

		String[] strs = new String[3];
		strs[0] = "우리";
		strs[1] = "모두";
		strs[2] = "화이팅!";

		ArrayList<Float> floats = new ArrayList<Float>();
		for(int i = 0; i< fls.length; i++) {
			floats.add(fls[i]);
		}
		

		ArrayList<Character> chars = new ArrayList<Character>();
		for(int i = 0; i< charss.length; i++) {
			chars.add(charss[i]);
		}
	

		ArrayList<String> strings = new ArrayList<String>();
		for(int i = 0; i< strs.length; i++) {
			strings.add(strs[i]);
		}
		
		for(int i = 0; i < floats.size(); i++) {
			System.out.println(floats.get(i));
		}
		for(int i = 0; i < chars.size(); i++) {
			System.out.println(chars.get(i));
		}
		for(int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}
	}
}
