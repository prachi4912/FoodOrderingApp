package com.foodapp;

public class Pizza extends FoodItem{
	public Pizza(String name,double price) {
		super(name,price);
	}
@Override
public void prepare() {
	System.out.println("Preparing Pizza...");
	
}
}
