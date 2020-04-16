
//creating the menu of the application
public class Menu {
	public static void main(String[] args) {
		userInput myinput = new userInput(); //creating an object of userInput
		myinput.input(); // calling input
		Menu menu = new Menu();
		menu.printHeader();
		menu.printMenu();
	}
    public void printHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|        Welcome   to Our           |");
        System.out.println("|        ZOO Application            |");
        System.out.println("+-----------------------------------+");
    }

    public void printMenu() {
    	System.out.println("Please make a selection");
        System.out.println("1) Προβολή όλων των διαθεσιμων ζώων του ζωολογικού κήπου");
        System.out.println("2) Προσθήκη νέου ζώου");
        System.out.println("3) Αναζήτηση ζώου βάσει ονόματος");
        System.out.println("4) Αναζήτηση ζώου βάσει κωδικού");
        System.out.println("5) Επεξεργασία ζώου βάσει κωδικού");
        System.out.println("6) Διαγραφή ζώου βάσει κωδικού");
        System.out.println("7) Exit");
    }
    
}
