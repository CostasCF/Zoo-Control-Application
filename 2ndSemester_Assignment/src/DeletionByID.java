public class DeletionByID extends ShowAnimals{

	UserDataInput input = new UserDataInput();
		 
	void deletingbyID() {
		System.out.println("Please enter the ID of the animal you want to delete.");
		int lead = input.inputValidInt(); //this is a serialized search
		boolean flag = false;
		int position = 0;
		int i = 0;
		int max = Catalog.size();
		while (i < max && flag == false) {
			if (Catalog.get(i).id == lead ) {  //if id of the catalog = the id the user searched for
				flag = true;
				position = i;
			}else {
				i++;
				}
		}  
		
		if (flag == true) {
			Catalog.remove(position); 
			System.out.println("Your animal has been deleted successfully.");
			SavingProgress();


			
		}else {
			System.out.println("Your animal has NOT been found. If your animal doesn't exist, you can select option number 2.");
		}
	}
	

	
}

