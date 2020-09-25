package test_project;

import java.util.ArrayList;

public class Checkout {
	private int total_price ;
	public void add(int count , int price) {
		total_price+=count*price;
		//return total_price ;
	}

	public int finalPrice() {
		//return the final price 
		return total_price ;
	}

	public int findPrice(String name, ArrayList<item> items) {

		for (item I : items) {
			if (I.getName().equals(name)) {
				return I.getPrice();
			}
		}
		return 0;
	}
}
