import java.util.ArrayList;
import java.util.Scanner;

public class addAnimal extends Menu{
	int id;
	String name;
	String BelongClass;
	double weight;
	double age;
	

	static Scanner scan = new Scanner(System.in);
	static AnimalValidationandInput av = new AnimalValidationandInput();
	
	//this method enters the user's animal data in a new intetity inside the ArrayList
	public static void newAnimal() {
		System.out.println("You chose the 2nd option, please enter a new animal by adding its details one by one!");
		System.out.println("Enter the id of the animal");
		int id = av.inputValidInt();
		System.out.println("Enter the name of the animal.");
		boolean flag = false;
		String name = "" ; // handling name input
		while (!flag) {
			name = scan.nextLine();
			flag = av.StringExceptionHandling(name);
		}
		System.out.println("Enter the biology class of the animal.");
		flag = false;
		String BelongClass = ""; //handling biology class input
		while (!flag) {
			name = scan.nextLine();
			flag = av.StringExceptionHandling(name);
		}
		System.out.println("Enter the weight of the animal.");
		double weight = av.inputValidDouble();
		System.out.println("Enter the age of the animal.");
		double age = av.inputValidDouble();
		Animal animal = new Animal(id, name, BelongClass, weight, age);
		Catalog.add(animal);
	}
	


}