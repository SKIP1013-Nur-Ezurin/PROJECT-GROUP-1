package vehicle;
import java.io.*;
import java.util.Scanner;

// Flight Reservation System
public class Aircraft {
	private static final int DISPLAYPACKAGE = 0, DISPLAYINDSEAT = 1, DISPLAYDUOSEAT = 2, DISPLAYFAMSEAT = 3;
	//Declare (as global) variable and its value
	public static String name,destination,departureDate,departureTime;
	public static int totalIndividualPack, totalDuoPack, totalFamiliaPack;
	
	//Main Method
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		float individualPrice, duoPrice, familiaPrice,individualPrice2,duoPrice2,familiaPrice2,foodPrice = 30;
		float baggagePrice = 90,seatPrice = 180;
		int disc1 = 95,disc2 = 85,disc3 = 75;	
		float totalIndividual,totalDuo,totalFamilia,totalIndividual2,totalDuo2,totalFamilia2,totalPrice, finalPrice, savePrice;
		int orderNumber = (int)(Math.random() * 10000);
		
		//Calculate every package before promotion for display
		individualPrice = seatPrice;
		duoPrice = (seatPrice * 2) + (baggagePrice * 2);
		familiaPrice= (seatPrice * 5) + (baggagePrice * 5) + (foodPrice * 5);
		
		//Calculate every package after promotion for display
		individualPrice2 = (individualPrice * disc1 ) /100;
		duoPrice2= (duoPrice *disc2) / 100;
		familiaPrice2 = (familiaPrice * disc3)/100;
		
		DisplayMessage(individualPrice,duoPrice,familiaPrice, individualPrice2,duoPrice2,familiaPrice2,DISPLAYPACKAGE);   
		InputData();
		
		//Calculate total price input from the users
		//Calculate to show the differences of before after total promotion price
		totalIndividual2 = individualPrice2 * totalIndividualPack;
		totalDuo2= duoPrice2 * totalDuoPack;
		totalFamilia2 = familiaPrice2 * totalFamiliaPack;
		totalIndividual = individualPrice * totalIndividualPack;
		totalDuo= duoPrice * totalDuoPack;
		totalFamilia = familiaPrice * totalFamiliaPack;
		totalPrice = totalIndividual + totalDuo +totalFamilia;
		finalPrice = totalIndividual2 + totalDuo2 +totalFamilia2;
		savePrice = totalPrice - finalPrice;		
		
		//Selection code to choose available seat
		Scanner sc = new Scanner( System.in ); 
		final int SEAT_OF_IND = 12;
		final int SEAT_OF_DUO=  28;
		final int SEAT_OF_FAM =  55;
        int indSeatTaken = 0; // next available individual  class seat 
        int duoSeatTaken = 0; // next available duo class seat 
        int famSeatTaken = 0; //next available familia Class seat
        int section ;
        boolean isTerminate = true;
        System.out.println("Please book your ticket seat according to the class ");
        while (( indSeatTaken < SEAT_OF_IND || duoSeatTaken <  SEAT_OF_DUO || famSeatTaken  < SEAT_OF_FAM) && isTerminate)
        { 
               boolean isExit = true;
            do
            {
                System.out.println("Please type 1 for Individual Seat Class" ); 
                System.out.println("Please type 2 for Duo Seat Class" );
                System.out.println("Please type 3 for Familia Seat Class");
                System.out.println("Please type 0 for Exit") ;
                System.out.print( "Your Choice ( 1 / 2 / 3 / 0 ): " ); 
                section = sc.nextInt();
                if(section == 1 || section == 2 || section == 3 || section == 0) 
                {
                	isExit = false;  
                }
                else 
                	System.out.println("ERROR INVALID ANSWER. PLEASE ANSWER (1/2/3/0) only");
                                             
            }while(isExit);
                     
            if (section == 1) // user chose first class 
            {          
                if(indSeatTaken < SEAT_OF_IND)
                {
                	System.out.println("Thank you for your reservation for Individual Class seat has been made");
                	indSeatTaken++;
                	System.out.println("Available individual seat left : " + ( SEAT_OF_IND - indSeatTaken));
                	System.out.println(" ");
         
                }
                else
                {
                	if(duoSeatTaken == SEAT_OF_DUO && indSeatTaken == SEAT_OF_IND)
                	{
                		System.out.println("Sorry Duo Seat and Individual Class Seat are currently full");
                		System.out.println("You can choose other seat Individual Seat that are still available");

                	}
                	else if(famSeatTaken == SEAT_OF_FAM && indSeatTaken == SEAT_OF_IND)
                	{
                		System.out.println("Sorry Familia Seat and Individual Seat are currently are currently full");
                		System.out.println("You can choose  Duo seat that are still available");
                		
                	}
                	else if (indSeatTaken == SEAT_OF_IND)
                	{
                		System.out.println("Sorry Individual Seat are currently full");
                		System.out.println("You can choose duo seat or familia seat that are still available");
                		
                	}
            		else 
            		{
            			System.out.println("Sorry all seat are currently full");
            		}
            		System.out.println("Update Individual Seat : " + ( SEAT_OF_IND - indSeatTaken));
            		System.out.println("Update Duo Seat : " + ( SEAT_OF_DUO  - duoSeatTaken));
            		System.out.println("Update Familia Seat : " + ( SEAT_OF_FAM - famSeatTaken));
            		System.out.println("");
                }
            }
	            
           if (section == 2)  // user chose duo class 
           {          
        	   if(duoSeatTaken < SEAT_OF_DUO)
               {
               	System.out.println("Thank you for your reservation for Duo Class seat has been made");
               	duoSeatTaken++;
               	System.out.println("Available duo seat left : " + ( SEAT_OF_DUO - duoSeatTaken));
               	System.out.println(" ");
        
               }
               else
               {
            	if(indSeatTaken == SEAT_OF_IND && duoSeatTaken == SEAT_OF_DUO)
               		{
               		System.out.println("Sorry Individual Seat and duo Seat are currently full");
               		System.out.println("You can choose other seat familia Seat that are still available");
               		}
               	else if(famSeatTaken == SEAT_OF_FAM && duoSeatTaken == SEAT_OF_DUO)
               		{
               		System.out.println("Sorry familia Seat and duo Seat are currently are currently full");
               		System.out.println("You can choose  individual seat that are still available");
               		}
               	else if (duoSeatTaken == SEAT_OF_DUO)
               		{
               		System.out.println("Sorry Duo Seat are currently full");
               		System.out.println("You can choose individual seat or familia seat that are still available");
               		}
           		else 
           		{
           			System.out.println("Sorry all seat are currently full");
           		}
           		System.out.println("Update Individual Seat : " + ( SEAT_OF_IND - indSeatTaken));
           		System.out.println("Update Duo Seat : " + ( SEAT_OF_DUO  - duoSeatTaken));
           		System.out.println("Update Familia Seat : " + ( SEAT_OF_FAM - famSeatTaken));
           		System.out.println("");
               }
           }
                    
        	   if (section == 3) // user chose familia 
               {          
                   if(famSeatTaken < SEAT_OF_FAM)
                   {
                   	System.out.println("Thank you for your reservation for Familia Class seat has been made");
                   	famSeatTaken++;
                   	System.out.println("Available familia seat left : " + ( SEAT_OF_FAM - famSeatTaken));
                   	System.out.println(" ");
            
                   }
                   else
                   {
                   	if(duoSeatTaken == SEAT_OF_DUO && famSeatTaken == SEAT_OF_FAM)
                   	{
                   		System.out.println("Sorry Familia Seat and duo Seat are currently full");
                   		System.out.println("You can choose other seat familia Seat that are still available");

                   	}
                   	else if(indSeatTaken == SEAT_OF_IND && famSeatTaken == SEAT_OF_FAM)
                   	{
                   		System.out.println("Sorry individual Seat and familia Seat are currently are currently full");
                   		System.out.println("You can choose  duo  seat that are still available");
                   		
                   	}
                   	else if (famSeatTaken == SEAT_OF_FAM)
                   	{
                   		System.out.println("Sorry familia Seat are currently full");
                   		System.out.println("You can choose duo seat or individual seat that are still available");
                   		
                   	}
               		else 
               		{
               			System.out.println("Sorry all seat are currently full");
               		}
               		System.out.println("Update Individual Seat : " + ( SEAT_OF_IND - indSeatTaken));
               		System.out.println("Update Duo Seat : " + ( SEAT_OF_DUO  - duoSeatTaken));
               		System.out.println("Update Familia Seat : " + ( SEAT_OF_FAM - famSeatTaken));
               		System.out.println("");
                   }
               }      
                if (section == 0) // user exits
                	isTerminate = false;                
        } 
        
     		 //Using array method to book passenger details
      		System.out.println("PASSENGERS BOOKING INFORMATION DETAILS");
      		
      		Scanner b = new Scanner(System.in);
      		System.out.println("Enter choice  1 for individual , 2 for duo, 3 for family");
      		int choice = b.nextInt();
      		
      		switch (choice) {
      			//Key in individual seat passengers details
      			case 1:
      				System.out.println("Individual details"); 
      		        Scanner scans = new Scanner(System.in);
      		        int n;
      		  		Scanner scs = new Scanner (System.in);
      		  		System.out.print("Enter the number of passengers that you want to book: ");
      		  		n = sc.nextInt();
      		  		
      		  		String[] namePassenger = new String [10];
      		  		System.out.println("Enter the name of the passenger that you want to book: ");
      		  		for (int i = 0 ; i < n ; i++) {
      		  			namePassenger[i] = scs.next();
      		  		}
      		  		
      		  		int[] icNum = new int [10];
      		  		System.out.println("Enter the ic number of the passenger that you want to book: ");
      		  		for (int j = 0 ; j < n ; j++) {
      		  			icNum[j] = scs.nextInt();
      		  		}
      		  		System.out.println("Details of individual passenger: ");
      		  		for(int i =0; i<n; i++) {
      		  			System.out.println(namePassenger[i]);
      		  		
      		  		for(int j =0; j<n; j++) {
      		  			System.out.println(icNum[j]);
      		  			}
      		  		}
      		           break;
      		    
      		    //key in duo seat passengers details
      			case 2:
      				System.out.println("Duo details");
      		        Scanner scan = new Scanner(System.in);
      		        String inputDuo[][] = new String[2][2];
      		        System.out.println("Enter the number of passengers : ");
      		        int noOfRows = scan.nextInt();
      		        System.out.println("Please enter " + noOfRows + " name of passengers.");
      		        int noOfCols = noOfRows;
      		        System.out.println("Please enter " + noOfCols + " IC number of every each passengers.");
      		            
      		        for (int i = 0; i < noOfRows; i++) {
      		            for (int j = 0; j < noOfRows; j++) {
      		                 inputDuo[i][j] = scan.next();
      		            }
      		        }
      		                
      		        scan.close();
      		        System.out.println("The Details of Duo Passenger for the booking details :");
      		           for (int i = 0; i < noOfRows; i++) {
      		              for (int j = 0; j < noOfRows; j++) {
      		                  System.out.print(inputDuo[i][j] + "\t");
      		            }
      		             System.out.println();
      		         };
      		    break;
      		
      		    //key in familia passengers details
      			case 3:
      				System.out.println("Familia details");
      		        Scanner a = new Scanner(System.in);
      		        System.out.print("Enter the number of passengers that you want to book");
      		  		n = a.nextInt();
      		  		
      		  		
      		  		String[] namePassenger1 = new String [10];
      		  		System.out.println("Enter the name of the passengers that you want to book:");
      	  		
      	  			namePassenger1[0] = a.next();
      	  			namePassenger1[1] = a.next();
      	  			namePassenger1[2] = a.next();
      	  			namePassenger1[3] = a.next();
      	  			namePassenger1[4] = a.next();
      	  			
      	  			int[] icNum2 = new int [10];
      	  	  		System.out.println("Enter the ic number of the passengers that you want to book:");
      	  	  		
      	  	  		icNum2[0] = a.nextInt();
      	  	  		icNum2[1] = a.nextInt();  
      	  	  		icNum2[2] = a.nextInt();
      	  	  		icNum2[3] = a.nextInt();
      	  	  		icNum2[4] = a.nextInt();
      	  	  		
      	  	  		System.out.println("The details of the familia passengers that you book");
      	  	  		System.out.println("Details Passenger 1 : Name: " +namePassenger1[0] + " IC Number : " +icNum2[0] );
      		  	  	System.out.println("Details Passenger 2 : Name: " +namePassenger1[1] + " IC Number : " +icNum2[1] );
      		  	  	System.out.println("Details Passenger 3 : Name: " +namePassenger1[2] + " IC Number : " +icNum2[2] );
      		  	  	System.out.println("Details Passenger 4 : Name: " +namePassenger1[3] + " IC Number : " +icNum2[3] );
      		  	  	System.out.println("Details Passenger 5 : Name: " +namePassenger1[4] + " IC Number : " +icNum2[4] );
      	  	
      	  		break;
      	   
      	     default : System.out.println("Error please enter number 1 for individual /2 for duo /3 for familia only");
      	     System.exit(1);
      	     } 
        System.out.println("Thank you for booking");
        
        // throw Exception to declare exception that occur during execution of a program 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
     	// buffered reader is java class to read text from the input by read characters, in array 
     	int seatIndividual[][]= new int[3][4];
     	int seatDuo[][]= new int[4][7];
     	int seatFamilia[][]= new int[5][11];
        int i,j,k=1;
        int ans;
        boolean isExit = true;
        boolean isError = true;
        
        //Choose position seat number using array
        System.out.println("PASSENGERS YOU MAY CHOOSE YOUR SEAT POSITION");
        Scanner c = new Scanner(System.in);
  		System.out.println("Enter choice  1 for individual , 2 for duo, 3 for family");
  		int seat = c.nextInt();
  		//choosing seat number in individual package
   		if(seat == 1) 
		{			
			DisplayMessage(0,0 ,0,0,0,0,DISPLAYINDSEAT);
		    for( i = 0 ; i < 3 ; i++) 
			{
		        for(j = 0 ; j < 4 ; j++) 
				{
		            seatIndividual[i][j]=k;
		            k++;
		        }
		    }
		
		    for(int[] row : seatIndividual) 
			{
		        printRow(row);
		    }
				//this loop repeats the reserving process (and printing seats) 12 times
		    do 
			{
				System.out.println("Enter 0 to exit loop.");
		        System.out.print("Enter a Seat number to reserve: ");
		        ans = Integer.parseInt(br.readLine());
		   	    k = 1;
		        if(ans == 0)	
				{
		    	   	isExit = false;
		          	break;
				}
		        for(i=0;i<3;i++) 
				{
		            for(j=0;j<4;j++) 
					{
		                if (k == ans) 
						{
		                    //here we check if the seat has already been reserved
		                    if (seatIndividual[i][j]== 0) {
		                        System.out.println("That seat has already been reserved");
		                    }
		                	//if its not reserved then reserve it
		                    else 
							{
		                         seatIndividual[i][j]= 0;
		                    }
		                }
		                k++;
		            }
		        }
		           //print updated array of seats
		        for(int[] row : seatIndividual) 
				{
		       	    printRow(row);
		        }
		    }while(isExit);	isError = true;
   		}
   		
   		//choosing duo seat numbers 
		else if (seat == 2) 
		{
			DisplayMessage(0,0 ,0,0,0,0,DISPLAYDUOSEAT);
		  	for( i = 0 ; i < 4 ; i++) 
			{
		        for(j = 0 ; j < 7 ; j++) 
				{
		            seatDuo[i][j]=k;
		            k++;
		        }
		    }
			
		    for(int[] row : seatDuo) 
			{
		        printRow(row);
		    }
			//this loop repeats the reserving process (and printing seats) 12 times
		    do
			{
				System.out.println("Enter 0 to exit loop.");						
		        System.out.print("Enter a Seat number to reserve: ");
		        ans = Integer.parseInt(br.readLine());
	           	k = 1;
			    if(ans == 0)	
				{
			       	isExit = false;
			       	break;
				}
		        for(i=0;i<4;i++) 
				{
			        for(j=0;j<7;j++) 
					{
			            if (k == ans) 
						{
			              	 //here we check if the seat has already been reserved
			           	    if (seatDuo[i][j]== 0) 
							{
			                    System.out.println("That seat has already been reserved");
			            	}
			                //if its not reserved then reserve it
			                else  
							{
			                   seatDuo[i][j]= 0;
			            	}
			            }
			            k++;
			        }
			    }
			    //print updated array of seats
			    for(int[] row : seatDuo) 
				{
			        printRow(row);
			    }
			}while(isExit);	
		    isExit = true;
		} 
   		
   		//choosing familia seat numbers
		else if ( seat == 3)
		{
			DisplayMessage(0,0 ,0,0,0,0,DISPLAYFAMSEAT);
		    System.out.println("Choose Familia Seat Number");
		   	for( i = 0 ; i < 5 ; i++) 
			{
				for(j = 0 ; j < 11 ; j++) 
				{
			        seatFamilia[i][j]=k;
			        k++;
			    }
			}
			for(int[] row : seatFamilia) 
			{
			    printRow(row);
			}
			//this loop repeats the reserving process (and printing seats) 12 times
			do
			{
				System.out.println("Enter 0 to exit loop.");
			    System.out.print("Enter a Seat number to reserve: ");
			    ans = Integer.parseInt(br.readLine());
			    k = 1;
			    if(ans == 0)	
				{
			       	isExit = false;
			       	break;
				}
			    for(i=0;i<5;i++) 
				{
			        for(j=0;j<11;j++) 
					{
			            if (k == ans) 
						{
			                //here we check if the seat has already been reserved
			                if (seatFamilia[i][j]== 0)
							{
			                    System.out.println("That seat has already been reserved");
			                }
			                //if its not reserved then reserve it
			                else 
							{
			                    seatFamilia[i][j]= 0;
			                }
			            }
			            k++;
			        }
			    }
			    //print updated array of seats
			    for(int[] row : seatFamilia) 
				{
			        printRow(row);
			    }
			}while(isError);	isError = true;      
		}
		else 
		{
		    System.out.println("Wrong. Please entered the correct input");
		}
   		
   		//calling Display flight details method
   		DisplayFlightDetails( orderNumber,totalPrice,finalPrice, savePrice,  indSeatTaken, duoSeatTaken, famSeatTaken);		
   		
	}
	//printRowMethod to pass array in the main method to loop display seat
	public static void printRow(int[] row) {
        for (int i : row) {
           System.out.print(i);
           System.out.print("\t");
       }
       System.out.println();
    }
	
	//Method display flight details - Display user flight payment details
	public static void DisplayFlightDetails(int orderNumber, double totalPrice, double finalPrice, double savePrice, int indSeatTaken, int duoSeatTaken, int famSeatTaken) {
			System.out.println("\n                                   GERAK AIRWAYS                                ");
			System.out.println("                                 FLIGHT PAYMENT DETAILS                           ");
			System.out.println("No of Order:" +orderNumber);
			System.out.println("\nName: " +name);
			System.out.println("Destination: " +destination);
			System.out.println("Departure Date: " +departureDate);
			System.out.println("Departure Time: " +departureTime);
			System.out.println("Total individual package: " +totalIndividualPack);
			System.out.println("Total duo package: " +totalDuoPack);
			System.out.println("Total familia package: " +totalFamiliaPack);		
			System.out.printf("Total price BEFORE discount: RM%.2f" ,totalPrice);
			System.out.println("");
			System.out.printf("Total price AFTER discount: RM%.2f" ,finalPrice);
			System.out.println("");
			System.out.println("Your total Individual Class seat has been made: " +indSeatTaken +" seats ");
			System.out.println("Your total Duo Class Seat has been made " +duoSeatTaken + " seats");
			System.out.println("Your total Familu Class Seat has been made " +famSeatTaken + " seats");		
			System.out.printf("CONGRATULATIONS!! YOU GET TO SAVE YOUR TICKET FLIGHT FOR DECEMBER PROMOTION WITH RM%.2f" ,savePrice);
			System.out.println("");
			System.out.println("Your reservation for ticket seat is successfully");
			System.out.println("");
			System.out.println("");
			System.out.println("\n*********************************************************************************");
			System.out.println("\n                   YOUR PURCHASE HAVE BEEN SUCCESSFULLY BOOOKED                 ");
			System.out.println("\n                      THANK YOU FOR BOOKING WITH GERAK AIRWAYS                  ");
			System.out.println("\n                         Travel Together, Get Better Deals                      ");
			System.out.println("\n*********************************************************************************");
			System.out.println("_____________________________________________________________________________________");
	}
	
	//Display Message method to display the package price, seat position
	public static void DisplayMessage(float arg1, float arg2 ,float arg3,float arg4, float arg5,float arg6,int Switch)
	{
		final int DISPLAYPACKAGE = 0;
		final int DISPPLAYINDSEAT = 1;
		final int DISPLAYDUOSEAT =2;
		switch(Switch) {
		
			case DISPLAYPACKAGE :
				//Display package deals during the holiday promotion deals
				//Display original price and after promotion price
				System.out.println("\n                                 WELCOME TO GERAK AIRWAYS                       ");
				System.out.println("                              HOLIDAY DECEMBER PROMO DEALS                      ");
				System.out.println("                            Travel Together, Get Better Deals                   ");
				System.out.print(" ");
				System.out.println("_______________________________________________________________________________________" );
				System.out.println("|    INDIVIDUAL PACKAGE     |         DUO PACKAGE       |        FAMILIA PACKAGE       |");
				System.out.println("|___________________________|___________________________|______________________________|");
				System.out.printf("|BEFORE PROMO PRICE:RM%.2f" ,arg1);
				System.out.printf("|BEFORE PROMO PRICE:RM%.2f" ,arg2);
				System.out.printf("|BEFORE PROMO PRICE:RM%.2f" ,arg3);
				System.out.print("  |");
				System.out.println("");
				System.out.printf("|AFTER PROMO PRICE:RM %.2f", arg4);
				System.out.printf("|AFTER PROMO PRICE :RM%.2f",arg5);
				System.out.printf("|AFTER PROMO PRICE:RM%.2f " ,arg6);
				System.out.print("  |");
				System.out.println("");
				System.out.println("|      (ONE WAY PER PERSON) |     (ONE WAY TWO PERSON)  |    (ONE WAY FIVE PERSON)     |");
				System.out.println("|      -No food included    |    -Not food included     |    - Included food           |");
				System.out.println("|      -No 7kgs baggage     |    -7kgs baggage included |    - 7kgs baggage included   |");
				System.out.println("|                           |                           |                              |" );
				System.out.println("|    EXTRA 5% DISCOUNT      |    EXTRA 15% DISCOUNT     |       EXTRA 25% DISCOUNT     |");
				System.out.println("|___________________________|___________________________|______________________________|" );
				
				//Display seat class arrangement
				System.out.println("\n\n                                            GERAK AIRWAYS                                                ");
				System.out.println("                                         PLEASE CHOOSE YOUR SEAT CLASS ARRANGEMENT                           ");
				System.out.println("                                       NO ANY EXTRA CHARGES FOR THE FLIGHT CLASS SEAT                        ");
				System.out.println("                             EVERY CLASS WILL GET SAME SERVICES AND COMFORTABLE ACCOMODATION                 ");
				System.out.println("__________________________________________________________________________________________________________________");
				System.out.println("|    INDIVIDUAL PACKAGE SEAT = F        |       DUO PACKAGE SEAT = B           |        FAMILIA PACKAGE SEAT = E  |");
				System.out.println("|          no food included             |       7kgs baggage included          |      included food + 7kgs baggage|");
				System.out.println("|   getting your own privacy            |  special seat with your partner      |     close for family and friends |");
				System.out.println("|_______________________________________|______________________________________|__________________________________|");
				System.out.println("|_____________________________________________SEAT CLASS ARRANGEMENT______________________________________________|");
				System.out.println("|                                  /*             PILOT'S COCKPIT                  */      WINGS - WINDOW         |");
				System.out.println("|                                  |*      F1       F2        F3       F4          *|                             |");
				System.out.println("|         WINGS - WINDOW           |*      F5       F6        F7       F8          *|      WINGS - WINDOW         |");
				System.out.println("|                                  |*      F9       F10       F11       F12        *|                             |");
				System.out.println("|__________________________________|* B1    B2       B3  B4   B5      B6  B7       *|_____________________________|");
				System.out.println("|__________________________________|* B8    B9       B10  B11   B12      B13  B14  *|_____________________________|");
				System.out.println("|__________________________________|* B15   B16      B17  B18   B19      B20  B21  *|_____________________________|");
				System.out.println("|__________________________________|* B22   B23      B24  B25   B26      B27  B28  *|_____________________________|");
				System.out.println("|__________________________________|* E1 E2 E3       E4 E5 E6 E7 E8     E9 E10 E11 *|_____________________________|");
				System.out.println("|__________________________________|* E12 E13 E14  E15 E16 E17 E18 E19  E20 E21 E22*|_____________________________|");
				System.out.println("|__________________________________|* E23 E24 E25  E26 E27 E28 E29 E30  E31 E32 E33*|_____________________________|");
				System.out.println("|__________________________________|* E34 E35 E36  E37 E38 E39 E40 E41  E42 E43 E44*|_____________________________|");
				System.out.println("|__________________________________|* E45 E46 E47  E48 E49 E50 E51 E52  E53 E54 E55*|_____________________________|");
				System.out.println("|         WINGS - WINDOW           /*                WALK IN DOOR                  */      WINGS - WINDOW         |");
				System.out.println("|__________________________________|________________________________________________|_____________________________|");
				
				
				//User input the information using Scanner
				System.out.println("\n\n                                   GERAK AIRWAYS                               ");
				System.out.println("                             FLIGHT PRICE TICKET SYSTEM                            ");
				System.out.println("                            HOLIDAY DECEMBER PROMO DEALS                           ");
				System.out.println("                         Travel Together, Get Better Deals                         ");						
			break;
			case DISPPLAYINDSEAT :
	  			System.out.println("Choose your Individual seat number");
	  			System.out.println(" _________________________________________________INDIVIDUAL SEAT_________________________________________________");
	  			System.out.println("|                                  /*             PILOT'S COCKPIT                  */      WINGS - WINDOW         |");
	  			System.out.println("|                                  |*      F1       F2        F3       F4          *|                             |");
	  			System.out.println("|         WINGS - WINDOW           |*      F5       F6        F7       F8          *|      WINGS - WINDOW         |");
	  			System.out.println("|                                  |*      F9       F10       F11       F12        *|                             |");				
			break;
			case DISPLAYDUOSEAT :
			    System.out.println("Choose your duo seat number");
		  		System.out.println(" ________________________________________________________DUO SEAT_________________________________________________");
		  		System.out.println("|__________________________________|* B1    B2       B3  B4   B5      B6  B7       *|_____________________________|");
		  		System.out.println("|__________________________________|* B8    B9       B10  B11   B12      B13  B14  *|_____________________________|");
		  		System.out.println("|__________________________________|* B15   B16      B17  B18   B19      B20  B21  *|_____________________________|");
		  		System.out.println("|__________________________________|* B22   B23      B24  B25   B26      B27  B28  *|_____________________________|");			
			break;
			case DISPLAYFAMSEAT:
				System.out.println(" _____________________________________________________FAMILIA SEAT_________________________________________________");
			  	System.out.println("|__________________________________|* E1 E2 E3       E4 E5 E6 E7 E8     E9 E10 E11 *|_____________________________|");
				System.out.println("|__________________________________|* E12 E13 E14  E15 E16 E17 E18 E19  E20 E21 E22*|_____________________________|");
				System.out.println("|__________________________________|* E23 E24 E25  E26 E27 E28 E29 E30  E31 E32 E33*|_____________________________|");
				System.out.println("|__________________________________|* E34 E35 E36  E37 E38 E39 E40 E41  E42 E43 E44*|_____________________________|");
				System.out.println("|__________________________________|* E45 E46 E47  E48 E49 E50 E51 E52  E53 E54 E55*|_____________________________|");
				System.out.println("|         WINGS - WINDOW           /*                WALK IN DOOR                  */      WINGS - WINDOW         |");	
		}
	
	}
	
	
	public static void InputData()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.print("Please insert name: ");
		name=input.nextLine();
		
		System.out.print("Please insert destination: ");
		destination=input.nextLine();
		
		System.out.print("Please insert departure date: ");
		departureDate=input.nextLine();
		
		System.out.print("Please insert departure time: ");
		departureTime=input.nextLine();
		
		System.out.print("Please insert the number of individual package to book: ");
		totalIndividualPack=input.nextInt();
		
		System.out.print("Please insert the number of duo package to book: ");
		totalDuoPack=input.nextInt();
		
		System.out.print("Please insert the number of familia package to book: ");
		totalFamiliaPack=input.nextInt();		
	}
	
	
}
