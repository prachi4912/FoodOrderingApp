package com.foodapp;

public class Customer {
	private String customerName;
	public Customer(String customerName) {
		this.customerName = customerName;
	}
	public void displayCustomer() {
		System.out.println("Customer Name:"+customerName);
	}

}
