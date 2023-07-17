package alonestudy;

class Pen {
	public static String solution(int n) {
		String answer = null;
		if(1<=n && n <=100) {
		answer = n+"";
		System.out.println(answer);
		}
		return answer;
	}

	public class Test extends Pen{
		public static void main(String[] args) {
			
			solution(1);
		}
	}
}
