package vehicle;
import java.util.Scanner;
public class LogIn {
	private static final int PASSWORD_LENGTH = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CREATE YOUR ACCOUNT IN THE SYSTEM FOR FREE! ");
		Scanner a = new Scanner(System.in);
		String name, username;
		System.out.println("Please insert your full name: ");
		name = a.nextLine();
		System.out.println("Please insert your username: ");
		username = a.nextLine();
		final int PASSWORD_LENGTH = 8;
			Scanner input = new Scanner (System.in);
		    System.out.print(
		    "CREATE YOUR OWN PASSWORD\n" +
		        		"Terms and Conditions :\n" +
		                "1. A password must have at least eight characters.\n" +
		                "2. A password consists of only letters and digits.\n" +
		                "3. A password must contain at least two digits \n" +
		                "Input a password (You are agreeing to the above Terms and Conditions.): ");
		        String s = input.nextLine();

		        if (is_Valid_Password(s)) {
		            System.out.println("Password is valid: " + s);
		        } else {
		            System.out.println("Not a valid password: " + s);
		        }

		    }

		    public static boolean is_Valid_Password(String password) {

		        if (password.length() < PASSWORD_LENGTH) return false;

		        int charCount = 0;
		        int numCount = 0;
		        for (int i = 0; i < password.length(); i++) {

		            char ch = password.charAt(i);

		            if (is_Numeric(ch)) numCount++;
		            else if (is_Letter(ch)) charCount++;
		            else return false;
		        }


		        return (charCount >= 2 && numCount >= 2);
		    }

		    public static boolean is_Letter(char ch) {
		        ch = Character.toUpperCase(ch);
		        return (ch >= 'A' && ch <= 'Z');
		    }


		    public static boolean is_Numeric(char ch) {

		        return (ch >= '0' && ch <= '9');
		    }

	}


