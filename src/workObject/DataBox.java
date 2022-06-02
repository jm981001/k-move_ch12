package workObject;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if (this.data==null) { //data 필드가 null이면 소비자 스레드를 일시 정지 상태로 만듬
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsumerThread가 읽은 데이터: "+returnValue);
		data=null;//
		notify();//data 필드를 null로 만들고 생산자 스렞드를 실행 대기 상태로 만듦
		return returnValue;
	}	
	public synchronized void setData(String data) {
		if (this.data!=null) { //data 핃드가 null이 아니면 생산자 스레드를 일시 정지 상태로 만듦
			try {
					wait();
				}catch(InterruptedException e) {}
			}	
		this.data=data; //data 필드에 값을 지정하고 소비자 스레드를 실행 대기상태로 만듦
		System.out.println("ProducerThread가 생성한 데이터: " +data);
		notify();
		}
	
}
