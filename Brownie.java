package Midterm;

public class Brownie implements BakedGoods {
	
	int price = 1;
	String description = "This is a brownie.";
	String sellByDate = "Nov 3";
	
	public int getPrice() {
		return price;
	}
	public String getDescription() {
		return description;
	}
	public String getSellByDate() {
		return sellByDate;
	}
}
