package com.revature.bankingApplication.menus;

public class CreateAccountMenu extends Menu {
	

	BankingService BankingService;

	public RegisterMenu(BufferedReader consoleReader, MenuRouter router, ScientistService scientistService) {
		super("Register", "/register", consoleReader, router);
		this.scientistService = scientistService;
	}

	@Override
	public void render() throws Exception {
		// TODO Auto-generated method stub
				System.out.println("The User has decided to open an account");

				// Things to obtain from user: first name, last name, email,username, password

				System.out.println("Please provided us with some basic information");
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
		
	}



