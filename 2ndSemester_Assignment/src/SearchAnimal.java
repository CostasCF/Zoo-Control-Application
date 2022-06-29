public class SearchAnimal extends Animals {

	/**
	 * Searches an animal by a given ID
	 */
	public void searchByID() {
		OpenData();
		System.out.println("Please enter the ID of the animal.");
		int lead = UserDataCapture.inputValidInt();
		boolean flag = false;
		int position = 0;
		int i = 0;
		int max = Catalog.size();
		//this is a serialized search
		while (i < max && !flag) {
			//if id of the catalog = the id the user searched for
			if (Catalog.get(i).id == lead ) {
				flag = true;
				position = i;
			}else {
				i++; 
				}
		} 
		if (flag) {
			System.out.println("Your animal has been found.");
			Catalog.get(position).printAnimalElements();

			
		}else {
			System.out.println("Your animal has NOT been found. If your animal doesn't exist, you can select option number 2.");
		}
	}

	/**
	 * Searches an animal by a given name
	 */
	public void searchAnimalByName() {
		OpenData();
		System.out.println("Enter the name of the animal you want to search for.");
		String lead = inputValidString();
		boolean flag = false;
		int position = 0;
		int i = 0;
		int max = Catalog.size();
		//this is a serialized search
		while (i < max && !flag) {
			//if name of the catalog = the name the user searched for
			if (Catalog.get(i).name.equalsIgnoreCase(lead)) {
				flag = true;
				position = i;
			}else {
				i++;
			}
		}
		if (flag) {
			System.out.println("Your animal has been found.");
			Catalog.get(position).printAnimalElements();
		}else {
			System.out.println("Your animal has NOT been found. If your animal doesn't exist, you can select option number 2.");
		}
	}
}
