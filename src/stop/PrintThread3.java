package stop;

public class PrintThread3 extends Thread {
	public void run() {
		while(true) {
			System.out.println("실행 중3");
			if(Thread.interrupted()) {
				break;
			}
	}
			System.out.println("자원 정리3");
			System.out.println("실행 종료3");
	}
}
