package com.revature.bankingApplication.util;

import java.io.BufferedReader;

public class AppState {
	
	private static boolean isRunning;
	private final MenuRouter router;
	
	public AppState() {
		isRunning = true;
		router = new MenuRouter();
		BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
		
		BankingService bankingtService = new BankingService();
		router.addMenu(new WelcomeMenu(consoleReader, router));
		router.addMenu(new CreateAccountMenu(consoleReader, router, BankingService));
		router.addMenu(new LoginMenu(consoleReader, router, BankingService));
	}
	
	public void startup() {
		try {
			while(isRunning) {
				router.transfer("/welcome");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void shutdown() {
		isRunning = false;
	}
	