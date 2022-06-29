import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UserDataCapture implements java.io.Serializable {

	//creating the data file
	static String filename = "animalData.ser";

	/**
	 * Captures user's input and handles the operations
	 */
	public static void structure()  {	
		int myinput = inputValidInt();
		while (myinput !=7) {
			switch (myinput) {
			case 1:
				ShowAnimals showAnimals = new ShowAnimals();
				showAnimals.printCatalog();
				break;
			case 2:
				AddAnimal addAnimal = new AddAnimal();
				addAnimal.addAnimal();
				break;
			case 3:
				SearchAnimal searchByName = new SearchAnimal();
				searchByName.searchAnimalByName();
				break;
			case 4:
				SearchAnimal searchByID = new SearchAnimal();
				searchByID.searchByID();
				break;
			case 5:
				EditAnimal editByID = new EditAnimal();
				editByID.editAnimalByID();
				break;
			case 6:
				DeleteAnimal deletionByID = new DeleteAnimal();
				deletionByID.deleteAnimalByID();
				break;
			}
		System.out.println("Enter an option.");
		myinput = inputValidInt();
		}
	System.out.println("Program ended");

	}

	/**
	 * Checks if the user's input is double
	 * @return returns user's input
	 */
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
				input.close();
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
				input.close();
	        }
	        return num;
	    }
	    
	    //checks if the user's input is string
	    public String inputValidString() {
			Scanner input = new Scanner(System.in);
	    	boolean flag;
	    	String name;
			flag = false;
			name = ""; //handling name input
			while (!flag) { 
				name = input.nextLine();
				flag = name.matches("[a-zA-Z�-��-��-��-�]+");
				if (flag == false) {
					System.out.println("Please enter valid characters");
				}
			}
	    	return name;
	    }

	/**
	 * Saves data into a serializable file
	 * @param Catalog An ArrayList of type Animals
	 */
	public static void SaveData(ArrayList<Animals> Catalog) {
		// Serialization
		try
		{
			//Saving of object in a file

			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(Catalog);

			out.close();
			file.close();

			System.out.println("File has been saved.");

		} catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}

	}

	/**
	 * Loads data from a serializable file and updates Catalog (ArrayList of type Animals)
	 */
	public static void OpenData() {
		// Deserialization
		try
		{
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			// Method for deserialization of object
			//casting to ArrayList<Animals>
			Animals.Catalog = (ArrayList<Animals>)in.readObject();
			System.out.println("File has been loaded.");

			in.close();
		}
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}


	}
}

/*								 	        A diagram of the classes' heredity
 * 												UserDataCapture (SuperClass)
 * 									  						|
 * 						       							Animals(subclass)
 * 															|
 * 														(subclasses)
 *				 		  AddAnimal		 SearchAnimal	  <-|->  		DeleteAnimal	  ShowAnimals	  EditAnimal
 * 
 */






