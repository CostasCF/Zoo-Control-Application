import java.util.ArrayList;

public class showAnimals extends addAnimal {
	
	
	void Show() {
		int Arraysize = Catalog.size();
		int i = 0;
		while (i < Arraysize) {
			Catalog.get(i).PrintA();
			i++;
		}
	}
	
	void PrintA() {
		System.out.println("|-----------------------------------------|");
		System.out.println("| ID of the animal:" + id);
		System.out.println("| Name:" + name);
		System.out.println("| Biology Class:" + BelongClass );
		System.out.println("| Avg weight:" + weight );
		System.out.println("| Max life span:" + age);
		System.out.println("|-----------------------------------------|");
	}
	
	

	
	
}
