import java.util.InputMismatchException;
import java.util.Scanner;

public class AnimalValidationandInput {
	// Checks if the user input is type-double
    public double inputValidDouble() {
        double num;
        while(true) {
            Scanner input = new Scanner(System.in);
            try {
                num = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong data type, please try again.");
            }
        }
        return num;
    }

    // Checks if the user input is type-int
    public int inputValidInt() { //
        int num;
        while(true) {
            Scanner input = new Scanner(System.in);
            try {
                num = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong data type, please try again.");
            }
        }
        return num;
    }
}
