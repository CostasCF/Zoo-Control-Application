import java.util.ArrayList;
import java.util.Scanner;
import java.io.*; 

public class AddAnimal extends Menu implements java.io.Serializable { //inherits from menu class the major creation of the ArrayList

	int id;
	String name;
	String BelongClass;
	double weight;
	double age; 
	
	static UserDataInput myinput = new UserDataInput();
	
	//this method enters the user's animal data in a new intetity inside the ArrayList
	public void newAnimal() {
		System.out.println("You chose the 2nd option, please enter a new animal by adding its details one by one!");
		//---- Id of the animal's input-------------------------------------------------------
		System.out.println("Enter the id of the new animal.");
		int id = myinput.inputValidInt();
		//-----Name of the Animal input----------------------------------------------------------------
		System.out.println("Enter the name of the new animal.");
		name = myinput.inputValidString();
		//----------Biology class input----------------------------------------------------------------
		System.out.println("Enter the biology class of the new animal.");
		BelongClass = myinput.inputValidString();
		//--------weight input--------------------------------------------------------
		System.out.println("Enter the weight of the new animal.");
		double weight = myinput.inputValidDouble();
		//-------- age input--------------------------------------------------------
		System.out.println("Enter the age of the new animal.");
		double age = myinput.inputValidDouble();
		AnimalArray animal = new AnimalArray(id, name, BelongClass, weight, age);
		Catalog.add(animal);
		SavingProgress();
	}
	


}