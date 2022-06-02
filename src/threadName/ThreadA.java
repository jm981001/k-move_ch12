package threadName;

public class ThreadA extends Thread {	
	public ThreadA() {
		setName("ThreadA"); //스레드 이름 설정
	}
	
	public void run() {		//스레드 실행 내용
		for(int i=0; i<2; i++) {		
			System.out.println(getName() + "가 출력한 내용");//스레드 이름 얻기
		}
	}
	
}

