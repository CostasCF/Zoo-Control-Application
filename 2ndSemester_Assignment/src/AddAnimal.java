import java.util.ArrayList;
import java.util.Scanner;
import java.io.*; 

public class AddAnimal extends Menu implements java.io.Serializable { 

	//this method enters the user's animal data in a new identity inside the ArrayList
	public void newAnimal() {
		System.out.println("You chose the 2nd option, please enter a new animal by adding its details one by one!");
		//---- Id of the animal's input-------------------------------------------------------
		System.out.println("Enter the id of the new animal.");
		int id = inputValidInt();
		//-----Name of the Animal input----------------------------------------------------------------
		System.out.println("Enter the name of the new animal.");
		name = inputValidString();
		//----------Biology class input----------------------------------------------------------------
		System.out.println("Enter the biology class of the new animal.");
		BelongClass = inputValidString();
		//--------weight input--------------------------------------------------------
		System.out.println("Enter the weight of the new animal.");
		double weight = inputValidDouble();
		//-------- age input--------------------------------------------------------
		System.out.println("Enter the age of the new animal.");
		double age = inputValidDouble();
		AnimalArray animal = new AnimalArray(id, name, BelongClass, weight, age);
		Catalog.add(animal);
		SavingProgress();
	}
	


}