import java.util.Scanner;

public class userInput {
	
	public void input()  {
		Scanner myInput = new Scanner(System.in); //create a Scanner Object
		System.out.println("Enter an option");
		String userAnswer = myInput.nextLine();
		System.out.println("Your option has been entered!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
