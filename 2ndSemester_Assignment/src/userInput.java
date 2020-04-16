import java.util.Scanner;
import java.util.InputMismatchException;

public class userInput {
	userInput myUserInputObj = new userInput(); //creating an object that belongs in this class
	public int inputValidation() { 
        int num;
		Scanner myInput = new Scanner(System.in); //creating a Scanner Object
        while(true) {
    		System.out.println("Enter an option");
            try {
                num = myInput.nextInt();
        		System.out.println("Your option has been entered!Thank you!");
        		myInput.close(); //closes scanner
                break;
            } catch (InputMismatchException e) {
                System.out.println("Λαθος τύπος δεδομένων, πληκτρολογήστε ακέραιο αριθμό");
            }
        }
        return num;
    }

	public void input()  {

		int userAnswer = myUserInputObj.inputValidation();

	   // Menu mymenu = new Menu(); //creating a Menu's class object
		while (userAnswer != 7){
		switch (userAnswer) {
        case 1:
        	//mymenu.showAnimals();
            break;
        case 2:
        	//mymenu.addAnimal();
            break;
        case 3:
        	//mymenu.searchByName();
            break;
        case 4:
        	//mymenu.searchByCode();
            break;
        case 5:
        	//mymenu.editByCode();
            break;
        case 6:
        	//mymenu.deleteAnimalByCode();
            break;
            }
		userAnswer = myUserInputObj.inputValidation();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
