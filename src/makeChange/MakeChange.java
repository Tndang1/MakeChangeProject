package makeChange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Hello, welcome to Dang mart!");
		System.out.print("Please enter your item cost! (xx.xx): ");
		double cost = kb.nextDouble();
		System.out.print("Please enter how much money you are paying with! (xx.xx): ");
		double payment = kb.nextDouble();
		if (cost == payment) {
			System.out.println("Exact change? Well thank you!");
		} else if (cost > payment) {
			System.out.println("It's not enough! I even let you say how much it cost and how much you'd pay!");
		} else if (cost < 0 || payment < 0){
			System.out.println("I'm sorry, we aren't into negativity here.");
			payment = 0;
			cost = 0;
		} else {
			System.out.print("Amount: " + cost + ", Tendered: " + payment + " Result: ");
		}
		
		int due = ((int) ((payment * 100) - (cost * 100)));
		
		for(int i = 0; i < 8; i++) {
			int currency = 0;
			switch(i) {
			case 0:
				currency = 2000;
				break;
			case 1:
				currency = 1000;
				break;
			case 2:
				currency = 500;
				break;
			case 3:
				currency = 100;
				break;
			case 4:
				currency = 25;
				break;
			case 5:
				currency = 10;
				break;
			case 6:
				currency = 5;
				break;
			case 7:
				currency = 1;
			}
			due = counter(due, currency);
		}
		kb.close();
	}

	public static int counter(int due, int currency) {
		String bill = "";
		switch(currency) {
		case 2000:
			bill = "twenty";
			break;
		case 1000:
			bill = "ten";
			break;
		case 500:
			bill = "five";
			break;
		case 100:
			bill = "one";
			break;
		}

		int count = due / currency;
		if (count > 0) {
			if (currency >= 100) {
				System.out.print(count + " " + bill + " dollar bill");
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
			System.out.println(".");
		}

	}

}
