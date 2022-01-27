package vehicle;
import java.util.Scanner;
import java.util.*;
//Motorcycle Service Charge System 
public class Motorcycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		String model;
		double brakecable = 35;
		double brakepads = 8;
		double brakedrums = 89;
		double carburetor = 55;
		double airfilter = 13;
		double fuelfilter = 10.40;
		double sparkplug = 8;
		double shockabsorber = 52.90;
		double chainsprocket = 49;
		double clutchplates = 50.20;
		double radials = 168;
		double breakshoe = 29.20;
		double drum = 242.80;
		double bearings = 22;
		int quantity1, quantity2, quantity3, quantity4, quantity5, quantity6, quantity7;
		int quantity8, quantity9, quantity10, quantity11, quantity12, quantity13, quantity14;
		double discount1 = 0, discount2 = 0, discount3 = 0;
		double total1, total2, total3 = 0, total4;
		double subtotal, sst, finaltotal = 0, finaldiscount, grandtotal;
		
		showTable(); //call method
		
		System.out.println("\nEnter model of motorcycle: ");
		model = scan.next();
		
		int option;
        boolean cont = true;
        
        while (cont)
        { 
               boolean next = true;
            do
            {   System.out.println(" ");
                System.out.println("\nPress 1 for Braking Problems" ); 
                System.out.println("Press 2 for Bad Throttle Response" );
                System.out.println("Press 3 for Vibrations or Jerking");
                System.out.println("Press 4 for High Fuel Consumption") ; 
                System.out.println("Press 0 to exit") ;
                option = scan.nextInt();
                if(option == 1 || option == 2 || option == 3 || option == 4 || option == 0) 
                {
                	next = false;  
                }
                else 
                	System.out.println("Please choose only between 0 to 4");
                                             
            }while(next);
                     
            if (option == 1) 
            {          
            	System.out.println("\nBraking Problems");
        		System.out.print("Quantity of item 1: ");
        		quantity1 = scan.nextInt();	
        		System.out.print("Quantity of item 2: ");
        		quantity2 = scan.nextInt();
        		System.out.print("Quantity of item 3: ");
        		quantity3 = scan.nextInt();
        		total1 = (brakecable*quantity1) + (brakepads*quantity2) + (brakedrums*quantity3);
        		System.out.printf("Price: RM %.2f" , total1);
        		discount1 = total1*0.5;
        		System.out.printf("\nPrice after discount: RM %.2f" , discount1);
            }
	            
           if (option == 2)   
           {          
        	   System.out.println("");
       		System.out.println("\nBad Throttle Response");
       		System.out.print("Quantity of item 1: ");
       		quantity4 = scan.nextInt();
       		System.out.print("Quantity of item 2: ");
       		quantity5 = scan.nextInt();
       		System.out.print("Quantity of item 3: ");
       		quantity6 = scan.nextInt();
       		System.out.print("Quantity of item 4: ");
       		quantity7 = scan.nextInt();
       		total2 = (carburetor*quantity4) + (airfilter*quantity5) + (fuelfilter*quantity6) + (sparkplug*quantity7);
       		System.out.printf("Price: RM %.2f" , total2);
       		discount2 = total2*0.5;
       		System.out.printf("\nPrice after discount: RM %.2f" , discount2);
           }      
        	if (option == 3)
               {          
        		   System.out.println("");
        			System.out.println("\nVibrations or jerking");
        			System.out.print("Quantity of item 1: ");
        			quantity8 = scan.nextInt();
        			System.out.print("Quantity of item 2: ");
        			quantity9 = scan.nextInt();
        			total3 = (shockabsorber*quantity8) + (chainsprocket*quantity9);
        			System.out.printf("Price: RM %.2f" , total3);
               }
        	   if (option == 4) 
               {          
        		   System.out.println("");
        			System.out.println("\nHigh Fuel Consumption");
        			System.out.print("Quantity of item 1: ");
        			quantity10 = scan.nextInt();
        			System.out.print("Quantity of item 2: ");
        			quantity11 = scan.nextInt();
        			System.out.print("Quantity of item 3: ");
        			quantity12 = scan.nextInt();
        			System.out.print("Quantity of item 4: ");
        			quantity13 = scan.nextInt();
        			System.out.print("Quantity of item 5: ");
        			quantity14 = scan.nextInt();
        			total4 = (clutchplates*quantity10) + (radials*quantity11) + (breakshoe*quantity12) + (drum*quantity13) + (bearings*quantity14);
        			System.out.printf("Price: RM %.2f" , total4);
        			discount3 = total4*0.5;
        			System.out.printf("\nPrice after discount: RM %.2f" , discount3);
               }    
                if (option == 0)
                {
                	
            		cont = false;
                }
        
        
	}
	    //Using array for users to list other problems faced
	  	String[] otherProblems = new String [10];
	  	int n;
	  	System.out.print("Enter the number of other problems: ");
	  	n = scan.nextInt();
	  	
	  	System.out.println("Enter other problems that would like to be checked:");
	  	for (int i = 0 ; i < n ; i++) {
  			otherProblems[i] = scan.next();
  		}

        String name;
        String phonenumber;
        String email;
	    char ch = 0;
	    char ch2 = 0;
	    char ch3 = 0;
	    boolean next2 = true;
	    boolean next3 = true;
	    boolean next4 = true;
	    
	    System.out.println(" ");
	    System.out.println("Please enter details to be contacted: ");
	    
	    do {
	    System.out.println("Name: ");
	    name = scan.next();
	    ch = name.charAt(0);
	    if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
	       {
	    	next2 = false;
	       }
	    else 
	    	System.out.println("Invalid name, please enter again");
	    }while(next2);
	    
	    do {
	    System.out.println("Phone number: ");
	    phonenumber = scan.next();
	    ch2 = phonenumber.charAt(0);
	    if (ch2 >= '0' && ch2 <= '9')
	       {
	    	next3 = false;
	       }
	    else 
	    	System.out.println("Invalid phone number, please enter again");
	    }while(next3);
	    
	    do {
    	    System.out.println("Email: ");
    	    email = scan.next();
    	    ch3 = email.charAt(0);
    	    if ((ch3 >= 'A' && ch <= 'Z') || (ch3 >= 'a' && ch <= 'z') || (ch3 >= '0' && ch <= '9') || (ch3 == '@') || (ch3 == '.')) 
    	       {
    	    	next4 = false;
    	       }
    	    else 
    	    	System.out.println("Invalid email, please enter again");
    	    }while(next4);
        
        System.out.println(" ");
        System.out.println("_______________________________________");
        System.out.println("SUMMARY OF ORDER                       |");
        System.out.println("_______________________________________|");
		System.out.println("\nModel of motorcycle: " + model); 
		subtotal = discount1 + discount2 + total3 + discount3;
		System.out.printf("Subtotal: RM %.2f " , subtotal); 
		sst = subtotal*0.1;
		System.out.printf("\nSST: RM %.2f " , sst); 
		finaltotal = subtotal + sst;
		System.out.printf("\nFinal total: RM %.2f " , finaltotal); 
		
                if (finaltotal > 500)
                {
                	finaldiscount = finaltotal*0.2;
                }
                else 
                {
                	finaldiscount = finaltotal*0;
                }
                grandtotal = finaltotal - finaldiscount;
                System.out.printf("\nGrand total: %.2f " , grandtotal); 
   
                System.out.println(" ");
                System.out.println("\nList of other problems: ");{
          		for(int i =0; i<n; i++) {
          			System.out.println(otherProblems[i]);
          		}
                
                System.out.println("\nContact details of customer: "); 
        	    System.out.println("Name: " + name); 
        	    System.out.println("Phone number: " + phonenumber); 
        	    System.out.println("Email: " + email);
        	    System.out.println("_______________________________________");   
            }
                
                {
                    final int m = 5;    
                    int[] customernumber;
                    customernumber = customerNumber(m);
                    System.out.print("Customer's number: ");
                    for (int i = 0; i <customernumber.length; i++)
                    {
                        System.out.print(customernumber[i] + " ");
                        
                    }
                 }
	}
	    public static void showTable() {
        System.out.print("Welcome to System to Calculate Estimated Service Charge");
		
		System.out.println("\n______________________________________________________________________________________________");
		System.out.println("| Braking problems    | Bad Throttle Response | Vibrations or jerking | High Fuel Consumption|");
		System.out.println("|_____________________|_______________________|_______________________|______________________|");
		System.out.println("|Item 1: Brake cable  |Item 1: Carburetor     |Item 1: Shock absorber |Item 1: Clutch plates |");
		System.out.println("|Item 2: Brake pads   |Item 2: Air filter     |Item 2: Chain sprocket |Item 2: Radials       |");
		System.out.println("|Item 3: Brake drums  |Item 3: Fuel filter    |                       |Item 3: Break shoe    |");
		System.out.println("|                     |Item 4: Spark plug     |                       |Item 4: Drum          |");
		System.out.println("|                     |                       |                       |Item 5: Bearings      |");             
		System.out.println("|_____________________|_______________________|_______________________|______________________|");
		System.out.println("50% off will be given for diagnose with more than two items");
	}
	    public static int[] customerNumber(int m)
	    {
	       int[] customernumber2 = new int[m];
	       for (int i = 0; i <customernumber2.length; i++)
	       {
	    	   customernumber2[i] = (int) (Math.random() * 10);
	       }
	      return customernumber2;
	    }
	}
