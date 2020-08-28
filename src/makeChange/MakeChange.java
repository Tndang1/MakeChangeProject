package makeChange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		System.out.println("Hello, welcome to Dang mart!");
		System.out.println("Please enter your item cost!");
		
		double cost = kb.nextDouble();
		
		System.out.println("Please enter how much money you are paying with! (xx.xx)");
		
		double payment = kb.nextDouble();
		int due = (int) ((payment - cost) * 100);
		
		System.out.print("Amount: $" + cost + ", Tendered: $" + payment + " Total due: $");
		System.out.print((double) due /100 + ", Result: ");

		while (due > 0) {
			if (due / 2000 > 0) {
				System.out.print((due / 2000) + " $20 bills, ");
				due = due % 2000;
				continue;
			} else if (due / 1000 > 0) {
				System.out.print((due / 1000) + " $10 bills, ");
				due = due % 1000;
			} else if (due / 1000 > 0) {
				System.out.print((due / 500) + " $5 bills, ");
				due = due % 500;
			} else if (due / 100 > 0) {
				System.out.print((due / 100) + " $1 bills, ");
				due = due % 100;
			} else if (due / 25 > 0) {
				System.out.print((due / 25) + " quarters, ");
				due = due % 25;
			} else if (due / 10 > 0) {
				System.out.print((due / 10) + " dimes, ");
				due = due % 10;
			} else if (due / 5 > 0) {
				System.out.print((due / 5) + " nickels, ");
				due = due % 5;
			} else if (due / 1 > 0) {
				System.out.print((due / 1) + " pennies");
				due = due % 1;
			}

		}
		kb.close();

	}
}
