package threadTest;

public class ValueReturningTaskA implements Runnable{
	
	private int a;
	private int b;
	private long sleeptime;
	private int sum;
	private volatile boolean done = false;

	public ValueReturningTaskA(int a, int b, long sleeptime) {
		super();
		this.a = a;
		this.b = b;
		this.sleeptime = sleeptime;
		
	}




	public void run() {
	sum = a + b;
	System.out.println("run method done");
	done = true;
		
	synchronized(this) {
		
		this.notifyAll();
	}
	}
	
	public int getSum() {
		
		if(!done) {
			synchronized(this) {
				try {
					System.out.println("calling thread is waiting");
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return sum;
		
	}

}
