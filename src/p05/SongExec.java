package p05;

import java.util.Iterator;

public class SongExec {

	
	public static void main(String[] args) {
		Song[] songss = new Song[5];
		
		songss[0] = new Song();
		songss[0].name = "Omg";
		songss[0].singer = "NewJeans";
		songss[0].rank = 3;
		
		songss[1] = new Song();
		songss[1].name = "asdasd";
		songss[1].singer = "qe";
		songss[1].rank = 4;
		
		songss[2] = new Song();
		songss[2].name = "dssfs";
		songss[2].singer = "zxc";
		songss[2].rank = 2;
		
		songss[3] = new Song();
		songss[3].name = "dfgsf";
		songss[3].singer = "Ndgss";
		songss[3].rank = 1;
		
		songss[4] = new Song();
		songss[4].name = "hj";
		songss[4].singer = "nddfg";
		songss[4].rank = 5;
		
		Song fsong = songss[0];
		Song lsong = songss[0];
		
		for(int i = 1; i < songss.length; i++) {
			if(fsong.rank > songss[i].rank) {
				//max = songss[i].rank;
				fsong = songss[i];
			}
			if (lsong.rank < songss[i].rank) {
				//min = songss[i].rank;
				lsong = songss[i];
			}
		}
		
		System.out.println("꼴등 가수 이름: "+ fsong.singer + ", 꼴등 노래 이름: " + fsong.name);
		System.out.println("일등 가수 이름: "+ lsong.singer + ", 일등 노래 이름: " + lsong.name);
		
		
		
		
		
		
		
		int max = songss[0].rank;
		int min = songss[0].rank;
		int maxidx = 0;
		int minidx = 0;
		for(int i = 1; i < songss.length; i++) {
			if(max < songss[i].rank) {
				//max = songss[i].rank;
				maxidx = i;
			}
			if (min > songss[i].rank) {
				//min = songss[i].rank;
				minidx = i;
			}
		}
		
		System.out.println("꼴등 가수 이름: "+ songss[maxidx].singer + ", 꼴등 노래 이름: " + songss[maxidx].name);
		System.out.println("일등 가수 이름: "+ songss[minidx].singer + ", 일등 노래 이름: " + songss[minidx].name);
		
		
		
	
	}
}
