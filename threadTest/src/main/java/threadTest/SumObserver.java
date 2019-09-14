package threadTest;

public class SumObserver implements ResultListener<Integer>{

	
	String taskId;
	public SumObserver(String taskId) {
		
		this.taskId =taskId;
	}
	public void notifyResult(Integer result) {
		// TODO Auto-generated method stub
		System.out.println("result for taskid" + taskId + "=" + result);
	}

}
