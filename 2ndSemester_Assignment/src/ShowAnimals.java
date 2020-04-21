import java.util.ArrayList;
import java.io.*; 

public class ShowAnimals extends Menu implements java.io.Serializable { 

	
	public void printingArrayList() {
		LoadingProgress();
		int Arraysize = Catalog.size();
		int i = 0;
		while (i < Arraysize) {
			Catalog.get(i).printingArrayObjects();
			i++; }
	}

}

