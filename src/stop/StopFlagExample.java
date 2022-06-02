package stop;

public class StopFlagExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintThread printThread =new PrintThread();
		printThread.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		printThread.setStop(true); //스레들을 종료시키기위해 stop 필드를 true로 변경
		
		
	}

}
