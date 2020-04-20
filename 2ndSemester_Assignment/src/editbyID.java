
public class editbyID extends searchbyID{
	public void editID() {
		System.out.println("Please enter the ID of the animal you want to edit.");
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
			System.out.println("Your animal has been found.");
			Catalog.get(position).PrintA();
			/*
			 * There is an if statement that if it's true, then the animal that the user wants to edit has been found. 
			 * Later on, the users selects a number(choice) he wants to edit inside a while loop that terminates only if users selects number 6 to quit editing.
			 * I know the code might seem a bit complicated, but the logic behind it is very simple.
			 */
			
			boolean returnToMenu = false;
			while (returnToMenu == false) { 
			System.out.println("Please select the number you want to edit. Select number 6 if you want to quit editing.");
			int choice = input.inputValidInt();
			 switch (choice) {
	         case 1:
	             System.out.println("Please enter the new animal id.");
	             int newID = input.inputValidInt();
	             Catalog.get(position).id = newID;
	             System.out.println("Successfully edited!");
	             break;
	         case 2:
	             System.out.println("Please enter the new animal name.");
	             String newName = input.getName();
	             Catalog.get(position).name = newName;
	             System.out.println("Successfully edited!");
	             break;
	         case 3:
	             System.out.println("Please enter the new biology class of the animal.");
	             String newBelongClass = input.getName();
	             Catalog.get(position).BelongClass = newBelongClass;
	             System.out.println("Successfully edited!");
	             break;
	         case 4:
	             System.out.println("Please enter the new average weight of the animal.");
	             double newWeight = input.inputValidDouble();
	             Catalog.get(position).weight = newWeight;
	             System.out.println("Successfully edited!");
	             break;
	         case 5:
	             System.out.println("Please enter the new maximum age of the animal.");
	             double newAge = input.inputValidDouble();
	             Catalog.get(position).age = newAge;
	             System.out.println("Successfully edited!");
	             break;
	         case 6:
	             returnToMenu = true;
	             break;
			 }
		}
			
		}else {
			System.out.println("Your animal has NOT been found. If your animal doesn't exist, you can select option number 2.");
		}
		
		
	}
}
