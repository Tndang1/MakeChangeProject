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
		if (cost == payment) {
			System.out.println("Exact change? Well thank you!");
		} else if (cost > payment) {
			System.out.println("It's not enough! I even let you say how much it cost and how much you'd pay!");
		} else {
			System.out.print("Amount: $" + cost + ", Tendered: $" + payment + " Result: ");
		}

		int due = (int) ((payment - cost) * 100);
		while (due > 0) {

			due = counter(
					counter(counter(counter(counter(counter(counter(counter(due, 2000), 1000), 500), 100), 25), 10), 5),
					1);
		}
		kb.close();
	}

	public static int counter(int due, int currency) {

		int count = due / currency;
		if (count > 0) {
			if (currency >= 100) {
				System.out.print(count + " " + currency / 100 + " dollar bill");
				plural(count, due, currency);
			} else {
				switch (currency) {
				case 25:
					System.out.print((count) + " quarter");
					plural(count, due, currency);
					break;
				case 10:
					System.out.print((count) + " dime");
					plural(count, due, currency);
					break;
				case 5:
					System.out.print((count) + " nickel");
					plural(count, due, currency);
					break;
				case 1:
					System.out.print((count) + " penn");
					if (count > 1) {
						System.out.print("ies.");
					} else {
						System.out.print("y.");
					}
					break;
				}
			}

			due = due % currency;
		}
		return due;
	}

	public static void plural(int count, int due, int currency) {
		if (count > 1) {
			System.out.print("s");
		}
		if (due % currency > 0) {
			System.out.print(", ");
		} else {
			System.out.print(".");
		}

	}
}
