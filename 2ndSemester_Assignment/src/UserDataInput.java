import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;

public class UserDataInput {
	
	Scanner scan = new Scanner(System.in);
	// input method is the structure of the program
	public static void structure()  {	
		int myinput = inputValidInt();
		System.out.println("Your option has been entered!Thank you!");
		while (myinput !=7) {
		switch (myinput) {
        case 1:
        	ShowAnimals showAnimals = new ShowAnimals();
        	showAnimals.printingArrayList();
            break;
        case 2:
        	AddAnimal myanimal = new AddAnimal();
        	myanimal.newAnimal();
            break;
        case 3: 
        	SearchByName mysearch = new SearchByName();
        	mysearch.searchingbyName();
            break;
        case 4:
        	SearchByID myIDsearch = new SearchByID();
        	myIDsearch.searchingbyID();
            break; 
        case 5:
        	EditByID myEdit = new EditByID();
        	myEdit.editingbyID();
            break;
        case 6:
        	DeletionByID mydeletion = new DeletionByID();
        	mydeletion.deletingbyID();
            break;
			}
		myinput = inputValidInt();
		System.out.println("Your option has been entered!Thank you!");
		} 
		if (myinput == 7) {
			System.out.println("Program ended");
		}
			
	}
	
		// Checks if the user's input is double
	    public double inputValidDouble() {
	        double num;
	        while(true) {
	            Scanner input = new Scanner(System.in);
	            try {
	                num = input.nextDouble();
	                break;
	            } catch (InputMismatchException e) {
	                System.out.println("Wrong data type, please try again.");
	            }
	        }
	        return num;
	    }

	    // Checks if the user's input is integer
	    public static int inputValidInt() { //
	        int num;
	        while(true) {
	            Scanner input = new Scanner(System.in);
	            try {
	                num = input.nextInt();
	                break;
	            } catch (InputMismatchException e) {
	                System.out.println("Wrong data type, please try again.");
	            }
	        }
	        return num;
	    }
	    
	    //checks if the user's input is string
	    public String inputValidString() {
	    	boolean flag;
	    	String name;
			flag = false;
			name = ""; //handling name input
			while (!flag) { 
				name = scan.nextLine();
				flag = name.matches("[a-zA-Zá-ùÁ-ÙÜ-þ¢-¿]+");
				if (flag == false) {
					System.out.println("Please enter valid characters");
				}
			}
	    	return name;
	    }

}

/*								 		A diagram of the classes' heredity
 * 											UserDataInput (SuperClass)
 * 													|
 * 												  Menu (subclass)
 * 													|
 * AddAnimal	ShowAnimals		AnimalArray		SearchByID	  SearchByName	  EditByID	  DeletionByID
 * 
 */






