package vehicle;

import java.util.*;
import java.util.Calendar;
import java.util.Date;

public class Cruise {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date twoHoursFromNow = Calendar.getInstance().getTime();
		
		int totalPassenger, response, maxWeight = 600, age = 0, counter = 0;
		int[][] noOfPassenger = new int [3][3];
		int[][] table = {{101, 102, 103, 104, 105}, {201, 202, 203, 204, 205}, {301, 302, 303, 304, 305}};
		
		double[] oriIngredientSetCA = {0.4, 0.125, 0.14, 0.03, 0.3, 0.25, 0.025, 0.3, 1};
		double[] oriIngredientSetCB = {0.4, 0.245, 0.19, 0.04, 0.4, 0.3, 0.03, 0.4, 1.1};
		double[] oriIngredientSetCC = {0.4, 0.3, 0.275, 0.05, 0.5, 0.35, 0.035, 0.5, 1.2};
		double[] oriIngredientSetWA = {0.4, 0.225, 0.2, 0.04, 0.45, 0.325, 0.04, 0.4, 1};
		double[] oriIngredientSetWB = {0.4, 0.295, 0.25, 0.05, 0.5, 0.345, 0.05, 0.5, 1.1};
		double[] oriIngredientSetWC = {0.4, 0.35, 0.325, 0.06, 0.55, 0.4, 0.06, 0.6, 1.2};
		double[] oriIngredientB = {16, 14.5, 15, 22, 25, 18, 24, 2, 50};
		double[][] price = {{88, 128, 168}, {108, 148, 188}, {100, 20}};
		double[] totalC = new double [3];
		double[] totalW = new double [3];
		double charge = 0, tax = 0, chargeRate = 0.02, taxRate = 0.06, exceedCharge, overleft;
		
		String[][] names = {{"Mr. ", "Mrs. ", "Ms. "}, {"Edward", "Lewis", "Jordan"}};
		String roomNo, ticketNo, outfit;
		
		boolean access = true;
		boolean print = false;
		boolean move = false;
	
		System.out.println("Going to Background Management System...");
		
		System.out.println("\nLIBERTY CRUISE INGREDIENTS ALLOCATION");
		System.out.println("-----------------------------------------");
		showWeight(maxWeight);
		
		System.out.print("\nTotal passengers on Liberty Cruise : ");
		totalPassenger = input.nextInt();
		
		if (totalPassenger <= 42) {
			System.out.println("Going to next...");
		} else {
			System.out.println("\nSorry! Maximum passengers on broad are only 42 person.");
			System.exit(0);
		}
		
		System.out.println("\n------CHINESE CUISINE INGREDIENTS------");
		
		System.out.println("\nEnter the total kilograms for all ingredients");
		for (int i = 0; i < 3; i++) {
			System.out.printf("\nTotal kilograms for Set %d ingredients : %.2f kg", (i + 1), sumIngredientC(i, totalC, oriIngredientSetCA, oriIngredientSetCB, oriIngredientSetCC));
		}
		showMax(totalC, print, totalPassenger);
		
		System.out.println("\n\n------WESTERN FOOD INGREDIENTS------");
		
		System.out.println("\nEnter the total kilograms for all ingredients");
		for (int j = 0; j < 3; j++) {
			System.out.printf("\nTotal kilograms for Set %d ingredients : %.2f kg", (j + 1), sumIngredientW(j, totalW, oriIngredientSetWA, oriIngredientSetWB, oriIngredientSetWC));
		}
		showMax(totalW, print, totalPassenger);
		
		System.out.println("\n\n------BUFFET INGREDIENTS------");
		
		System.out.println("\nEnter the total kilograms for all ingredients");
		double totIngredientB = sumIngredientB(oriIngredientB, totalPassenger);
		
		System.out.println("\n\n...........................................");
		double totMass = showMax(totalC, print = true, totalPassenger) + showMax(totalW, print = true, totalPassenger) + totIngredientB;
		System.out.printf("Total mass of final ingredients : %.2f kg ", totMass);
		
		showSuccess(totalPassenger, totMass);
		System.out.println("...........................................");
		System.out.println();
		
		System.out.println("Going to Main Order System...");
		
		System.out.println("\nWELCOME TO LIBERTY CRUISE");
		System.out.println("-------------------------");
		
		System.out.print("Please insert your name : ");;
		System.out.println(names[0][0] + names[1][0]);
		
		System.out.print("Please enter your room number : ");
		roomNo = input.next();
		
		do {
			System.out.print("Please enter your cruise ticket number (10 numbers) : ");
			ticketNo = input.next();
			
			if (isValidTicket(ticketNo)) {
				System.out.println("Checking...Please wait");
				System.out.println("Register successfully");
				
				System.out.print("\nOutfit of today (formal / flexible) : ");
				outfit = input.next();
				access = showOutfit(outfit);
				
				do {
					displayMenu();
					response = input.nextInt();
					move = showOrder(noOfPassenger, (response - 1), age);
				} while (move);
					
				showTable(table);
				System.out.println("\n...............................................");
				System.out.print("Actual Quit Time : ");
				Date twoHoursTwentyMinFromNow = showOutDate(false);
				long exceedMin = ((twoHoursTwentyMinFromNow.getTime() - twoHoursFromNow.getTime()) / (60 * 1000) - 120);
				exceedCharge = (exceedMin / 10) * 3;
				showExceedCharge(twoHoursFromNow, twoHoursTwentyMinFromNow, exceedMin, exceedCharge);
				System.out.println("...............................................");
				double total[] = showPrice(price, noOfPassenger, exceedCharge);
				System.out.print("\nOverleft Food for Buffet (gram) : " );
				overleft = input.nextDouble();
				double[] dis = showDiscount(price, total, tax, charge, twoHoursFromNow, twoHoursTwentyMinFromNow, exceedCharge, overleft);
				double discount = dis[0];
				double cashPayment = dis[1];
				showReceipt(names, ticketNo, roomNo, price, noOfPassenger, total, discount, chargeRate, taxRate, cashPayment, exceedCharge, overleft);
				showAllIngredient(totalPassenger, noOfPassenger, oriIngredientSetCA, oriIngredientSetCB, oriIngredientSetCC, oriIngredientSetWA, oriIngredientSetWB, oriIngredientSetWC, oriIngredientB);
				showRating();
			} else {
				counter = counter + 1;
				System.out.println("Right Here!!! Number of Count : " + counter);	
				System.out.println("Invalid cruise ticket ID");
				
				if (counter >= 3) {
					access = false;
					System.out.println("Access Failed...");
					System.out.println("3 tries exceeded! You are not allowed to enter the order system.");
					System.exit(0);
				}
				 System.out.println();
			 }	    	
		} while (access == true);
	}

	public static void showWeight(int maxWeight) {
		System.out.println("Maximum mass of ingredients needed for passenger");
		System.out.println("Kindly Reminder!!!");
		System.out.println("Maximum weight for the ingredients acceptable to brought on board are " + maxWeight + " kg.");
		System.out.println("Mass which are most heavy for each package are used in prediction.");
	}
	
	public static double sumIngredientC(int i, double[] total, double[] oriIngredientSetCA, double[] oriIngredientSetCB, double[] oriIngredientSetCC) {
		switch(i) 
		{
		case 0 :
			for (int k = 0; k < oriIngredientSetCA.length; k++) {
				total[i] += oriIngredientSetCA[k];
			}
			return total[i];
		case 1 :
			for (int k = 0; k < oriIngredientSetCB.length; k++) {
				total[i] += oriIngredientSetCB[k];
			}
			return total[i];
		case 2 :
			for (int k = 0; k < oriIngredientSetCC.length; k++) {
				total[i] += oriIngredientSetCC[k];
			}
			return total[i];
		}
		return total[i];
	}
	
	public static double sumIngredientW(int j, double[] total, double[] oriIngredientSetWA, double[] oriIngredientSetWB, double[] oriIngredientSetWC) {
		switch(j) 
		{
		case 0 :
			for (int i = 0; i < oriIngredientSetWA.length; i++) {
				total[j] += oriIngredientSetWA[i];
			}
			return total[j];
		case 1 :
			for (int i = 0; i < oriIngredientSetWB.length; i++) {
				total[j] += oriIngredientSetWB[i];
			}
			return total[j];
		case 2 :
			for (int i = 0; i < oriIngredientSetWC.length; i++) {
				total[j] += oriIngredientSetWC[i];
			}
			return total[j];
		}
		return total[j];
	}
	
	public static double showMax(double[] total, boolean print, int totalPassenger) {
		double max = total[0];
		int j = 0;
		for (int i = 1; i < total.length; i++) {
			if (max < total[i]) {
				max = total[i];
				j = i;
			}
		}
		if (print) {
		} else {
			System.out.printf("\nSuggested set to predict total kilograms is : Set %d > %.2f kg ", (j + 1), max);
			System.out.print("\nTotal kilograms for Set " + (j + 1) + " ingredients needed by " + totalPassenger + " passenger : ");
			System.out.printf("%.2f kg", (max * totalPassenger));	
		}
		return (max * totalPassenger);	
	}
	
	public static double sumIngredientB(double[] oriIngredientB, int totalPassenger) {
		double sumB = 0;
		for (int i = 0; i < oriIngredientB.length; i++) {
			sumB = sumB + oriIngredientB[i];
		}
		System.out.print("\nTotal kilograms for ingredients needed by " + totalPassenger + " passenger : ");
		System.out.printf("%.2f kg", sumB);
		return sumB;
	}
	
	public static boolean showSuccess(int totalPassenger, double totMass) {
		if (totMass <= 600) {
			System.out.println("\nThe menu setting is accepted.");
		} else {
			System.out.println("\nThe menu setting is rejected. The total mass has already exceed the weight that can afford by the cruise. You are suggested to change your menu.");
		}
		return false;
	}
	
	public static final int TICKET_LENGTH = 10;
	
	public static boolean isValidTicket(String ticketNo) {
		if (ticketNo.length() < TICKET_LENGTH) 
			return false;
		
		int numCount = 0;
		for (int i = 0; i < ticketNo.length(); i++) {
			char ch = ticketNo.charAt(i);
			if (isNumeric(ch)) numCount++;
			else return false;
		}
		return (numCount == 10);
	}
	
	public static boolean isNumeric(char ch) {
		return (ch >= '0' && ch <= '9');
	}
	
	public static boolean showOutfit(String outfit) {
		if (outfit.equalsIgnoreCase("formal")) {
			System.out.println("You are available to enjoy all 3 packages.");
			System.out.println("Chinese Cuisine, Western Food and Buffet are served today.");
			System.out.println("Please fill in the form below to select your choice.");
		} else if (outfit.equalsIgnoreCase("flexible")) {
    		System.out.println("Sorry! You are not allow to enter the restaurant as your outfit is not appropriate.");
    		System.exit(0);
    	} else {
    		System.out.println("Invalid outfit");
    		System.exit(0);
    	}
		return false;
	}
	
    public static void displayMenu() {
    	System.out.println("\n***************************************");
		System.out.println("Which package would you like to choose?");
		System.out.println("1 Chinese Cuisine");
		System.out.println("2 Western Food");
		System.out.println("3 Buffet");
		System.out.println("***************************************\n");
		System.out.print("Enter any number according to your choice : ");
    }
	
    public static void showMenuChineseCuisine() {
    	System.out.println("\n------MENU FOR CHINESE CUISINE------");
    	String[] setCA = {"Rice", "Steamed Seabass with Spicy Sauce", "Lemon Chicken", "Tepanyaki Tofu", "Stir Fried Vegetables with Belacan", "Seaweed Soup", "Chilled Longan"};
        System.out.println("\nSet 1");
        for (int i = 0; i < setCA.length; i++) {
        	System.out.println("(" + (i+1) + ")" + " " + setCA[i]);
        }
        
        String[] setCB = {"Rice", "Steamed Fish with Nyonya Sauce", "Cereal Butter Prawn", "Mango Chicken", "Braised Mapo Tofu in Szechuan", "Stir Fried Kailan with Salted Fish", "Sea Cucumber Soup", "Chilled Lychee"};
        System.out.println("\nSet 2");
        for (int i = 0; i < setCB.length; i++) {
        	System.out.println("(" + (i+1) + ")" + " " + setCB[i]);
        }
        
        String[] setCC = {"Rice", "Chinese Style Beef with Sesame and Coriander", "Steamed Chicken with Ginseng", "Peking Duck", "Boston Lobster", "Claypot Seafood Beancurd", "Braised Broccoli with Crabstick", "Fish Maw Soup", "Chilled Sea Coconut"};
        System.out.println("\nSet 3");
        for (int i = 0; i < setCC.length; i++) {
        	System.out.println("(" + (i+1) + ")" + " " + setCC[i]);
        }
    }
    
    public static void showMenuWesternFood() {
    	System.out.println("\n------MENU FOR WESTERN FOOD------");
    	String[] setWA = {"Tomato Rice", "Stir Fried Sotong with Green Pepper", "Baked Hawaiian Chicken", "Brocolli & Cauliflower", "Mushroom Soup", "Sparkling Water", "Fresh Fruit"};
    	System.out.println("\nSet 1");
        for (int i = 0; i < setWA.length; i++) {
            System.out.println("(" + (i+1) + ")" + " " + setWA[i]);
        }
        
        String[] setWB = {"Apple Salad", "Garlic Butter Rice", "Salted Prawn with Celery", "Stewed Chicken with Chef’s Sauce", "Spicy Egg Plant", "Clam Chowder Soup", "Mini Cream Puff", "Orange Juice"};
        System.out.println("\nSet 2");
        for (int i = 0; i < setWB.length; i++) {
        	System.out.println("(" + (i+1) + ")" + " " + setWB[i]);
        }
        
        String[] setWC = {"Pasta Salad", "Mushroom Rice", "Salmon Fish", "BBQ Chicken", "Stir Fry Mixed Vegetables with Seafood", "Pepperoni Pizza", "Minestorone Soup", "Tiramisu Crepe Cake Sliced", "Mango Juice"};
        System.out.println("\nSet 3");
        for (int i = 0; i < setWC.length; i++) {
        	System.out.println("(" + (i+1) + ")" + " " + setWC[i]);
        }
    }
    
    public static void showMenuBuffet() {
    	System.out.println("\n------MENU FOR BUFFET------");
 		String[] setBuffet = {"Salad", "Rice", "Main Dishes", "BBQ Station", "Side Dishes", "Soup", "Beverages", "Fruits", "Dessert"};
 		System.out.println("\nBuffet includes");
 		for (int i = 0; i < setBuffet.length; i++) {
 			System.out.println("(" + (i+1) + ")" + " " + setBuffet[i]);
         }
 		System.out.print("\n***The requirement for children package is the age need to be smaller than 6 years old.***\n");
    }
    
    public static boolean showOrder(int[][] noOfPassenger, int response, int age) {    	
    	char value = 'y';
		String decision = null;
		int numC, numW;
    	switch (response) 
    	{
    	case 0:
    		showMenuChineseCuisine();
    		System.out.print("\nEnter any choice of Chinese Cuisine\n");
    		for (int j = 0; j < noOfPassenger[response].length; j++) {
        		System.out.print("Total Set " + (j + 1) + " you wish to order : ");
        		numC = input.nextInt();
        		noOfPassenger[response][j] += numC;
    		}
    		break;
    	case 1:
    		showMenuWesternFood();
    		System.out.print("\nEnter any choice of Western Food\n");
    		for (int j = 0; j < noOfPassenger[response].length; j++) {
        		System.out.print("Total Set " + (j + 1) + " you wish to order : ");
        		numW = input.nextInt();
        		noOfPassenger[response][j] += numW;
    		}
    		break;
    	case 2:
    		showMenuBuffet();
    		while ((value == 'y') || (value == 'Y')) {	
				System.out.print("\nEnter your year of birth : ");
				age = input.nextInt();

				if (age <= 2014) {
					System.out.println("Order successful!");
					System.out.println("Your age is above 6 years old.");
					System.out.println("You are eligible for Adult Set.");
					noOfPassenger[response][0] += 1;
				} else if (age >= 2015) {
					System.out.println("Order successful!");
					System.out.println("Your age is below 6 years old.");
					System.out.println("You are eligible for Children Set.");
					noOfPassenger[response][1] += 1;
				} else {
					System.out.println("Invalid age");
				}
		    	System.out.println("\nDo you want to add order for buffet?");
		        System.out.print("Enter your choice Y/N : ");
		        value = input.next().charAt(0);
    		}	
    	}
    	System.out.print("\nDo you want to add on?");
		System.out.print("\nEnter your choice Y/N : ");
		decision = input.next();
		if (decision.equalsIgnoreCase("y")) {
			System.out.println("\nContinue order...");
		} else if (decision.equalsIgnoreCase("n")) {
			System.out.println("\nThank you for your order.");
		} else {
			System.out.println("\nInvalid order");
		}
    	return (decision.equalsIgnoreCase("y"));	
    }
    
    public static double[] showPrice(double[][] price, int[][] noOfPassenger, double exceedCharge) {
    	double total[] = new double[2];
    	for (int i = 0; i < price.length; i++) {
    		switch (i)
    		{
    		case 0 :
    			System.out.print("\n------PRICE OF CHINESE CUISINE------\n");
    			break;
    		case 1 :
    			System.out.print("\n-------PRICE OF WESTERN FOOD--------\n"); 
    			break;
    		case 2 : 
    			System.out.print("\n----------PRICE OF BUFFET-----------\n");
    			break;
    		} 
    		for (int j = 0; j < price[i].length; j++) {
    			if (i != 2) {
    				System.out.printf("\nPer Set %d                : RM %6.2f", (j + 1), price[i][j]);
    				System.out.printf("\nPayment For Set %d        : RM %6.2f\n", (j + 1), (price[i][j] * noOfPassenger[i][j]));
    			} else {
    				if (j == 0) {
    					System.out.printf("\nFor Each Adult           : RM %6.2f", price[i][j]);
    					System.out.printf("\nPayment For All Adult    : RM %6.2f\n", (price[i][j] * noOfPassenger[i][j]));
    				} else if (j == 1) {
    					System.out.printf("\nFor Each Children        : RM %6.2f", price[i][j]);
    					System.out.printf("\nPayment For All Children : RM %6.2f\n", (price[i][j] * noOfPassenger[i][j]));
    				} else {
    					break;
    				}
    			}
    				total[0] += (price[i][j] * noOfPassenger[i][j]);
    				total[1] += noOfPassenger[i][j];
    		}
    	}
    	System.out.println("\n....................................");
    	System.out.printf("Total set order : %.0f set", total[1]);
		
    	System.out.printf("\nTotal amount that need to pay : RM %.2f", total[0]);
    	return total;
    }
    
	public static double[] showDiscount(double[][] price, double[] total, double tax, double charge, Date twoHoursFromNow, Date twoHoursTwentyMinFromNow, double exceedCharge, double overleft) {
		String freeGift;
		double discountRate5 = 0.05, discountRate8 = 0.08, chargeRate = 0.02, taxRate = 0.06, subtotal, cashPayment, sub;
		double[] dis = new double[2];
		
    	double overleftCharge = (overleft / 100) * 6;
    	System.out.printf("Overleft Charge for Buffet : RM %.2f", overleftCharge);
    	
    	charge = (total[0] * chargeRate);
		System.out.printf("\nService Charge : RM %.2f", charge);
		
		tax = (total[0] * taxRate);
		System.out.printf("\nSales and Service Tax (SST) : RM %.2f", tax);
		
		if (total[1] >= 1 && total[1] <= 2) {
			freeGift = "                                     No Free Gift";
			System.out.printf("Discount Received : RM %.2f ", dis[0]);
			subtotal = total[0] - dis[0] + charge + tax + exceedCharge + overleftCharge;
			System.out.print("\nSubtotal with No Discount Received, 2% Service Charge, 6% SST, Overtime and Overleft Charge : ");
			System.out.printf("RM %.2f ", subtotal);
		} else if (total[1] >= 3 && total[1] <= 6) {
			freeGift = "     Remember to withdraw 2 Gymnasium Ticket as a free gift with this receipt.";
			dis[0] = discountRate5 * total[0];
			System.out.printf("\nDiscount Received : RM %.2f ", dis[0]);
			subtotal = total[0] - dis[0] + charge + tax + exceedCharge + overleftCharge;
			System.out.print("\nSubtotal with 5% Discount Received, 2% Service Charge, 6% SST, Overtime and Overleft Charge : ");
			System.out.printf("RM %.2f ", subtotal);
		} else {
			freeGift = " Remember to withdraw 4 Magic Performance Ticket as a free gift with this receipt.";
			dis[0] = discountRate8 * total[0];
			System.out.printf("\nDiscount Received : RM %.2f ", dis[0]);
			subtotal = total[0] - dis[0] + charge + tax + exceedCharge + overleftCharge;
			System.out.print("\nSubtotal with 8% Discount Received, 2% Service Charge, 6% SST, Overtime and Overleft Charge : ");
			System.out.printf("RM %.2f ", subtotal);
		}
		System.out.print("\nTotal cash pay : RM ");
		cashPayment = input.nextDouble();
		
		sub = cashPayment - subtotal;
		System.out.printf("Changes : RM %.2f ", sub);
		
		System.out.println("\n\nProcessing...");
		System.out.println("Your receipt are shown below : \n");
		
		dis[1] = cashPayment;
		return dis;
    }
    
    public static void showLuckyDraw() {
    	final int n = 2;
    	int[] randomArray;
    	randomArray = createRandom(n);
    	System.out.print("\t\t\tYour two lucky number is ");
    	for (int i = 0; i < randomArray.length; i++) {
    		System.out.print(randomArray[i] + " ");
    	}
    	System.out.println("\n\t\tPlease stay on tonight for the lucky draw number.");
    }
    
    public static int[] createRandom(int n) {
    	int[] randomArray = new int[n];
    	for (int i = 0; i < randomArray.length; i++) {
    		randomArray[i] = (int)(Math.random() * 10000);
    	}
    	return randomArray;
    }
    
    public static void showDate(boolean date) {
    	Calendar currentTimeNow = Calendar.getInstance();
    	if (date) {
    		System.out.print(currentTimeNow.getTime());
    	} else { 
    		currentTimeNow.add(Calendar.MINUTE, 120);
    		Date twoHoursFromNow = currentTimeNow.getTime();
    		System.out.print(twoHoursFromNow);
    	}
    } 
    
    public static Date showOutDate(boolean outDate) {
    	Calendar currentTimeNow = Calendar.getInstance();
    	Date twoHoursTwentyMinFromNow = null;
    	if (outDate) {
    		System.out.print(currentTimeNow.getTime());
    	} else { 
    		currentTimeNow.add(Calendar.MINUTE, 140);
    		twoHoursTwentyMinFromNow = currentTimeNow.getTime();
    		System.out.print(twoHoursTwentyMinFromNow);
    	}
    	return twoHoursTwentyMinFromNow;
    } 
    
    public static void showExceedCharge(Date twoHoursFromNow, Date twoHoursTwentyMinFromNow, double exceedMin, double exceedCharge) {
    	System.out.print("\nExceed Time     : " + exceedMin + " minutes");
    	System.out.printf("\nExceed Charge   : RM %.2f\n", exceedCharge);
    }
    
    public static void displayLine(boolean line) {
    	if (line) {
    		System.out.println("-----------------------------------------------------------------------------------");
    	} else {
    		System.out.println("***********************************************************************************");
    	}
    } 
    
    public static void showTable(int[][] table) {
    	System.out.println();
    	displayLine(true);
    	for (int j = 0; j < table.length; j++) {
    		System.out.print("Table No. : " + (table[0][0] + table[1][3]) + "                    LIBERTY CRUISE\n\n");
    		break;
    	}
    	System.out.print("Time In : ");
		showDate(true);
		System.out.print("    Time Out : ");
		showDate(false);
		System.out.println("\n\n                                      Conditions                           " );
		System.out.println("\n1. For Buffet leftover food, you will be charge at the rate of RM 6 per 100 gram." );
		System.out.println("2. Time limit to 2 hours for all packages." );
		System.out.println("3. Time over charge : RM 3 per 10 minutes." );
		System.out.println("4. WiFi password is ilovelibertycruise6688." );
		displayLine(true);
		showLuckyDraw();
		displayLine(true);
    }
    
    public static void showReceipt(String[][] names, String ticketNo, String roomNo, double[][] price, int[][] noOfPassenger, double[] total, double discount, double chargeRate, double taxRate, double cashPayment, double exceedCharge, double overleft) {
		System.out.println("                                   LIBERTY CRUISE                         ");
		System.out.println("                                  PAYMENT RECEIPTS                         ");
		displayLine(true);
		System.out.println("User        : " + names[0][0] + names[1][0]);
		System.out.println("Ticket No.  : " + ticketNo);
		System.out.println("Room No.    : " + roomNo);
		System.out.print("Date        : ");
		showOutDate(false);
		System.out.println();
		displayLine(true);
		System.out.printf("%-10s %-20s %-15s %-25s %-15s\n", "No", "Item Name", "Unit", "Price Per Unit", "Cost(RM)");
		displayLine(true);
		for (int j = 0; j < noOfPassenger.length; j++) {
			switch(j) 
			{
			case 0 :
				System.out.printf("%-10s %s %n", "a", "Chinese Cuisine");
				break;
			case 1 :
				System.out.printf("%-10s %s %n", "b", "Western Food");
				break;
			case 2 :
				System.out.printf("%-10s %s %n", "c", "Buffet");
				break;
			}
			for (int i = 0; i < noOfPassenger[j].length; i++) {
				if (j != 2) {
					System.out.printf("%d) %7s Set %s %18d %22.2f %22.2f\n", (i + 1),"", (i + 1), noOfPassenger[j][i], price[j][i], (noOfPassenger[j][i] * price[j][i]));
				} else {
					if(i == 0) {
						System.out.printf("%d) %7s %4s %18d %22.2f %22.2f\n", (i + 1),"", "Adult", noOfPassenger[j][i], price[j][i], (noOfPassenger[j][i] * price[j][i]));
					} else if (i == 1) {
						System.out.printf("%d) %7s %s %15d %22.2f %22.2f\n", (i + 1),"", "Children", noOfPassenger[j][i], price[j][i], (noOfPassenger[j][i] * price[j][i]));
					} else {
						break;
					}
				}
			}
			if (j != 2) {
				System.out.println();
			}
		}
		displayLine(true);
		System.out.printf("Amount				: %47.2f\n", total[0]);
		displayLine(true);
		System.out.printf("Discount Received		: %47.2f\n", discount);
		displayLine(true);
		System.out.print("Service Charge (2%)		: ");
		System.out.printf("%47.2f\n", (total[0] * chargeRate));
		displayLine(true);
		System.out.print("SST (6%)			: ");
		System.out.printf("%47.2f\n", (total[0] * taxRate));
		displayLine(true);
		System.out.printf("Overtime Charge			: %47.2f\n", exceedCharge);
		displayLine(true);
		double overleftCharge = (overleft / 100) * 6;
    	System.out.printf("Overleft Charge (Buffet) 	: %47.2f\n", overleftCharge);
    	displayLine(true);
		double subtotal = (total[0] + (total[0] * (chargeRate + taxRate)) + exceedCharge + overleftCharge - discount);
		System.out.printf("Subtotal			: %47.2f\n", subtotal);
		displayLine(true);
		System.out.printf("Cash				: %47.2f\n", cashPayment);
		displayLine(true);
		System.out.printf("Balance				: %47.2f\n", (cashPayment - subtotal));
		displayLine(false);
		if (discount == 0) {
			System.out.println("                                     No Free Gift");
		} else if (total[0] * 0.05 == discount) {
			System.out.println("     Remember to withdraw 2 Gymnasium Ticket as a free gift with this receipt.");
		} else {
			System.out.println(" Remember to withdraw 4 Magic Performance Ticket as a free gift with this receipt.");
		}
		displayLine(false);
		System.out.println("                                THANK YOU COME AGAIN                     ");
		displayLine(false);
    }
    
    public static void showAllIngredient(int totalPassenger, int[][] noOfPassenger, double[] oriIngredientSetCA, double[] oriIngredientSetCB, double[] oriIngredientSetCC, double[] oriIngredientSetWA, double[] oriIngredientSetWB, double[] oriIngredientSetWC, double[] oriIngredientB) {
		double totRemaining = 0;
		System.out.println("\nGoing Back to Background Management System...");
		System.out.println("\nThe remaining ingredients are shown below : ");
		System.out.println();
		System.out.println("                                   LIBERTY CRUISE                      ");
		System.out.println("                             RESIDUAL INGREDIENTS COUNT                ");
		displayLine(true);
		System.out.println("Ingredients                ");
		displayLine(true);
		System.out.println("No          Item Name                 Kilograms               ");
		displayLine(true);
		for (int i = 0; i < 9; i++) {
			double used = 0, unused = 0;
			switch(i) 
			{
			case 0 :
				unused = ((oriIngredientSetCC[i] + oriIngredientSetWC[i]) * totalPassenger) + oriIngredientB[i];
				used = (oriIngredientSetCA[i] * noOfPassenger[0][0]) + (oriIngredientSetCB[i] * noOfPassenger[0][1]) + (oriIngredientSetCC[i] * noOfPassenger[0][2]) + (oriIngredientSetWA[i] * noOfPassenger[1][0]) + (oriIngredientSetWB[i] * noOfPassenger[1][1]) + (oriIngredientSetWC[i] * noOfPassenger[1][2]) + oriIngredientB[i];
				totRemaining += (unused - used);
				System.out.printf("%-12dRice %50.2f\n", (i + 1) ,(unused));
				System.out.printf("%-12sUsed Rice %45.2f\n", "", (used));
				System.out.printf("%-12sRemaining Rice %40.2f\n", "", (unused - used));
				displayLine(true);
				break;
			case 1 :
				unused = ((oriIngredientSetCC[i] + oriIngredientSetWC[i]) * totalPassenger) + oriIngredientB[i];
				used = (oriIngredientSetCA[i] * noOfPassenger[0][0]) + (oriIngredientSetCB[i] * noOfPassenger[0][1]) + (oriIngredientSetCC[i] * noOfPassenger[0][2]) + (oriIngredientSetWA[i] * noOfPassenger[1][0]) + (oriIngredientSetWB[i] * noOfPassenger[1][1]) + (oriIngredientSetWC[i] * noOfPassenger[1][2]) + oriIngredientB[i];
				totRemaining += (unused - used);
				System.out.printf("%-12dMeat %50.2f\n", (i + 1) ,(unused));
				System.out.printf("%-12sUsed Meat %45.2f\n", "", (used));
				System.out.printf("%-12sRemaining Meat %40.2f\n", "", (unused - used));
				displayLine(true);
				break;
			case 2 :
				unused = ((oriIngredientSetCC[i] + oriIngredientSetWC[i]) * totalPassenger) + oriIngredientB[i];
				used = (oriIngredientSetCA[i] * noOfPassenger[0][0]) + (oriIngredientSetCB[i] * noOfPassenger[0][1]) + (oriIngredientSetCC[i] * noOfPassenger[0][2]) + (oriIngredientSetWA[i] * noOfPassenger[1][0]) + (oriIngredientSetWB[i] * noOfPassenger[1][1]) + (oriIngredientSetWC[i] * noOfPassenger[1][2]) + oriIngredientB[i];
				totRemaining += (unused - used);
				System.out.printf("%-12dSeafood %47.2f\n", (i + 1) ,(unused));
				System.out.printf("%-12sUsed Seafood %42.2f\n", "", (used));
				System.out.printf("%-12sRemaining Seafood %37.2f\n", "", (unused - used));
				displayLine(true);
				break;
			case 3 :
				unused = ((oriIngredientSetCC[i] + oriIngredientSetWC[i]) * totalPassenger) + oriIngredientB[i];
				used = (oriIngredientSetCA[i] * noOfPassenger[0][0]) + (oriIngredientSetCB[i] * noOfPassenger[0][1]) + (oriIngredientSetCC[i] * noOfPassenger[0][2]) + (oriIngredientSetWA[i] * noOfPassenger[1][0]) + (oriIngredientSetWB[i] * noOfPassenger[1][1]) + (oriIngredientSetWC[i] * noOfPassenger[1][2]) + oriIngredientB[i];
				totRemaining += (unused - used);
				System.out.printf("%-12dEgg %51.2f\n", (i + 1) ,(unused));
				System.out.printf("%-12sUsed Egg %46.2f\n", "", (used));
				System.out.printf("%-12sRemaining Egg %41.2f\n", "", (unused - used));
				displayLine(true); 
				break;
			case 4 :
				unused = ((oriIngredientSetCC[i] + oriIngredientSetWC[i]) * totalPassenger) + oriIngredientB[i];
				used = (oriIngredientSetCA[i] * noOfPassenger[0][0]) + (oriIngredientSetCB[i] * noOfPassenger[0][1]) + (oriIngredientSetCC[i] * noOfPassenger[0][2]) + (oriIngredientSetWA[i] * noOfPassenger[1][0]) + (oriIngredientSetWB[i] * noOfPassenger[1][1]) + (oriIngredientSetWC[i] * noOfPassenger[1][2]) + oriIngredientB[i];
				totRemaining += (unused - used);
				System.out.printf("%-12dVegetables %44.2f\n", (i + 1) ,(unused));
				System.out.printf("%-12sUsed Vegetables %39.2f\n", "", (used));
				System.out.printf("%-12sRemaining Vegetables %34.2f\n", "", (unused - used));
				displayLine(true);
				break;
			case 5 :
				unused = ((oriIngredientSetCC[i] + oriIngredientSetWC[i]) * totalPassenger) + oriIngredientB[i];
				used = (oriIngredientSetCA[i] * noOfPassenger[0][0]) + (oriIngredientSetCB[i] * noOfPassenger[0][1]) + (oriIngredientSetCC[i] * noOfPassenger[0][2]) + (oriIngredientSetWA[i] * noOfPassenger[1][0]) + (oriIngredientSetWB[i] * noOfPassenger[1][1]) + (oriIngredientSetWC[i] * noOfPassenger[1][2]) + oriIngredientB[i];
				totRemaining += (unused - used);
				System.out.printf("%-12dFruits %48.2f\n", (i + 1) ,(unused));
				System.out.printf("%-12sUsed Fruits %43.2f\n", "", (used));
				System.out.printf("%-12sRemaining Fruits %38.2f\n", "", (unused - used));
				displayLine(true);
				break;
			case 6 :
				unused = ((oriIngredientSetCC[i] + oriIngredientSetWC[i]) * totalPassenger) + oriIngredientB[i];
				used = (oriIngredientSetCA[i] * noOfPassenger[0][0]) + (oriIngredientSetCB[i] * noOfPassenger[0][1]) + (oriIngredientSetCC[i] * noOfPassenger[0][2]) + (oriIngredientSetWA[i] * noOfPassenger[1][0]) + (oriIngredientSetWB[i] * noOfPassenger[1][1]) + (oriIngredientSetWC[i] * noOfPassenger[1][2]) + oriIngredientB[i];
				totRemaining += (unused - used);
				System.out.printf("%-12dOil %51.2f\n", (i + 1) ,(unused));
				System.out.printf("%-12sUsed Oil %46.2f\n", "", (used));
				System.out.printf("%-12sRemaining Oil %41.2f\n", "", (unused - used));
				displayLine(true);
				break;
			case 7 :
				unused = ((oriIngredientSetCC[i] + oriIngredientSetWC[i]) * totalPassenger) + oriIngredientB[i];
				used = (oriIngredientSetCA[i] * noOfPassenger[0][0]) + (oriIngredientSetCB[i] * noOfPassenger[0][1]) + (oriIngredientSetCC[i] * noOfPassenger[0][2]) + (oriIngredientSetWA[i] * noOfPassenger[1][0]) + (oriIngredientSetWB[i] * noOfPassenger[1][1]) + (oriIngredientSetWC[i] * noOfPassenger[1][2]) + oriIngredientB[i];
				System.out.printf("%-12dFlour %49.2f\n", (i + 1) ,(unused));
				System.out.printf("%-12sUsed Flour %44.2f\n", "", (used));
				System.out.printf("%-12sRemaining Flour %39.2f\n", "", (unused - used));
				displayLine(true);
				break;
			case 8 :
				unused = ((oriIngredientSetCC[i] + oriIngredientSetWC[i]) * totalPassenger) + oriIngredientB[i];
				used = (oriIngredientSetCA[i] * noOfPassenger[0][0]) + (oriIngredientSetCB[i] * noOfPassenger[0][1]) + (oriIngredientSetCC[i] * noOfPassenger[0][2]) + (oriIngredientSetWA[i] * noOfPassenger[1][0]) + (oriIngredientSetWB[i] * noOfPassenger[1][1]) + (oriIngredientSetWC[i] * noOfPassenger[1][2]) + oriIngredientB[i];
				System.out.printf("%-12dWater %49.2f\n", (i + 1) ,(unused));
				System.out.printf("%-12sUsed Water %44.2f\n", "", (used));
				System.out.printf("%-12sRemaining Water %39.2f\n", "", (unused - used));
				displayLine(true);
				break;
			default :
				break;
			}
		}
		System.out.printf("TOTAL   : %57.2f\n", totRemaining);
		displayLine(true);
		System.out.println();
		System.out.println("..........................................................................");
		System.out.printf("Remaining ingredients in the kitchen : %.2f kg", totRemaining);
		System.out.println("\n***The ingredients of Buffet already finished during the preparation.***");
		System.out.println("..........................................................................");
    }
    
    public static void showRating() {
    	System.out.println("\nRATING FROM PASSENGERS");
		System.out.println("-----------------------");
    	System.out.println("[Please respond to the question below, where 1 represents 'Extremely Poor' and 5 represents 'Extremely Positive']");
    	System.out.println("How was your dining experience at Liberty Cruise today?");
    	System.out.print("Rating (1 - 5) : ");
    	int rate = input.nextInt();
    	System.out.println();
    	if (rate == 1) {
     		System.out.println("Very Bad  ಠ▃ಠ");   
    	} else if (rate == 2) {
    		System.out.println("Poor  ￣へ￣");
    	} else if (rate == 3) {
    		System.out.println("Normal  ´･_･`");
    	} else if (rate == 4) {
    		System.out.println("Good  ・∀・");
    	} else {
    		System.out.println("Excellent  ٩(^ᴗ^)۶");
    	}
    	System.out.println();
    	System.out.println("Thank you for your rating.");
    	System.out.println("Here is a free hand sanitizer for you.");
    	System.out.println("Hope you have an enjoyable journey on Liberty Cruise.");
	}

}
