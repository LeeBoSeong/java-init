package p05;

public class HumanExec {
	public static void main(String[] args) {
		
		Human[] humans = new Human[5];
		
		humans[0] = new Human();
		humans[0].name = "이보성";
		humans[0].money = 1;		
		
		humans[1] = new Human();
		humans[1].name = "qweq";
		humans[1].money = 4;		
		
		humans[2] = new Human();
		humans[2].name = "vvd";
		humans[2].money = 5;		
		
		humans[3] = new Human();
		humans[3].name = "이asd";
		humans[3].money = 6;
		
		humans[4] = new Human();
		humans[4].name = "ghkgh";
		humans[4].money = 3;
		
		int sum = 0;
		int avr = 0;
		Human ricHuman = humans[0];
		for(int i = 0; i < humans.length; i++) {
			sum += humans[i].money;
		}
		avr = sum / humans.length;
		for(int i = 0; i < humans.length; i++) {
			if(avr < humans[i].money) {
				ricHuman = humans[i];
				System.out.print("|평균이 넘는 사람: "+ ricHuman.name);
			}
		}
			System.out.println("|총합 : "+ sum + "|평균: " +avr);
	}
}
