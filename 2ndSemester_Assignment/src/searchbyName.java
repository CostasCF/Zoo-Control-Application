
public class searchbyName extends showAnimals {
	
	Animal animal = new Animal(id, name, BelongClass, weight, age);
	userInput input = new userInput();
	
	void ByName() {
		System.out.println("Enter the name of the animal you want to search for.");
		String lead = input.getName(); //this is a serialized search
		boolean flag = false;
		int position = 0;
		int i = 0;
		int max = Catalog.size();
		while (i < max && flag == false) {
			if (Catalog.get(i).name.equals(lead) ) {  //if name of the catalog = the name the user searched for
				flag = true;
				position = i;
			}else {
				i++;
				}
		}  
		if (flag == true) {
			System.out.println("Your animal has been found.");
			Catalog.get(position).PrintA();
		}else {
			System.out.println("Your animal has NOT been found. If your animal doesn't exist, you can select option number 2.");
		}
	}
		
	

}
