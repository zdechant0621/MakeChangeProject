package MakeChange;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double price;
		double cashIn;
		double cashOut;
		int Twenties = 0;
		int Tens = 0;
		int Fives = 0;
		int Ones = 0;
		int Quarters = 0;
		int Dimes = 0;
		int Nickels = 0;
		int Pennies = 0;

		System.out.print("Please enter the price of the item: $");
		price = sc.nextDouble();
		System.out.print("Please enter the amount tendered by the customer: $");
		cashIn = sc.nextDouble();
		cashOut = cashIn - price;
		sc.close();
		if (price > cashIn) {
			System.out.println("Price of item exceeds amount tendered. Please ask the customer for more money.");
		}
		if (cashIn == price) {
			System.out.println("No change due. Relay to the customer no change is due and to have a nice day!");
		} 
		if (price < cashIn){
			System.out.printf("The change is $%.2f\n", cashOut);
			System.out.println("Please hand the customer the following:");
		}

		if (cashOut / 20 >= 1) { //changed from >=0, was telling user "0 Twenties" otherwise
			Twenties = (int) cashOut / 20;
			cashOut = cashOut % 20;
			System.out.println(Twenties + " Twenty(s)");
		}
		if (cashOut / 10 >= 1) {
			Tens = (int) cashOut / 10;
			cashOut = cashOut % 10;
			System.out.println(Tens + " Ten(s)");
		}
		if (cashOut / 5 >= 1) {
			Fives = (int) cashOut / 5;
			cashOut = cashOut % 5;
			System.out.println(Fives + " Five(s)");
		}
		if (cashOut / 1 >= 1) {
			Ones = (int) cashOut / 1;
			cashOut = cashOut % 1;
			System.out.println(Ones + " One(s)");
		}
		if (cashOut / .25 >= 1) {
			Quarters = (int) (cashOut / 0.25);
			cashOut = cashOut % 0.25;
			System.out.println(Quarters + " Quarter(s)");
		}
		if (cashOut / 0.10 >= 1) {
			Dimes = (int) (cashOut / 0.10);
			cashOut = cashOut % 0.10;
			System.out.println(Dimes + " Dime(s)");
		}
		if (cashOut / 0.05 >= 1) {
			Nickels = (int) (cashOut / 0.05);
			cashOut = cashOut % 0.05;
			System.out.println(Nickels + " Nickels");
		}
		if (cashOut / 0.01 >= 1) {
			cashOut += 0.004; //adding this here solved issue of cashIn=price.
			Pennies = (int)(cashOut / 0.01);
			cashOut = cashOut % 0.01;
			System.out.println(Pennies + " Penny(s)");
		}
	}

}
