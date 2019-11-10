package Midterm;

import java.util.ArrayList;

public class ExamQ3Interface {
	public static void main(String[] args) {
		ArrayList<BakedGoods> bakedGoodsList = new ArrayList<BakedGoods>();
		
		BakedGoods c = new Cookie();
		BakedGoods cr = new CinnamonRoll();
		BakedGoods b = new Brownie();
		
		bakedGoodsList.add(c);
		bakedGoodsList.add(cr);
		bakedGoodsList.add(b);
		
		for (BakedGoods n: bakedGoodsList) {
			System.out.println(n.getPrice() + " " + n.getDescription() + " " + n.getSellByDate());
		}

	}
}
