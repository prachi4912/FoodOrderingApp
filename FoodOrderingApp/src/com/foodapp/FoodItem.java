package com.foodapp;

public class FoodItem {
	protected String name;
	protected double price;
	public FoodItem(String name,double price) {
		this.name=name;
		this.price=price;
	}
	public void prepare() {
	}
	public void display() {
		System.out.println(name +"-Price:"+price);
	}
		public double getPrice() {
			return price;
		}
	}


