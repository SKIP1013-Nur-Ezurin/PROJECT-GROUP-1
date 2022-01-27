package vehicle;

import java.util.Scanner;
import java.util.Date;

public class Train {
	public static String Name = "ASYRAAF DANIAL";
	public static String depSt,destSt;
	public static String category1 = "ADULT PASSENGER", category2 = "CHILD PASSENGER", category3 = "STUDENT PASSENGER", category4 = "DISABLED PASSENGER", category5 = "SENIOR PASSENGER";
	public static String seatType1 = "NORMAL SEAT", seatType2 = "HOT SEAT", seatType3 = "CAFETERIA SEAT";
	public static double norSChild, norSStud, norSOKU, norSSenior;
	public static double hotSAdult, hotSChild, hotSStud, hotSOKU, hotSSenior;
	public static double cafeSAdult, cafeSChild, cafeSStud, cafeSOKU, cafeSSenior;
	public static double totalnorSAdult, totalnorSChild, totalnorSStud, totalnorSOKU, totalnorSSenior;
	public static double totalhotSAdult, totalhotSChild, totalhotSStud, totalhotSOKU, totalhotSSenior;
	public static double totalcafeSAdult, totalcafeSChild, totalcafeSStud, totalcafeSOKU, totalcafeSSenior;
	public static int norSAdultQuan, norSChildQuan, norSStudQuan, norSOKUQuan, norSSeniorQuan;
	public static int hotSAdultQuan, hotSChildQuan, hotSStudQuan, hotSOKUQuan, hotSSeniorQuan;
	public static int cafeSAdultQuan, cafeSChildQuan, cafeSStudQuan, cafeSOKUQuan, cafeSSeniorQuan;
	public static final int MAX_COLUMN = 4;
	public static final int MAX_ROW = 20;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double norSAdultSPKL = 64.50;
		double norSAdultPBG = 101;
		double norSAdultIAOR = 42.50;
		
		System.out.println("\n                                               Welcome to Malaysia Railways                                            ");
		System.out.println("                                                Purchasing Ticket System!                                                ");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println(" ");

		Login();
		
		System.out.println(" ");
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println(" ");
		
		showStations();
		
		if (depSt.equals("SUNGAI PETANI") && destSt.equals("KL SENTRAL"))
		{
			hotSAdult = (norSAdultSPKL * 110) / 100;
			cafeSAdult = (norSAdultSPKL * 115) / 100;
			
			norSChild = (norSAdultSPKL * 90) / 100;
			hotSChild = (hotSAdult * 90) / 100;
			cafeSChild = (cafeSAdult * 90) / 100;
			
			norSStud = (norSAdultSPKL * 80) / 100;
			hotSStud = (hotSAdult * 80) / 100;
			cafeSStud = (cafeSAdult * 80) / 100;
			
			norSOKU = (norSAdultSPKL * 60) / 100;
			hotSOKU = (hotSAdult * 60) / 100;
			cafeSOKU = (cafeSAdult * 60) / 100;
			
			norSSenior = (norSAdultSPKL * 70) / 100;
			hotSSenior = (hotSAdult * 70) / 100;
			cafeSSenior = (cafeSAdult * 70) / 100;
			
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("                    TICKET PRICE LIST FOR " + depSt + " STATION TO " + destSt + " STATION (EXCLUSIVE SST)                ");
		
			System.out.println("    ________________________________________________________________________________________________________________");
			System.out.println("    |                  |                              |          HOT SEAT           |        CAFETERIA SEAT        |");
			System.out.println("    |    CATEGORIES    |         NORMAL SEAT          |       (EXTRA LEGROOM)       |       (CAFETERIA COACH)      |");
			System.out.println("    |__________________|______________________________|_____________________________|______________________________|");
			System.out.println("    |                  |                              |                             |                              |");
			System.out.printf ("    |      ADULT"           );
			System.out.printf ("       |           RM%.2f" , norSAdultSPKL);
			System.out.printf ("            |          RM%.2f", hotSAdult );
			System.out.printf ("            |           RM%.2f", cafeSAdult );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |      CHILD"           );
			System.out.printf ("       |           RM%.2f" , norSChild);
			System.out.printf ("            |          RM%.2f", hotSChild );
			System.out.printf ("            |           RM%.2f", cafeSChild );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |     STUDENT"    );
			System.out.printf ("      |           RM%.2f" , norSStud);
			System.out.printf ("            |          RM%.2f", hotSStud );
			System.out.printf ("            |           RM%.2f", cafeSStud );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |     DISABLED"     );
			System.out.printf ("     |           RM%.2f" , norSOKU);
			System.out.printf ("            |          RM%.2f", hotSOKU );
			System.out.printf ("            |           RM%.2f", cafeSOKU );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |      SENIOR"          );
			System.out.printf ("      |           RM%.2f" , norSSenior);
			System.out.printf ("            |          RM%.2f", hotSSenior );
			System.out.printf ("            |           RM%.2f", cafeSSenior );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |__________________|______________________________|_____________________________|______________________________|" );
		
			System.out.println("");
			System.out.println("        PLEASE ENTER THE QUANTITY OF TICKETS YOU WANT TO BUY ACCORDING TO THE PASSENGER CATEGORIES AND SEAT TYPES        ");
			System.out.println("");
		
			chooseTickets();
			
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			
			totalnorSAdult = norSAdultQuan * norSAdultSPKL;
			totalhotSAdult = hotSAdultQuan * hotSAdult;
			totalcafeSAdult = cafeSAdultQuan * cafeSAdult;
			totalnorSChild = norSChildQuan * norSChild;
			totalhotSChild = hotSChildQuan * hotSChild;
			totalcafeSChild = cafeSChildQuan * cafeSChild;
			totalnorSStud = norSStudQuan * norSStud;
			totalhotSStud = hotSStudQuan * hotSStud;
			totalcafeSStud = cafeSStudQuan * cafeSStud;
			totalnorSOKU = norSOKUQuan * norSOKU;
			totalhotSOKU = hotSOKUQuan * hotSOKU;
			totalcafeSOKU = cafeSOKUQuan * cafeSOKU;
			totalnorSSenior = norSSeniorQuan * norSSenior;
			totalhotSSenior = hotSSeniorQuan * hotSSenior;
			totalcafeSSenior = cafeSSeniorQuan * cafeSSenior;
			
			displaySeatAvailable();
			
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			
			ticketConfirm();
	
		}
		
		else if (depSt.equals("PADANG BESAR") && destSt.equals("GEMAS"))
		{
			hotSAdult = (norSAdultPBG * 110) / 100;
			cafeSAdult = (norSAdultPBG * 115) / 100;
			
			norSChild = (norSAdultPBG * 90) / 100;
			hotSChild = (hotSAdult * 90) / 100;
			cafeSChild = (cafeSAdult * 90) / 100;
			
			norSStud = (norSAdultPBG * 80) / 100;
			hotSStud = (hotSAdult * 80) / 100;
			cafeSStud = (cafeSAdult * 80) / 100;
			
			norSOKU = (norSAdultPBG * 60) / 100;
			hotSOKU = (hotSAdult * 60) / 100;
			cafeSOKU = (cafeSAdult * 60) / 100;
			
			norSSenior = (norSAdultPBG * 70) / 100;
			hotSSenior = (hotSAdult * 70) / 100;
			cafeSSenior = (cafeSAdult * 70) / 100;
			
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("                    TICKET PRICE LIST FOR " + depSt + " STATION TO " + destSt + " STATION (EXCLUSIVE SST)                ");
		
			System.out.println("    ________________________________________________________________________________________________________________");
			System.out.println("    |                  |                              |          HOT SEAT           |        CAFETERIA SEAT        |");
			System.out.println("    |    CATEGORIES    |         NORMAL SEAT          |       (EXTRA LEGROOM)       |       (CAFETERIA COACH)      |");
			System.out.println("    |__________________|______________________________|_____________________________|______________________________|");
			System.out.println("    |                  |                              |                             |                              |");
			System.out.printf ("    |      ADULT"           );
			System.out.printf ("       |          RM%.2f" , norSAdultPBG);
			System.out.printf ("            |         RM%.2f", hotSAdult );
			System.out.printf ("            |          RM%.2f", cafeSAdult );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |      CHILD"           );
			System.out.printf ("       |           RM%.2f" , norSChild);
			System.out.printf ("            |          RM%.2f", hotSChild );
			System.out.printf ("            |          RM%.2f", cafeSChild );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |     STUDENT"    );
			System.out.printf ("      |           RM%.2f" , norSStud);
			System.out.printf ("            |          RM%.2f", hotSStud );
			System.out.printf ("            |           RM%.2f", cafeSStud );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |     DISABLED"     );
			System.out.printf ("     |           RM%.2f" , norSOKU);
			System.out.printf ("            |          RM%.2f", hotSOKU );
			System.out.printf ("            |           RM%.2f", cafeSOKU );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |      SENIOR"          );
			System.out.printf ("      |           RM%.2f" , norSSenior);
			System.out.printf ("            |          RM%.2f", hotSSenior );
			System.out.printf ("            |           RM%.2f", cafeSSenior );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |__________________|______________________________|_____________________________|______________________________|" );
		
			System.out.println("");
			System.out.println("        PLEASE ENTER THE QUANTITY OF TICKETS YOU WANT TO BUY ACCORDING TO THE PASSENGER CATEGORIES AND SEAT TYPES        ");
			System.out.println("");
		
		
			chooseTickets();
		
		
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			
			totalnorSAdult = norSAdultQuan * norSAdultPBG;
			totalhotSAdult = hotSAdultQuan * hotSAdult;
			totalcafeSAdult = cafeSAdultQuan * cafeSAdult;
			totalnorSChild = norSChildQuan * norSChild;
			totalhotSChild = hotSChildQuan * hotSChild;
			totalcafeSChild = cafeSChildQuan * cafeSChild;
			totalnorSStud = norSStudQuan * norSStud;
			totalhotSStud = hotSStudQuan * hotSStud;
			totalcafeSStud = cafeSStudQuan * cafeSStud;
			totalnorSOKU = norSOKUQuan * norSOKU;
			totalhotSOKU = hotSOKUQuan * hotSOKU;
			totalcafeSOKU = cafeSOKUQuan * cafeSOKU;
			totalnorSSenior = norSSeniorQuan * norSSenior;
			totalhotSSenior = hotSSeniorQuan * hotSSenior;
			totalcafeSSenior = cafeSSeniorQuan * cafeSSenior;
			
			displaySeatAvailable();
			
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			ticketConfirm();
		}
		
		else if (depSt.equals("IPOH") && destSt.equals("ALOR SETAR"))
		{
			hotSAdult = (norSAdultIAOR * 110) / 100;
			cafeSAdult = (norSAdultIAOR * 115) / 100;
			
			norSChild = (norSAdultIAOR * 90) / 100;
			hotSChild = (hotSAdult * 90) / 100;
			cafeSChild = (cafeSAdult * 90) / 100;
			
			norSStud = (norSAdultIAOR * 80) / 100;
			hotSStud = (hotSAdult * 80) / 100;
			cafeSStud = (cafeSAdult * 80) / 100;
			
			norSOKU = (norSAdultIAOR * 60) / 100;
			hotSOKU = (hotSAdult * 60) / 100;
			cafeSOKU = (cafeSAdult * 60) / 100;
			
			norSSenior = (norSAdultIAOR * 70) / 100;
			hotSSenior = (hotSAdult * 70) / 100;
			cafeSSenior = (cafeSAdult * 70) / 100;
			
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("                    TICKET PRICE LIST FOR " + depSt + " STATION TO " + destSt + " STATION (EXCLUSIVE SST)                ");
		
			System.out.println("    ________________________________________________________________________________________________________________");
			System.out.println("    |                  |                              |          HOT SEAT           |        CAFETERIA SEAT        |");
			System.out.println("    |    CATEGORIES    |         NORMAL SEAT          |       (EXTRA LEGROOM)       |       (CAFETERIA COACH)      |");
			System.out.println("    |__________________|______________________________|_____________________________|______________________________|");
			System.out.println("    |                  |                              |                             |                              |");
			System.out.printf ("    |      ADULT"           );
			System.out.printf ("       |           RM%.2f" , norSAdultIAOR);
			System.out.printf ("            |          RM%.2f", hotSAdult );
			System.out.printf ("            |           RM%.2f", cafeSAdult );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |      CHILD"           );
			System.out.printf ("       |           RM%.2f" , norSChild);
			System.out.printf ("            |          RM%.2f", hotSChild );
			System.out.printf ("            |           RM%.2f", cafeSChild );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |     STUDENT"    );
			System.out.printf ("      |           RM%.2f" , norSStud);
			System.out.printf ("            |          RM%.2f", hotSStud );
			System.out.printf ("            |           RM%.2f", cafeSStud );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |     DISABLED"     );
			System.out.printf ("     |           RM%.2f" , norSOKU);
			System.out.printf ("            |          RM%.2f", hotSOKU );
			System.out.printf ("            |           RM%.2f", cafeSOKU );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |                  |                              |                             |                              |");
		
			System.out.printf ("    |      SENIOR"          );
			System.out.printf ("      |           RM%.2f" , norSSenior);
			System.out.printf ("            |          RM%.2f", hotSSenior );
			System.out.printf ("            |           RM%.2f", cafeSSenior );
			System.out.print  ("            |");
			System.out.println("");
			System.out.println("    |__________________|______________________________|_____________________________|______________________________|" );
		
			System.out.println("");
			System.out.println("        PLEASE ENTER THE QUANTITY OF TICKETS YOU WANT TO BUY ACCORDING TO THE PASSENGER CATEGORIES AND SEAT TYPES        ");
			System.out.println("");
		
			chooseTickets();
		
		
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			
			totalnorSAdult = norSAdultQuan * norSAdultIAOR;
			totalhotSAdult = hotSAdultQuan * hotSAdult;
			totalcafeSAdult = cafeSAdultQuan * cafeSAdult;
			totalnorSChild = norSChildQuan * norSChild;
			totalhotSChild = hotSChildQuan * hotSChild;
			totalcafeSChild = cafeSChildQuan * cafeSChild;
			totalnorSStud = norSStudQuan * norSStud;
			totalhotSStud = hotSStudQuan * hotSStud;
			totalcafeSStud = cafeSStudQuan * cafeSStud;
			totalnorSOKU = norSOKUQuan * norSOKU;
			totalhotSOKU = hotSOKUQuan * hotSOKU;
			totalcafeSOKU = cafeSOKUQuan * cafeSOKU;
			totalnorSSenior = norSSeniorQuan * norSSenior;
			totalhotSSenior = hotSSeniorQuan * hotSSenior;
			totalcafeSSenior = cafeSSeniorQuan * cafeSSenior;
			
			displaySeatAvailable();
			
			System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			
			ticketConfirm();
		}
		else
		{
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("                                                           Sorry!                                                              ");
			System.out.println("                               For the selected station we don't provide the schedule train yet                                ");
			System.out.println("                                But you can choose another departure and destination station.                                  ");
			System.out.println("                                                Sorry for the inconvenience!                                                   ");
	}



	}
	
	public static void Login()
	{
		String userName, pin;
		int i = 0;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please enter your username: ");
		userName = input.nextLine();
        
        System.out.print("Please enter your PIN number : ");
        pin = input.nextLine();
        
        if (userName.equals("asyraafdanial02") && pin.equals("284368"))
        {
        	System.out.println("Welcome back " + Name + "!");
        }
        else
        {
            for ( i = 1 ; i<= 3 ; i++) 
            {
            	System.out.println("Wrong user name or Pin Number!");
            	System.out.print("Please enter your username again: ");
        		userName = input.nextLine();
            	System.out.print("Please enter your PIN number again : ");
                pin = input.nextLine();
            }
            System.out.println ("Tries exceed limit! You are not allowed to log in!");
            System.exit(0);
        } 
		
	}
	
	public static void showStations() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Where do you want to go, "+ Name + "?");
		System.out.print("Departure Station: ");
		depSt = input.nextLine();
		System.out.print("Destination Station: ");
		destSt = input.nextLine();
	
		System.out.println(" ");
		System.out.println("You have selected to depart at " + depSt + " Station and arrive at " + destSt + " Station.");
		System.out.println(" ");
	}
	
	public static void chooseTickets()
	{
		Scanner input = new Scanner(System.in);
		System.out.println(category1);
		System.out.print(seatType1 + ": ");
		norSAdultQuan = input.nextInt();
		System.out.print(seatType2 + ": ");
		hotSAdultQuan = input.nextInt();
		System.out.print(seatType3 + ": ");
		cafeSAdultQuan = input.nextInt();
		System.out.println("");
		
		System.out.println(category2);
		System.out.print(seatType1 + ": ");
		norSChildQuan = input.nextInt();
		System.out.print(seatType2 + ": ");
		hotSChildQuan = input.nextInt();
		System.out.print(seatType3 + ": ");
		cafeSChildQuan = input.nextInt();
		System.out.println("");
		
		System.out.println(category3);
		System.out.print(seatType1 + ": ");
		norSStudQuan = input.nextInt();
		System.out.print(seatType2 + ": ");
		hotSStudQuan = input.nextInt();
		System.out.print(seatType3 + ": ");
		cafeSStudQuan = input.nextInt();
		System.out.println("");
		
		System.out.println(category4);
		System.out.print(seatType1 + ": ");
		norSOKUQuan = input.nextInt();
		System.out.print(seatType2 + ": ");
		hotSOKUQuan = input.nextInt();
		System.out.print(seatType3 + ": ");
		cafeSOKUQuan = input.nextInt();
		System.out.println("");
		
		System.out.println(category5);
		System.out.print(seatType1 + ": ");
		norSSeniorQuan = input.nextInt();
		System.out.print(seatType2 + ": ");
		hotSSeniorQuan = input.nextInt();
		System.out.print(seatType3 + ": ");
		cafeSSeniorQuan = input.nextInt();
		System.out.println("");
	}
	
	public static void displaySeatAvailable()
	{
		int[][] totalSeats = new int[MAX_ROW][MAX_COLUMN];
    
		Scanner input = new Scanner(System.in);
    
		displayMenu();
		int menuChoice;
		menuChoice = input.nextInt();
		while (menuChoice < 6)
		{
			switch(menuChoice)
			{
			case 1:
				System.out.println("You have Chosen Normal Seat!");
				if (!isNormalFull(totalSeats))
				{
					makeNormalReservation(totalSeats,input);
				}
				else
				{
					System.out.println("Normal Seat is Full. Please Choose Anothers.");
				}
				displayMenu();
				menuChoice = input.nextInt();
				break;
			case 2:
				System.out.println("You have Chosen Hot Seat!");
				if (!isHotFull(totalSeats))
				{
					makeHotReservation(totalSeats,input);
				}
				else
				{
					System.out.println("Hot Seats is Full. Please Choose Anothers.");
				}
				displayMenu();
				menuChoice = input.nextInt();
				break;
			case 3:
				System.out.println("You have Chosen Cafeteria Seat!");
				if (!isCafeFull(totalSeats))
				{
					makeCafeReservation(totalSeats,input);
				}
				else
				{
					System.out.println("Cafeteria Seat is Full. Please Choose Anothers.");
				}
				displayMenu();
				menuChoice = input.nextInt();
				break;
			case 4:
				System.out.println("You have Chosen to Display All Available Seating!");
				displayArray(totalSeats);
				displayMenu();
				menuChoice = input.nextInt();
				break;
			case 5:
				System.out.println("You have Chosen to Quit the Program!");
				return;
			}
		}
  }
	
	public static void makeNormalReservation(int[][] totalSeats, Scanner input)
	  {
	    for (int row = 0; row < 3; row++)
	    {
	      for (int col = 0; col < 4; col++)
	    {
	        if (totalSeats[row][col] == 0)
	        {
	          totalSeats[row][col] = 1;
	          System.out.println("You have been assigned a Normal Seat " + col + " in Row " + row);
	          System.out.println();
	          return;
	        }      
	      }
	    }
	  }
	
	public static void makeHotReservation(int[][] totalSeats, Scanner input)
	 {
	    for (int row = 3; row < 7; row++)
	    {
	      for (int col = 0; col < 4; col++)
	      {
	      if (totalSeats[row][col] == 0)
	        {
	          totalSeats[row][col] = 1;
	          System.out.println("You have been assigned a Hot Seat " + col + " in Row " + row);
	          System.out.println();
	          return;
	        }
	      }
	    }
	  }
	
	public static void makeCafeReservation(int[][] totalSeats, Scanner input)
	 {
	    for (int row = 7; row < 20; row++)
	    {
	    	for (int col = 0; col < 4; col++)
	    	{
	    		if (totalSeats[row][col] == 0)
	    		{
	    			totalSeats[row][col] = 1;
	    			System.out.println("You have been assigned an Cafeteria Seat " + col + " in Row" + row);
	    			System.out.println();
	    			return;
	    		}
	       }
	     }
	   }
	
	public static boolean isNormalFull(int[][] totalSeats)
	  {
		for (int row = 0; row < 3; row++) 
		{
			for (int col = 0; col < 4; col++) 
			{
				if (totalSeats[row][col] == 0) 
					return false;
			}
	    }
	   return true;
	  }
	
	public static boolean isHotFull(int[][] totalSeats)
	 {
	    for (int row = 4; row < 7; row++)
	    {
	      for (int col = 0; col < 4; col++)
	      {
	        if (totalSeats[row][col] == 0)
	          return false;
	      }
	    }
	    return true;
	  }
	public static boolean isCafeFull(int[][] totalSeats)
	{
		for (int row = 8; row < 20; row++)
		{
			for (int col = 0; col < 4; col++)
			{
				if (totalSeats[row][col] == 0)
					return false;
			}
	    }
	    return true;
	}
	            
	public static void displayArray(int[][] totalSeats)
	{
	    for (int row = 0; row < totalSeats.length; row++)
	    {
	    	for (int col = 0; col < totalSeats[row].length; col++)
	    	{
	    		System.out.printf("\t%4d" , totalSeats[row][col]);
	    	}
	    	System.out.println();
	    }
	}
	
	public static void displayMenu()
	{
		System.out.println();
		System.out.println("REMEMBER TO CHOOSE ONLY SELECTED SEAT CATEGORIES IN PREVIOUS MENU!");
		System.out.println();
		System.out.println("Choose the option 1-5!");
	    System.out.println("1. Normal Seat");
	    System.out.println("2. Hot Seat");
	    System.out.println("3. Cafeteria Seat");
	    System.out.println("4. Display All Available Seats!");
	    System.out.println("5. Quit!");
	  }
	
	
	public static void ticketConfirm()
	{
		Date timenow = new Date();
		String orderID = "301221003";
		String payMethod = "Malaysia Railways e-Wallet";
		
		double sst = 0.06;
		double tax;
		double sum;
		double subtotal;
		double earlyBal = 700;
		double finalBal;
		
		sum = totalnorSAdult + totalnorSChild + totalnorSStud + totalnorSOKU + totalnorSSenior + totalhotSAdult + totalhotSChild + totalhotSStud + totalhotSOKU + totalhotSSenior + totalcafeSAdult + totalcafeSChild + totalcafeSStud + totalcafeSOKU + totalcafeSSenior;
		tax = sst * sum;
		subtotal = sum + tax;
		finalBal = earlyBal - subtotal;

		System.out.println("                                                  MALAYSIA RAILWAYS                                                      ");
		System.out.println("                                            TICKET PURCHASED CONFIRMATION                                                ");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Name                       : " + Name);
		System.out.println("Order ID.                  : " + orderID);
		System.out.println("Date/Time Purchased        : " + timenow.toString());
		System.out.println("Payment Method             : " + payMethod);
		System.out.println("Departure Station          : " + depSt + " Station");
		System.out.println("Destination Station        : " + destSt + " Station");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println("No             Ticket Categories                            Quantity                                   Cost (RM)        ");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.printf ("\n1.0            (" + category1 + ")"                                                                                              );
		System.out.printf ("\n1.1            " + seatType1 + "                                     " + norSAdultQuan + "                                         %.2f" , totalnorSAdult);
		System.out.printf ("\n1.2            " + seatType2 + "                                        " + hotSAdultQuan + "                                         %.2f" , totalhotSAdult);
		System.out.printf ("\n1.3            " + seatType3 + "                                  " + cafeSAdultQuan + "                                         %.2f", totalcafeSAdult);
		System.out.println(" ");
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		
		System.out.printf ("\n2.0            (" + category2 + ")"                                                                                              );
		System.out.printf ("\n2.1            " + seatType1 + "                                     " + norSChildQuan + "                                         %.2f" , totalnorSChild);
		System.out.printf ("\n2.2            " + seatType2 + "                                        " + hotSChildQuan + "                                         %.2f" , totalhotSChild);
		System.out.printf ("\n2.3            " + seatType3 + "                                  " + cafeSChildQuan + "                                         %.2f" , totalcafeSChild);
		System.out.println(" ");
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		
		System.out.printf ("\n3.0            (" + category3 + ")"                                                                                             );
		System.out.printf ("\n3.1            " + seatType1 + "                                     " + norSStudQuan + "                                         %.2f" , totalnorSStud);
		System.out.printf ("\n3.2            " + seatType2 + "                                        " + hotSStudQuan + "                                         %.2f" , totalhotSStud);
		System.out.printf ("\n3.3            " + seatType3 + "                                  " + cafeSStudQuan + "                                         %.2f" , totalcafeSStud);
		System.out.println(" ");
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		
		System.out.printf ("\n4.0            (" + category4 + ")"                                                                                             );
		System.out.printf ("\n4.1            " + seatType1 + "                                     " + norSOKUQuan + "                                         %.2f" , totalnorSOKU);
		System.out.printf ("\n4.2            " + seatType2 + "                                        " + hotSOKUQuan + "                                         %.2f" , totalhotSOKU);
		System.out.printf ("\n4.3            " + seatType3 + "                                  " + cafeSOKUQuan + "                                         %.2f" , totalcafeSOKU);
		System.out.println(" ");
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		
		System.out.printf ("\n5.0            (" + category5 + ")"                                                                                             );
		System.out.printf ("\n5.1            " + seatType1 + "                                     " + norSSeniorQuan + "                                         %.2f" , totalnorSSenior);
		System.out.printf ("\n5.2            " + seatType2 + "                                        " + hotSSeniorQuan + "                                         %.2f" , totalhotSSenior);
		System.out.printf ("\n5.3            " + seatType3 + "                                  " + cafeSSeniorQuan + "                                         %.2f" , totalcafeSSenior);
		System.out.println(" ");
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("\n Amount                                        :                                                         %.2f" , sum);
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("\n Sales and Service Tax (SST)                   :                                                         %.2f" , tax);
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("\n Subtotal                                      :                                                         %.2f" , subtotal);
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
	
		if (subtotal <= earlyBal) 
		{
			System.out.printf("\n Malaysia Railways e-Wallet Balance (BEFORE)   :                                                         %.2f" , earlyBal);
			System.out.printf("\n Malaysia Railways e-Wallet Balance (AFTER)    :                                                         %.2f" , finalBal);
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("                                                    Congratulations!                                                       ");
			System.out.println("                                           You purchases have been confirmed                                               ");
			System.out.println("                                       Please be at the station 30 minutes earlier                                         ");
			System.out.println("                                            Have a nice day " + Name +"!                                             ");
		}
	
		else
		{
			System.out.printf("\n Malaysia Railways e-Wallet Balance (BEFORE)   :                                                         %.2f" , earlyBal);
			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("                                                         Oops!                                                             ");
			System.out.println("                              It appears that you don't have enough balance in your e-Wallet.                              ");
			System.out.println("                                               Payment will be cancelled.                                                  ");
		}
	
	}
}
