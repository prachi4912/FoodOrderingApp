package com.foodapp;
import java.util.ArrayList;
public class Order {
	private ArrayList<FoodItem>items=new ArrayList<>();
	public void addItem(FoodItem item) {
		items.add(item);
		item.prepare();
		
	}
	public void showBill() {
		double total=0;
		System.out.println("\n......order Details.....");
		for(FoodItem f:items) {
			f.display();
			total =total + f.getPrice();
			
		}
		System.out.println("Total Bill:"+ total);
	}
	

}
