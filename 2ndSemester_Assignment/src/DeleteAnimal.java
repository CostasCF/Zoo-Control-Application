public class DeleteAnimal extends Animals {

	/**
	 * Deletes an animal by a given ID
	 */
	public void deleteAnimalByID() {
		OpenData();
		System.out.println("Please enter the ID of the animal you want to delete.");
		//this is a serialized search
		int animalID = inputValidInt();
		boolean flag = false;
		int position = 0;
		int i = 0;
		int max = Catalog.size();
		while (i < max && !flag) {
			//if id of the catalog = the id the user searched for
			if (Catalog.get(i).id == animalID ) {
				flag = true;
				position = i;
			}else {
				i++;
				}
		}  
		
		if (flag) {
			Catalog.remove(position);
			System.out.println("Your animal has been deleted successfully.");
			SaveData(Catalog);
		}else {
			System.out.println("Your animal has NOT been found. If your animal doesn't exist, you can select option number 2.");
		}
	}
	
}

