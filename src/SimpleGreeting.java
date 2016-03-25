//Import library to use scanner object 

import java.util.Scanner;

//Class to get know the user 

public class SimpleGreeting {
	
	static Scanner scanner = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		//Declare local variables
		String name;
		//Output a welcome message to user
		System.out.println("Hello, Welcome!");
		//Request the user's name
		System.out.println("Could I please get your name? ");
		//Set the captured name to a local String variable, name
		name = scanner.nextLine();
		
		System.out.println("\nWell " + name + ", it nice meeting you.");
		

	}

}




 