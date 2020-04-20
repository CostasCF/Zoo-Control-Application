import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;

public class UserDataInput extends Menu implements java.io.Serializable  {
	
	Scanner scan = new Scanner(System.in);
	// input method is the structure of the program
	public void structure()  {	
		int userAnswer = inputValidInt();
		System.out.println("Your option has been entered!Thank you!");
		while (userAnswer !=7) {
		switch (userAnswer) {
        case 1:
        	ShowAnimals showAnimals = new ShowAnimals();
        	showAnimals.printingArrayList();
            break;
        case 2:
        	AddAnimal myanimal = new AddAnimal();
        	myanimal.newAnimal();
            break;
        case 3: 
        	SearchbyName mysearch = new SearchbyName();
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
		userAnswer = inputValidInt();
		System.out.println("Your option has been entered!Thank you!");
		} 
		if (userAnswer == 7) {
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
	    public int inputValidInt() { //
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
				flag = name.matches("[a-zA-Z�-��-��-��-�]+");
				if (flag == false) {
					System.out.println("Please enter valid characters");
				}
			}
	    	return name;
	    }

}

