import java.util.Scanner;
import java.util.InputMismatchException;

public class userInput {
	
	
	public static int  inputValidation() { 
        int num;
        while(true) {
    		Scanner myInput = new Scanner(System.in); //creating a Scanner Object
    		System.out.println("Enter an option");
            try {
                num = myInput.nextInt();
        		System.out.println("Your option has been entered!Thank you!");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number ranging from 1 to 7!");
            }
        }
        return num;
    }

	
	
	public void input()  {

		int userAnswer = userInput.inputValidation();

		while (userAnswer !=7) {
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
        	//mymenu.searchByID();
            break;
        case 5:
        	//mymenu.editByID();
            break;
        case 6:
        	//mymenu.deleteByID();
            break;
			}
		userAnswer = userInput.inputValidation();
		}
		if (userAnswer == 7) {
			System.out.println("Program stopped");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

