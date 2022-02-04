package com.revature.bankingApplication.menus;

import java.io.BufferedReader;


public abstract class Menu {
	
	protected String name;
	protected String route;
	protected BufferedReader consoleReader;
	
	public Menu(String name, String route, BufferedReader consoleReader) {
		super();
		this.name = name;
		this.route = route;
		this.consoleReader = consoleReader;
	}

	public String getName() {
		return name;
	}

	public String getRoute() {
		return route;
	}
	
	
	public abstract void render() throws Exception;
	
	
	
	
	//Here we are going to make the abstract class that all of the menus will use to get user input/output
    
	
}
