import java.util.ArrayList;
import java.io.*; 

public class ShowAnimals extends AddAnimal implements java.io.Serializable {

	
	public void printingArrayList() {
		LoadingProgress();
		int Arraysize = Catalog.size();
		int i = 0;
		while (i < Arraysize) {
			Catalog.get(i).printingArrayObjects();
			i++; }
	}
	
	public void printingArrayObjects() {
		System.out.println("-----------------------------------------");
		System.out.println(" 1. ID of the animal:" + id);               
		System.out.println(" 2. Name:" + name);
		System.out.println(" 3. Biology Class:" + BelongClass );
		System.out.println(" 4. Avg weight:"+ weight + "kg");
		System.out.println(" 5. Max life span:" + age);
		System.out.println("-----------------------------------------");
	}

}

