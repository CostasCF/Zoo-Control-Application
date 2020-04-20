import java.util.ArrayList;
import java.util.Scanner;
import java.io.*; 

public class addAnimal extends Menu implements Serializable{ //inherits from menu class the major creation of the ArrayList

	int id;
	String name;
	String BelongClass;
	double weight;
	double age;
	
	static Scanner scan = new Scanner(System.in);
	static userInput av = new userInput();
	
	//this method enters the user's animal data in a new intetity inside the ArrayList
	public void newAnimal() {
		System.out.println("You chose the 2nd option, please enter a new animal by adding its details one by one!");
		//---- Id of the animal's input-------------------------------------------------------
		System.out.println("Enter the id of the animal");
		int id = av.inputValidInt();
		//-----Name of the Animal input----------------------------------------------------------------
		System.out.println("Enter the name of the animal.");
		boolean flag = false;
		String name = "" ; // handling name input
		while (!flag) {
			name = scan.nextLine();
			flag = av.StringExceptionHandling(name);
			if (flag == false) {
				System.out.println("Please enter valid characters");
			}
		}
		//----------Biology class input----------------------------------------------------------------
		System.out.println("Enter the biology class of the animal.");
		flag = false;
		String BelongClass = ""; //handling biology class input
		while (!flag) { 
			BelongClass = scan.nextLine();
			flag = av.StringExceptionHandling(BelongClass);
			if (flag == false) {
				System.out.println("Please enter valid characters");
			}
		}
		//--------weight and age input--------------------------------------------------------
		System.out.println("Enter the weight of the animal.");
		double weight = av.inputValidDouble();
		System.out.println("Enter the age of the animal.");
		double age = av.inputValidDouble();
		Animal animal = new Animal(id, name, BelongClass, weight, age);
		Catalog.add(animal);
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
					  
					System.out.println("Object has been serialized"); 
		  
				} 
				  
				catch(IOException ex) 
				{ 
					System.out.println("IOException is caught"); 
				} 
		  
	}
	


}