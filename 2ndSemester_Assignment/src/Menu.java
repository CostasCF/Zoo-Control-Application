public class Menu  {
	public static void main(String[] args) {
		//initializing the ArrayList
		Animals newAnimalArray = new Animals();

		//printing menu items
		printHeader();
		printMenu();

		//calling structure method which includes user's input
		UserDataCapture.structure();
		   
	}
	
    public static void printHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|        Welcome  to Our            |");
        System.out.println("|        ZOO Application            |");
        System.out.println("+-----------------------------------+");
    }

    public static void printMenu() {
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
