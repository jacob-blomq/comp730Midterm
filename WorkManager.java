package Midterm;
import java.util.ArrayList;
import java.util.List;

public class WorkManager {
	private List<Worker> workers = new ArrayList<Worker>();
	private List<Worker> unworkers = new ArrayList<Worker>();
	
	public void addWorker(Worker worker) {
		if (unworkers.contains(worker)) {
			unworkers.remove(worker);
		}
		workers.add(worker);
	}
	
	public void removeWorker(Worker worker) {
		if (workers.contains(worker)) {
			workers.remove(worker);
		}
		unworkers.add(worker);
	}
	
	public void notify(WorkItem item) {
		for (Worker worker: workers) {
			String result = worker.notify(item);
			if (result != null) {
				System.out.println(worker.getWorkerID() + ": Completed work on WorkItem " + item.getItemID());
				item.incrementID();
			}
		}
	}
}
