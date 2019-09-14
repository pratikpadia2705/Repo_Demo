package threadTest;

public class ValueReturningTaskB implements Runnable {
	private int a;
	private int b;
	private long sleeptime;
	private int sum;
	private ResultListener<Integer>listner;
	
	public ValueReturningTaskB(int a, int b, long sleeptime,ResultListener<Integer> listner) {
		super();
		this.a = a;
		this.b = b;
		this.sleeptime = sleeptime;
		this.listner = listner;
		
	}




	public void run() {
	sum = a + b;
	System.out.println("run method done");
		
	listner.notifyResult(sum);
	}
	
	

}
