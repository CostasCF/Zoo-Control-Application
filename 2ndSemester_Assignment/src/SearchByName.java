
public class SearchByName extends Menu {
	
	UserDataInput myinput = new UserDataInput();
	
	void searchingbyName() {
		System.out.println("Enter the name of the animal you want to search for.");
		String lead = myinput.inputValidString(); //this is a serialized search
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
			Catalog.get(position).printingArrayObjects();
		}else {
			System.out.println("Your animal has NOT been found. If your animal doesn't exist, you can select option number 2.");
		}
	}
		
	

}
