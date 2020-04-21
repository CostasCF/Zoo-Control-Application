import java.io.*; 
import java.util.*;

//creating the menu of the application
public class Menu extends UserDataInput implements java.io.Serializable { //inherits from UserDataInput all the input's methods
	
	// ArrayList's variables initiation
	int id;
	String name;
	String BelongClass;
	double weight;
	double age; 

	static String filename = "file.ser";  //creating the data file
	static ArrayList<AnimalArray> Catalog = new ArrayList<AnimalArray>(); //creating the ArrayList

	public static void main(String[] args) {
		printHeader();
		printMenu();
		structure(); // calling structure method which includes user's input
		   
	}
	
    public static void printHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|        Welcome  to Our            |");
        System.out.println("|        ZOO Application            |");
        System.out.println("+-----------------------------------+");
    }

    public static void printMenu() {
    	System.out.println("Please make a selection");
        System.out.println("1) Show all available animals.");
        System.out.println("2) Add a new animal.");
        System.out.println("3) Search an animal by name.");
        System.out.println("4) Search an animal by id.");
        System.out.println("5) Edit an animal by id.");
        System.out.println("6) Delete an animal by id.");
        System.out.println("7) Exit");
    } 
    
    public static void SavingProgress() {
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

			System.out.println("File has been saved."); 

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
			 System.out.println("File has been loaded.");

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
