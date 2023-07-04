package p07;

public class OverLoading {
	
	//오버로딩 :
	public void test() {
		System.out.println("test()");
	}
	public void test(byte num) {
		System.out.println("test(byte num)");
	}
	
	public void test(short num) {
		System.out.println("test(short num)");
	}
	
	public void test(int num) {
		System.out.println("test(int num)");
	}
	
	public void test(long num) {
		System.out.println("test(long num)");
	}
	
	public void test(float fl) {
		System.out.println("test(float fl)");
	}
	
	public void test(double dou) {
		System.out.println("test(Double dou)");
	}
	
	public void test(String str) {
		System.out.println("test(String str)");
	}
	
	public void test(char ch) {
		System.out.println("test(char ch)");
	}
	
	public void test(boolean t) {
		System.out.println("test(boolean t)");
	}
	
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.test(false);
		ol.test((double)1);
	}
}
