package Midterm;

public class Worker {
	private int workerID;
	
	public Worker(int i) {
		this.workerID = i;
	}
	
	public String notify(WorkItem item) {
		if (item.getItemID() == workerID) {
			String processMessage = ("Worker " + workerID + " processed WorkItem " + item.getItemID() + " message " + item.getMessage());
			return processMessage;
		}
		else {
			return null;
		}
	}
	
	public int getWorkerID() {
		return workerID;
	}
}
