package p04;

public class MethodTest4 {
	
	public static int[] getLotto() { //메서드 = 기능을 저장하고 사용하기 위해 
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
				int rNum = MethodTest2.getRandomNum(45);
				lotto[i] = rNum;
				for(int j = 0; j < i; j++) {
					if (lotto[j] == rNum) {
						i--;
						break;
					}
				}
				if(lotto[i] == 0) {
					lotto[i] = rNum;
				}
		}
		return lotto;
	}
	
	public static void printLotto(int[] lotto1) {
		 for(int i = 0; i < lotto1.length; i++){
			 System.out.println("Lotto : ["+ i + "] = "+ lotto1[i]);
		 }
	}
	
	public static void main(String[] args) {
		int[] lotto = getLotto();
		printLotto(lotto);
		
	}
}
