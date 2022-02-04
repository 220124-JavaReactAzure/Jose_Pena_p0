package com.revature.bankingApplication.menus;

import java.io.BufferedReader;

public class LoginMenu extends Menu {

	public LoginMenu(String name, String route, BufferedReader consoleReader) {
		super(name, route, consoleReader);
		// TODO Auto-generated constructor stub
		
		@Override
		public void render() throws Exception {
			// TODO Auto-generated method stub
					System.out.println("The User has decided to open an account");

					// Things to obtain from user: first name, last name, email,username, password

					System.out.println("Please provide us with your login credentials");
					System.out.print("First Name: ");
					String firstName = consoleReader.readLine();

					System.out.print("Last Name: ");
					String lastName = consoleReader.readLine();

					System.out.print("Email: ");
					String email = consoleReader.readLine();

					System.out.print("Username: ");
					String username = consoleReader.readLine();

					System.out.print("Password: ");
					String password = consoleReader.readLine();

					Scientist scientist = new Scientist(firstName, lastName, email, username, password);

					try {
						BankingService.registerNewClient(client);
					} catch (InvalidRequestException e) {
						// TODO Auto-generated catch block
						// e.printStackTrace(); 
						System.out.println("YOU HAVE PROVIDED INVALID DATA PLEASE TRY AGAIN\n\n\n");

						router.transfer("/welcome");
	}

}
