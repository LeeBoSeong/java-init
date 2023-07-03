package p06;

import javax.sql.rowset.JoinRowSet;

public class HumanExec {
	
	
	public static void printHumans(Human[] myhumans) {// 나이가 가장 많은 사람과 가장 적은사람, 평균 구하기, 평균과 가장 근접한 나이를 가진 사람 이름 출력
		Human max = myhumans[0];
		Human min = myhumans[0];
		
		int maxidx = 0;
		int minidx = 0;
		int sum = 0;
		for(int i = 1; i < myhumans.length; i++) {
			if(max.age < myhumans[i].age) {
				max = myhumans[i];
				maxidx = i;
			}
			
			if(min.age > myhumans[i].age) {
				min = myhumans[i];
				minidx = i;
			}
			sum += myhumans[i].age;
		}
		
		int avr = sum/myhumans.length;
		
		
		System.out.println("최고령 : "+max.name);
		System.out.println("최연소 : "+min.name);
		System.out.println("나이 평균 : " + avr);
		
	}
	
	public static void main(String[] args) {//다섯명의 사람을 만들고 각각의 이름과 나이를 다르게 초기화,다섯명 짜리 휴먼 배열 만들기
		
		Human human1 = new Human();
		human1.name = "동동이";
		human1.age = 17;
		
		Human human2 = new Human();
		human2.name = "원기";
		human2.age = 25;
		
		Human human3 = new Human();
		human3.name = "왕균";
		human3.age = 1;
		
		Human human4 = new Human();
		human4.name = "원준";
		human4.age = 75;
		
		Human human5 = new Human();
		human5.name = "명관";
		human5.age = 0;
		
		Human[] humans = new Human[5];
		humans[0] = human1;
		humans[1] = human2;
		humans[2] = human3;
		humans[3] = human4;
		humans[4] = human5;
		
		printHumans(humans);
		
		
	}
}
