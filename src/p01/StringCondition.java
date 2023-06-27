package p01;

public class StringCondition {
	public static void main(String[] args) {
		
		String s1 = "123";
		String s3 = "123";
		if(s1.equals(s3)) {
			System.out.println("s1은 123");
		}else {
			System.out.println("s1은 123아님");
		}
		
		String s2 = new String("123");
		if(s2.equals( "123")) {
			System.out.println("s2은 123");
		}else {
			System.out.println("s2은 123아님");
		}
	}
}
