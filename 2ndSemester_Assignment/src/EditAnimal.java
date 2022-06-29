public class EditAnimal extends Animals {

	/**
	 * Edits the elements of an animal
	 */
	public void editAnimalByID() {
		//this is a serialized search
		OpenData();
		System.out.println("Please enter the ID of the animal you want to edit.");
		int id = inputValidInt();
		boolean flag = false;
		int position = 0;
		int i = 0;
		int max = Catalog.size();
		while (i < max && !flag) {
			//if id of the catalog = the id the user searched for
			if (Catalog.get(i).id == id ) {
				flag = true;
				position = i;
			}else {
				i++;
				}
		}

		if (flag) {
			System.out.println("Your animal has been found.");
			Catalog.get(position).printAnimalElements();
			/*
			 * There is an if statement that if it's true, then the animal that the user wants to edit has been found. 
			 * Later on, the users selects a number(choice) he wants to edit inside a while loop that terminates only if users selects number 6 to quit editing.
			 */
			
			boolean returnToMenu = false;
			while (!returnToMenu) {
				System.out.println("Please select the number you want to edit. Select number 6 if you want to quit editing.");
				int choice = inputValidInt();
				 switch (choice) {
				 case 1:
					 System.out.println("Please enter the new animal id.");
					 Catalog.get(position).id = inputValidInt();
					 System.out.println("Successfully edited!");
					 break;
				 case 2:
					 System.out.println("Please enter the new animal name.");
					 Catalog.get(position).name = inputValidString();
					 System.out.println("Successfully edited!");
					 break;
				 case 3:
					 System.out.println("Please enter the new biology class of the animal.");
					 Catalog.get(position).BelongClass = inputValidString();
					 System.out.println("Successfully edited!");
					 break;
				 case 4:
					 System.out.println("Please enter the new average weight of the animal.");
					 Catalog.get(position).weight = inputValidDouble();
					 System.out.println("Successfully edited!");
					 break;
				 case 5:
					 System.out.println("Please enter the new maximum age of the animal.");
					 Catalog.get(position).age = inputValidDouble();
					 System.out.println("Successfully edited!");
					 break;
				 case 6:
					 returnToMenu = true;
					 SaveData(Catalog);
					 break;
				 }
		}
			
		}else {
			System.out.println("Your animal has NOT been found. If your animal doesn't exist, you can select option number 2.");
		}
		
	}
}
