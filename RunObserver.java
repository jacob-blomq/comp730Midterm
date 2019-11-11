package Midterm;

public class RunObserver {
	public static void main(String[] args) {
		WorkManager workManager = new WorkManager();
		
		Worker worker1 = new Worker(1);
		Worker worker2 = new Worker(2);
		Worker worker3 = new Worker(3);
		Worker worker4 = new Worker(4);
		
		WorkItem workItem1 = new WorkItem("This is WorkItem 1", 1);
		WorkItem workItem2 = new WorkItem("This is WorkItem 2", 3);
		WorkItem workItem3 = new WorkItem("This is WorkItem 3", 5);
		
		workManager.addWorker(worker1);
		workManager.addWorker(worker2);
		workManager.addWorker(worker3);
		workManager.addWorker(worker4);
		
		workManager.notify(workItem1);
		workManager.notify(workItem2);
		workManager.notify(workItem3);

	}
}
