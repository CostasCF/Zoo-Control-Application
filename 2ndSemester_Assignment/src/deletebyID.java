
public class deletebyID extends showAnimals {
	Animal animal = new Animal(id, name, BelongClass, weight, age);
	userInput input = new userInput();
	
	void ByID() {
		System.out.println("Please enter the ID of the animal you want to delete.");
		int lead = input.inputValidInt(); //this is a serialized search
		boolean flag = false;
		int position = 0;
		int i = 0;
		int max = Catalog.size();
		while (i < max && flag == false) {
			if (Catalog.get(i).id == lead ) {  //if name of the catalog = the name the user searched for
				flag = true;
				position = i;
			}else {
				i++;
				}
		} 
		if (flag == true) {
			System.out.println("Your animal has been deleted successfully.");
			clear1(position);

			
		}else {
			System.out.println("Your animal has NOT been found. If your animal doesn't exist, you can select option number 2.");
		}
	}
	
	int clear1(position) {
		
		
	}
}
