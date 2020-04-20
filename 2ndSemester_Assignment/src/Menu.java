import java.io.*; 
import java.util.*;

//creating the menu of the application
public class Menu implements java.io.Serializable {
	
	//initiation of everything
	static String filename = "file.ser"; 
	static ArrayList<Animal> Catalog = new ArrayList<Animal>(); //creating the array

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.printHeader();
		menu.printMenu();
		userInput myinput = new userInput(); //creating an object of userInput
		//reading the data so the compiler stays updated and doesn't overwrite the older data with new ones when option 2 is called first
		LoadingProgress();
		myinput.input(); // calling input
		   
	}
	
    public void printHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|        Welcome  to Our            |");
        System.out.println("|        ZOO Application            |");
        System.out.println("+-----------------------------------+");
    }

    public void printMenu() {
    	System.out.println("Please make a selection");
        System.out.println("1) Show all available animals.");
        System.out.println("2) Add a new animal.");
        System.out.println("3) Search an animal by name.");
        System.out.println("4) Search an animal by id.");
        System.out.println("5) Edit an animal by id.");
        System.out.println("6) Delete an animal by id.");
        System.out.println("7) Exit");
    }
    
    public static  void SavingProgress() {
        // Serialization  
		try
		{    
			//Saving of object in a file 
			FileOutputStream file = new FileOutputStream(filename); 
			ObjectOutputStream out = new ObjectOutputStream(file); 

			// Method for serialization of object 
			out.writeObject(Catalog); 

			out.close(); 
			file.close(); 

			System.out.println("Object has been serialized"); 

		} catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 

    }
    
    public static void LoadingProgress() {
   	 // Deserialization  
		 try
		 {    
			 // Reading the object from a file 
			 FileInputStream file = new FileInputStream(filename); 
			 ObjectInputStream in = new ObjectInputStream(file); 
			 // Method for deserialization of object 
			 Catalog = (ArrayList)in.readObject(); 
			 System.out.println("File has been loaded ");

			 in.close();
			 }
		  catch(IOException ex) 
			 { 
				 System.out.println("IOException is caught"); 
			 } 
	        catch(ClassNotFoundException ex) 
	        { 
	            System.out.println("ClassNotFoundException is caught"); 
	        } 

    	
    }
    

}
