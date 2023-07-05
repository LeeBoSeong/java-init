package p08;

public class RemoconExec {
	//인터페이스는 생성자가 없어 메모리를 생성 할 수 없음 예를 들면 Romte r = new Romete(); 이거 안됌
	public static void main(String[] args) {
//		AirConRemocon ar = new AirConRemocon();
//		TVRemocon tv = new TVRemocon();
//		
//		Remote r1 = ar;
//		Remote r2 = tv;
		
//		Remote[] remotes = new Remote[2];
//		remotes[0]	= r1;
//		remotes[1]	= r2;
		
		
		Remote[] remotes = new Remote[2];
		remotes[0]	= new AirConRemocon();
		remotes[1]	= new TVRemocon();
		
		for(int i = 0; i < remotes.length; i++) {
			remotes[i].on();
			if(remotes[i] instanceof AirConRemocon) {
				AirConRemocon air = (AirConRemocon)remotes[i];
				air.tempDonw();
				air.tempUp();
			}else if(remotes[i] instanceof TVRemocon) {
				TVRemocon tv = (TVRemocon)remotes[i];
				tv.chDown();
				tv.chUp();
			}
			remotes[i].off();
		}
	}
}
