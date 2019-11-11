package Midterm;


public class WorkItem {
	
	private int itemID;
	private String message;
	

	public WorkItem(String message, int i) {
		this.message = message;
		this.itemID = i;
		
	}
	
	public int getItemID() {
		return itemID;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void incrementID() {
		this.itemID++;
	}
	
}
 