package returnFromExecutor;

import java.util.concurrent.Callable;

public class CalculationTaskA implements Callable<Integer> {
	private int a;
	private int b;
	private long sleeptime;
	
	
	
	
	public CalculationTaskA(int a, int b, long sleeptime) {
		super();
		this.a = a;
		this.b = b;
		this.sleeptime = sleeptime;
	}




	public Integer call() throws Exception {
		Integer sum = a+b;
		System.out.println("sum is :" +sum);
				return sum;
	}



	
}
