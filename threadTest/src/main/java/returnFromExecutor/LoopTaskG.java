package returnFromExecutor;

import java.util.concurrent.TimeUnit;

public class LoopTaskG implements Runnable {
	
	private boolean sleepInterupted = false;

	public void run() {
		// TODO Auto-generated method stub
		
		String currentthreadname = Thread.currentThread().getName();
		
		for(int i = 0;;i++) {
			System.out.println("currentthreadname " + currentthreadname + "   tick" + i);
			try {
				TimeUnit.MILLISECONDS.sleep((long) (Math.random()*3000));

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				sleepInterupted = true;
				break;
			} 
			doSomeMoreWork();
			
		}
		
	}
	
	public void doSomeMoreWork() {
		
		System.out.println("inside dosome morework");
	}

}
