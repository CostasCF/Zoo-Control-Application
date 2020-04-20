import java.util.ArrayList;
import java.io.*; 

public class showAnimals extends addAnimal{

	
	public void Show() {
		 // Deserialization 
		 try
		 {    
			 // Reading the object from a file 
			 FileInputStream file = new FileInputStream(filename); 
			 ObjectInputStream in = new ObjectInputStream(file); 

			 // Method for deserialization of object 
			 Catalog = (ArrayList)in.readObject(); 


			 System.out.println("Object has been deserialized ");
			 int Arraysize = Catalog.size();
				int i = 0;
				while (i < Arraysize) {
					Catalog.get(i).PrintA();
					i++; }
			 in.close(); 
			 file.close(); 

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
	
	public void PrintA() {
		System.out.println("-----------------------------------------");
		System.out.println(" 1. ID of the animal:" + id);               
		System.out.println(" 2. Name:" + name);
		System.out.println(" 3. Biology Class:" + BelongClass );
		System.out.println(" 4. Avg weight:"+ weight + "kg");
		System.out.println(" 5. Max life span:" + age);
		System.out.println("-----------------------------------------");
	}

}

