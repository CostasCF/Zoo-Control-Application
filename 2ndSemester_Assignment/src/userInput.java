import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;

public class userInput extends Menu implements java.io.Serializable  {
	Scanner scan = new Scanner(System.in);

	// handling the first input the user enters which is a number between 1 to 7
	public static int  inputValidation() { 
        int num;
        while(true) {
    		Scanner myInput = new Scanner(System.in); //creating a Scanner Object
    		System.out.println("Enter an option");
            try {
                num = myInput.nextInt();
        		System.out.println("Your option has been entered!Thank you!");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number ranging from 1 to 7!");
            }
        }
        return num;
    }

	
	// input method is the structure of the program
	public void input()  {	
		int userAnswer = userInput.inputValidation();
		
		while (userAnswer !=7) {
		switch (userAnswer) {
        case 1:
        	showAnimals showAnimals = new showAnimals();
        	showAnimals.Show();
            break;
        case 2:
        	addAnimal myanimal = new addAnimal();
        	myanimal.newAnimal();
            break;
        case 3: 
        	searchbyName mysearch = new searchbyName();
        	mysearch.ByName();
            break;
        case 4:
        	searchbyID myIDsearch = new searchbyID();
        	myIDsearch.ByID();
            break; 
        case 5:
        	editbyID myEdit = new editbyID();
        	myEdit.editID();
            break;
        case 6:
        	deletebyID mydeletion = new deletebyID();
        	mydeletion.deletionByID();
            break;
			}
		userAnswer = userInput.inputValidation();
		} 
		if (userAnswer == 7) {
			System.out.println("Program ended");
		}
			
	}
	
	  //checks if the user input is string (*requires additional loop for proper validation where is needed)
		public static boolean StringExceptionHandling(String name) {
		        return name.matches("[a-zA-Z�-��-��-��-�]+"); // This takes into account Greek accents too
		    }
		

 
		// Checks if the user input is type-double
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

	    // Checks if the user input is type-int
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
	    
	    //gets name
	    public String getName() {
	    	boolean flag;
	    	String name;
			flag = false;
			name = ""; //handling name input
			while (!flag) { 
				name = scan.nextLine();
				flag = userInput.StringExceptionHandling(name);
				if (flag == false) {
					System.out.println("Please enter valid characters");
				}
			}
	    	return name;
	    }

}

