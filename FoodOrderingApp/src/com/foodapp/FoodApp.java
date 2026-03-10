package com.foodapp;
import java.util.Scanner;
public class FoodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Customer customer =new Customer("Prachi");
		Order order =new Order();
		while(true) {
			System.out.println("\n=====Food Ordering Menu=====");
			System.out.println("1 Order Pizza");
			System.out.println("2 Order Burger");
			System.out.println("3 Show Bill");
			System.out.println("4 Exit");
			
			System.out.println("Enter Choice:");
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				FoodItem pizza=new Pizza("Cheese Pizza",250);
				order.addItem(pizza);
				break;
			case 2:
				FoodItem burger =new Burger("veg Burger",120);
				order.addItem(burger);
				break;
			case 3:
				customer.displayCustomer();
				order.showBill();
				break;
			case 4:
				System.out.println("Thank You");
				System.exit(0);
			}
		}

	}

}
