import java.util.*;

//creating the menu of the application
public class Menu {
	
	
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.printHeader();
		menu.printMenu();
		userInput myinput = new userInput(); //creating an object of userInput
		myinput.input(); // calling input
		
		
	}
	
    public void printHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|        Welcome   to Our           |");
        System.out.println("|        ZOO Application            |");
        System.out.println("+-----------------------------------+");
    }

    public void printMenu() {
    	System.out.println("Please make a selection");
        System.out.println("1) Show all available animals.");
        System.out.println("2) Add a new animal.");
        System.out.println("3) Search an animal by name.");
        System.out.println("4) Search an animal by id.");
        System.out.println("5) Edit an animal by id.");
        System.out.println("6) Delete an animal by id.");
        System.out.println("7) Exit");
    }
    
}
