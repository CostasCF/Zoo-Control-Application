package com.sample;

public class Menu {
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.printHeader();
		menu.printMenu();
	}
	
    public void printHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|        Welcome   to Our           |");
        System.out.println("|        Menu Application           |");
        System.out.println("+-----------------------------------+");
    }

    public void printMenu() {
    	System.out.println("Please make a selection");
        System.out.println("1) Create a new Account");
        System.out.println("2) Make a deposit");
        System.out.println("3) Make a withdrawal");
        System.out.println("4) List account balance");
        System.out.println("0) Exit");
    }
    
}
