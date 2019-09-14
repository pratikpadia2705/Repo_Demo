package returnFromExecutor;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ReturningValueFromExecutor {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("main thread starts");

		LoopTaskG task1 = new LoopTaskG();
		LoopTaskG task2 = new LoopTaskG();
		
		LoopTaskG task3 = new LoopTaskG();
		LoopTaskG task4 = new LoopTaskG();
		
		Thread t1 = new Thread(task1, "mythread1");
		t1.start();
		Thread t2= new Thread(task2, "mythread2");
		t2.start();
		Thread t3= new Thread(task3, "mythread3");
		t3.start();
		Thread t4= new Thread(task4, "mythread4");
		t4.start();
		
		TimeUnit.MILLISECONDS.sleep((long) (Math.random()*3000));

		t1.interrupt();
		t2.interrupt();
		t3.interrupt();
		t4.interrupt();
		
		
//		ExecutorService execService = Executors.newCachedThreadPool();
//		Future<Integer>f1 = execService.submit(new CalculationTaskA(4, 2, 100)); //callable task
//		Future<Integer>f2 = execService.submit(new CalculationTaskA(4, 8, 100)); //callable task

//		CompletionService <Integer>tasks = new ExecutorCompletionService<Integer>(execService);
//		tasks.submit(new CalculationTaskA(2, 2, 100));
//		tasks.submit(new CalculationTaskA(4, 2, 100));
//		tasks.submit(new CalculationTaskA(6, 2, 100));
		
//		execService.shutdown();
//		for(int i =0;i<4;i++) {
//			
//			try {
//				TimeUnit.MILLISECONDS.sleep(600);
//
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 
//			System.out.println("f1 task" + f1.isDone());
//			System.out.println("f2 task" + f2.isDone());
//		}
		
		System.out.println("main thread ends");
		
		
	}
	
	
}
