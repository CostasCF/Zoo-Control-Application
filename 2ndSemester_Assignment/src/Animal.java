import java.util.ArrayList;

public class Animal {
	/*int id;
	String name;
	String BelongClass;
	double weight;
	double age;
	*/
	

	AnimalValidationandInput callingInputs = new AnimalValidationandInput(); //creating object of the Animal class in order to call validations

	//building the constructor in order to initiate the variables of the ArrayList
	public void adderAnimal(int id, String name, String BelongClass, double weight, double age){
		ArrayList<Animal> CataLog = new ArrayList<Animal>();
		System.out.println("Please enter the animal id!");
		int id = callingInputs.inputValidInt();
		CataLog.add(id);

	}
}
