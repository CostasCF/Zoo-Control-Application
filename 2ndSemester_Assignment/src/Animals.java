import java.util.ArrayList;

public class Animals extends UserDataCapture implements java.io.Serializable { //inherits from Menu class the initiation of the variables
	// ArrayList's variables initiation
	public int id;
	public String name;
	public String BelongClass;
	public double weight;
	public double age;
	//creating the ArrayList
	public static ArrayList<Animals> Catalog;

	/**
	 * 	building the constructor in order to initiate the variables of the ArrayList
	 */
	public Animals(int id, String name, String BelongClass, double weight, double age) {
		this.id = id;
		this.name = name;
		this.BelongClass = BelongClass;
		this.weight = weight;
		this.age = age;
	}

	public Animals(){
		Catalog = new ArrayList<Animals>();
	}

	public void printAnimalElements() {
		System.out.println("-----------------------------------------");
		System.out.println(" 1. ID of the animal:" + id);               
		System.out.println(" 2. Name:" + name);
		System.out.println(" 3. Biology Class:" + BelongClass ); 
		System.out.println(" 4. Average weight:"+ weight + "kg");
		System.out.println(" 5. Max life span:" + age + "years");
		System.out.println("-----------------------------------------");
	}


}

