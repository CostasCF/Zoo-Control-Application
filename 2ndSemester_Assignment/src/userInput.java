import java.util.Scanner;

public class userInput {
	
	public void input()  {
		Scanner myInput = new Scanner(System.in); //create a Scanner Object
		System.out.println("Enter an option");
		String userAnswer = myInput.nextLine();
		System.out.println("Your option has been entered! Not shut the fuck up and close this application already! Thank you!");
		myInput.close();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
