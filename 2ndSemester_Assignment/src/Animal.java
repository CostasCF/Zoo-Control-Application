import java.util.ArrayList;

public class Animal {
	int id;
	String name;
	String BelongClass;
	double weight;
	double age;
	
	
	//creating object of the Animal class in order to call validations
	AnimalValidationandInput callingInputs = new AnimalValidationandInput(); 

	//building the constructor in order to initiate the variables of the ArrayList
	public Animal(int id, String name, String BelongClass, double weight, double age){
		this.id = id;
		this.name = name;
		this.BelongClass = BelongClass;
		this.weight = weight;
		this.age = age;
	}
}