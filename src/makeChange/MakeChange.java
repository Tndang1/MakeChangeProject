package makeChange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		System.out.println("Hello, welcome to Dang mart!");
		System.out.println("Please enter your item cost! (xx.xx)");
		
		double cost = kb.nextDouble();
		
		System.out.println("Please enter how much money you are paying with! (xx.xx)");
		
		double payment = kb.nextDouble();
		
		if(cost == payment) {
			System.out.println("Exact change? Well thank you!");
		} else if (cost > payment) {
			System.out.println("It's not enough! I even let you say how much it cost and how much you'd pay!");
		} else {
			System.out.print("Amount: $" + cost + ", Tendered: $" + payment + " Result: ");			
		}
		
		int due = (int) ((payment - cost) * 100);
		

		while (due > 0) {
			if (due / 2000 > 0) {
				System.out.print((due / 2000) + " $20 bill");
				plural((due/2000), due);
				due = due % 2000;
			} else if (due / 1000 > 0) {
				System.out.print((due / 1000) + " $10 bill");
				plural((due/1000), due);
				due = due % 1000;
			} else if (due / 1000 > 0) {
				System.out.print((due / 500) + " $5 bill");
				plural((due/500), due);
				due = due % 500;
			} else if (due / 100 > 0) {
				System.out.print((due / 100) + " $1 bill");
				plural((due/100), due);
				due = due % 100;
			} else if (due / 25 > 0) {
				System.out.print((due / 25) + " quarter");
				plural((due/25), due);
				due = due % 25;
			} else if (due / 10 > 0) {
				System.out.print((due / 10) + " dime");
				plural((due/10), due);
				due = due % 10;
			} else if (due / 5 > 0) {
				System.out.print((due / 5) + " nickel");
				plural((due/5), due);
				due = due % 5;
			} else if (due / 1 > 0) {
				System.out.print((due / 1) + " penn");
				if (due / 1 > 1) {
					System.out.print("ies.");
				} else {
					System.out.print("y.");
				}
				
				break;
			}

		}
		kb.close();

	}
	
	public static int count(int due, int denom) {
		if (due/denom > 0) {
		int numOfMoney = (due/denom);
		return numOfMoney;
		} else {
			return 0;
		}
	}
	
	public static void plural(int count, int due) {
		if (count>1) {
			System.out.print("s");
		}
		
		if  (due > 0) {
			System.out.print(", ");
		} else {
			System.out.print(".");
		}
		
		
		
		
	}
}
