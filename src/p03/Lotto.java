package p03;

import java.util.Random;

import javax.security.auth.kerberos.KerberosCredMessage;

public class Lotto {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			int rNum = random.nextInt(6)+1;
			
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
		for(int i = 0; i < lotto.length; i++) {
			System.out.println("Lotto : ["+ i + "] = "+ lotto[i]);
			}
		}
	}


