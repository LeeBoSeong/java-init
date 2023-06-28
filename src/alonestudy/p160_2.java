package alonestudy;

public class p160_2 {
	public static void main(String[]args) {
		//1부터 100까지 정수중 3의 배수 총합
		int j = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 3 == 0) {
				j += i;
			}
		}
		System.out.println(j);
	}
}
