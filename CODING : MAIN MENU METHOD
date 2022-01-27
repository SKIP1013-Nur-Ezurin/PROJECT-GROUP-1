package vehicle;
import java.util.Scanner;
public class MainMenu {
	
//Display main menu method to the users for see the 5 services in the vehicle system
public static void mainMenu() {
		System.out.println("************************************************************************************************");
		System.out.println("*                                                                                              *");
		System.out.println("*                               GROUP 1 SKIP 1013 GROUP PROJECT                                *");
		System.out.println("*                                   WELCOME TO VEHICLE SYSTEM                                  *");
		System.out.println("*                                THE BEST SERVICES FOR YOUR DAY                                *");
		System.out.println("*                       PLAESE CHOOSE YOUR SERVICES THAT YOU INTERESTED                        *");
		System.out.println("*                                                                                              *");
		System.out.println("************************************************************************************************");
		System.out.println("*            ONCE YOU ENTER THE INPUT OF THE CHOICE YOU WILL DIRECTLY ENTER THE SYSTEM         *");
		System.out.println("* 1. Flight Reservation System                                                                 *");
		System.out.println("* 2. Cruise Dining System                                                                      *");
		System.out.println("* 3. Motorcycle Service Charge System                                                          *");
		System.out.println("* 4. Train Ticket System                                                                       *");
		System.out.println("* 5. Car Performance Tuning System                                                             *");
		System.out.println("* CLICK 0 TO EXIT THE MAIN MENU                                                                *");
		System.out.println("************************************************************************************************");
}

//display main method 
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		mainMenu(); // calls for mainMenu () to display
		
		LogIn l = new LogIn(); //calls for LogIn method
		l.main(args);// LogIn to create the account and check username, and passwords
		
		char option;
		boolean isTerminate = true;
		Scanner scan = new Scanner (System.in);
		System.out.print("PLEASE ENTER YOUR CHOICE : ");	//ask user for input the choice in integer
		System.out.print("THE OUTPUT ACCEPTED ONLY 1/2/3/4/5/0 : ");
			
		int vehicle = scan.nextInt();
		
		//users choose aircraft system (Flight Reservation System)
		if (vehicle == 1) {
			Aircraft a = new Aircraft();
			a.main(args);
		}
		
		//users choose cruise system (Cruise Dining System)
		else if  (vehicle == 2) {
			Cruise c = new Cruise();
			c .main(args);
		}
		
		//users choose motorcycle system (Motorcycle Service Charge System)
		else if  (vehicle == 3) {
			Motorcycle m = new Motorcycle();
			m .main(args);
		}
		
		//users choose train system (Train Ticket System)
		else if  (vehicle == 4) {
			Train t = new Train();
			t .main(args);
		}
		
		//users choose cars system (Car Performance Tuning System)
		else if  (vehicle == 5) {
			Cars c = new Cars();
			c.main(args);
		}
		
		//users choose to exit the system
		else if (vehicle == 0) {
			isTerminate = false;
		}
		
		//users enter wrong output during the user prompt
		else 
		{
			System.out.println("Wrong. Please entered the correct input only");
			System.out.println("The correct input is : ");
			System.out.println("// 1: Flight Reservation System )");
			System.out.println("// 2 : Cruise Dining System ");
			System.out.println("// 3 : Motorcycle Service Charge System ");
			System.out.println("// 4 : Train Ticket System ");
			System.out.println("// 5 : Car Performance Tuning System ");
		}
		
		//display the output for the last system after been used
		System.out.println("");	
		System.out.println("THANK YOU FOR USING OUR VEHICLE SYSTEM!");
		System.out.println("      HAVE A NICE DAY ^_^     ");
		System.out.println("");
		System.out.println("Prepared By: GROUP 1 VEHICLE ");
		System.out.println("");
		
	}
}


