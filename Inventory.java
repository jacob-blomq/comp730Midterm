package Midterm;

import java.util.ArrayList;

public class Inventory {
	ArrayList<InventoryItem> items = new ArrayList<InventoryItem>();
	int weight;
	
	public Inventory() {
		weight = 0;
		items = new ArrayList<InventoryItem>();
	}
	
	public ArrayList<InventoryItem> addItemToInventory(InventoryItem i) {
		if (weight + i.getWeight() > 250) {
			return items;
		}
		else {
			weight += i.getWeight();
			items.add(i);
			return items;
		}
	}
	
	public boolean dropInventoryItem(InventoryItem i) {
		if (items.contains(i)) {
			items.remove(i);
			return true;
		}
		return false;
	}
	
	public int getWeight() {
		return weight; 
	}
	
	public int getCount() {
		return items.size(); 
	}
	
	public String toString() {
		String ret = "Your inventory has:\n";
		for (InventoryItem i : items) {
			ret = i.toString();
		}
		return ret;
	}
}