package p04;

import java.util.Random;
import java.util.Scanner;

import javax.swing.SpinnerNumberModel;

public class RandomTest {
	
	public static String getRock() {
		Random r = new Random();
		int  rnum = r.nextInt(3);
		
		if(rnum == 0) {
			return "가위";
		}
		if(rnum == 1) {
			return "바위";
		}
		if(rnum == 2) {
			return "보";
		}
		return "";
	}
	public static void main(String[] args) {
		String rock = getRock();
		Scanner scan = new Scanner(System.in);
		System.out.println("가위 , 바위, 보 : ");
		String urRock = scan.nextLine();
		
		if(rock.equals(urRock)) {
			System.out.println("컴퓨터는 "+rock+":[ 비김!!]");
		}else if(rock.equals("가위") && urRock.equals("보")) {
			System.out.println("컴퓨터는 "+rock+": [졌습니다]");
		}else if(rock.equals("가위") && urRock.equals("바위")) {
			System.out.println("컴퓨터는 "+rock+": [이겼습니다]");
		}else if(rock.equals("바위") && urRock.equals("가위")) {
			System.out.println("컴퓨터는 "+rock+": [졌습니다]");
		}else if(rock.equals("바위") && urRock.equals("보")) {
			System.out.println("컴퓨터는 "+rock+": [이겼습니다]");
		}else if(rock.equals("보") && urRock.equals("가위")) {
			System.out.println("컴퓨터는 "+rock+": [이겼습니다]");
		}else if(rock.equals("보") && urRock.equals("바위")) {
			System.out.println("컴퓨터는 "+rock+": [졌습니다]");
		}
		
	}
}
