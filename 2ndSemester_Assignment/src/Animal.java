import java.util.ArrayList;

public class Animal extends showAnimals { //inherits the initiation of the variables that


	//building the constructor in order to initiate the variables of the ArrayList
	public Animal(int id, String name, String BelongClass, double weight, double age) {

		this.id = id;
		this.name = name;
		this.BelongClass = BelongClass;
		this.weight = weight;
		this.age = age;
	}
}


/* class inheritance in order from the "Superclass" to "LowerClass"
 * Menu 
 * addAnimal (inherits the creation of the ArrayList Catalog)
 * showAnimals (inherits the initiation of the variables used by the ArrayList)
 * Animal (inherits the initiation of the variables used by the ArrayList)
 */
	
	