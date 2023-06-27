package p01;

public class StringTest {
	public static void main(String[] args) {
		String str = "1234567890";
		char c = str.charAt(0);
		System.out.println(c);
		
		String s1 = "1";
		
		int idx = str.indexOf("3");
		System.out.println(idx);
		
		str = str.replace("1", "one");
		System.out.println(str);
		
		String name = "leeboseong";
		name = name.toUpperCase();
		System.out.println(name);
	}
}
