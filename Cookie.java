package Midterm;

public class Cookie implements BakedGoods {
	
	int price = 2;
	String description = "This is a cookie.";
	String sellByDate = "Nov 1";
	
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
