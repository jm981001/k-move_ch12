package stop;

public class PrintThread extends Thread {
	
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop=stop;
	}
	
	public void run() {
		while (!stop) {
			System.out.println("실행중");
		}
		System.out.println("자원 정리"); //stop이 true가 될때
		System.out.println("실행 종료");
	}
}
