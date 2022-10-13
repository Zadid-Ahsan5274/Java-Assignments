/* 
   6. Suppose a software system excepts valid credentials from user to logged in to the system. if the user inputs 
      wrong password for 3 times, system will say that "Your user has been temporary locked". 
      Let the username: admin, password: adm1n
 */

package arrays_and_functions;

import java.util.Scanner;

public class LoginToSystem {

	public static void main(String[] args) {

		try {
			Scanner input = new Scanner(System.in);
			String username;
			String password;
			for (int i = 1; i <= 3; i++) {
				if (i == 1) {
					System.out.print("Enter username: ");
					username = input.next();
					System.out.print("Enter password: ");
					password = input.next();
					if (username.equals("admin") && password.equals("adm1n")) {
						System.out.println("Welcome to your dashboard");
						break;
					} else {
						System.out.println("Invalid credentials. Try again!");
					}
				}
				if (i == 2) {
					System.out.print("Enter username: ");
					username = input.next();
					System.out.print("Enter password: ");
					password = input.next();
					if (username.equals("admin") && password.equals("adm1n")) {
						System.out.println("Welcome to your dashboard");
						break;
					} else {
						System.out.println("Invalid credentials. Try again!");
					}
				}
				if (i == 3) {
					System.out.print("Enter username: ");
					username = input.next();
					System.out.print("Enter password: ");
					password = input.next();
					if (username.equals("admin") && password.equals("adm1n")) {
						System.out.println("Welcome to your dashboard");
						break;
					} else {
						System.out.println("You have entered wrong credentials 3 times!!!");
						System.out.println("Your user has been temporary locked");
					}
				}
			}

		} catch (Exception e) {
			System.out.println("Please enter valid data: " + e);
		}
	}
}