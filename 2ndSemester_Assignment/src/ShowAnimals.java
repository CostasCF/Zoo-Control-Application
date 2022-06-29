public class ShowAnimals extends Animals implements java.io.Serializable {

	/**
	 * Prints the Catalog which contains the animals
	 */
	public void printCatalog() {
		OpenData();
		int Arraysize = Catalog.size();
		int i = 0;
		while (i < Arraysize) {
			Catalog.get(i).printAnimalElements();
			i++; }
	}

}

