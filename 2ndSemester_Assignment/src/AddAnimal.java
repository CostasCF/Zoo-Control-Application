public class AddAnimal extends Animals implements java.io.Serializable {

	/**
	 * Adds an new animal in the catalog
	 */
	public void addAnimal() {
		OpenData();
		System.out.println("You chose the 2nd option, please enter a new animal by adding its details one by one!");
		//Id of the animal's input
		System.out.println("Enter the id of the new animal.");
		id = inputValidInt();
		//Name of the Animal input
		System.out.println("Enter the name of the new animal.");
		name = inputValidString();
		//Biology class input
		System.out.println("Enter the biology class of the new animal.");
		BelongClass = inputValidString();
		//weight input
		System.out.println("Enter the average weight of the new animal.");
		weight = inputValidDouble();
		//age input
		System.out.println("Enter the lifespan of the new animal.");
		age = inputValidDouble();
		Animals animal = new Animals(id, name, BelongClass, weight, age);
		Catalog.add(animal);
		SaveData(Catalog);
	}
}