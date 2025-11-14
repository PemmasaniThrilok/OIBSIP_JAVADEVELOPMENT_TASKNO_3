package atminterface;
import java.util.Scanner;
public class task {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        

	        System.out.println("SIMPLE ATM");

	        // Login
	        System.out.print("Enter User ID: ");
	        int idInput = sc.nextInt();

	        System.out.print("Enter PIN: ");
	        int pinInput = sc.nextInt();
	        
	        int userId = 1234;
	        int pin = 1111;
	        double balance = 5000;

	        if (idInput == userId && pinInput == pin) {
	            System.out.println("Login Successful");
	        } else {
	            System.out.println("Invalid");
	            return;
	        }

	        while (true) {
	            System.out.println("ATM MENU");
	            System.out.println("1. Balance Check");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Quit");
	            System.out.print("Enter choice: ");

	            int option = sc.nextInt();

	            switch (option) {

	                case 1:
	                    System.out.println("Your Balance: ₹" + balance);
	                    break;

	                case 2:
	                    System.out.print("Enter deposit amount: ");
	                    double deposit = sc.nextDouble();
	                    balance += deposit;
	                    System.out.println("Deposit Successful");
	                    break;

	                case 3:
	                    System.out.print("Enter withdraw amount: ");
	                    double withdraw = sc.nextDouble();
	                    if (withdraw > balance) {
	                        System.out.println("Insufficient Balance");
	                    } else {
	                        balance -= withdraw;
	                        System.out.println("Withdrawal Successful");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Thank you Visit Again");
	                    return;

	                default:
	                    System.out.println("Invalid Choice");
	            }
	        
	    }
	}


}
