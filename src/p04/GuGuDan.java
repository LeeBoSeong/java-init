package p04;

public class GuGuDan {
	
	public static void printGuGuDan(int num, int num2) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num2; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
	}
	
	public static void main(String[] args) {
		 printGuGuDan(4,6);
	}
}
