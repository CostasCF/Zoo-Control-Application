public class AnimalArray extends Menu { //inherits from Menu class the initiation of the variables


	//building the constructor in order to initiate the variables of the ArrayList
	public AnimalArray(int id, String name, String BelongClass, double weight, double age) {

		this.id = id;
		this.name = name;
		this.BelongClass = BelongClass;
		this.weight = weight;
		this.age = age;

	}
	public void printingArrayObjects() {
		System.out.println("-----------------------------------------");
		System.out.println(" 1. ID of the animal:" + id);               
		System.out.println(" 2. Name:" + name);
		System.out.println(" 3. Biology Class:" + BelongClass ); 
		System.out.println(" 4. Average weight:"+ weight + "kg");
		System.out.println(" 5. Max life span:" + age + "years");
		System.out.println("-----------------------------------------");
	}


}

