package com.foodapp;
//test commit
public class Burger extends FoodItem {
	public Burger(String name,double price) {
		super(name,price);
	}
	@Override
	public void prepare() {
		System.out.println("Preparing Burger....");
	}

}
