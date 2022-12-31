import java.util.Scanner;

public class Objective4Lab1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("what is your first name?");
		String fName = keyboard.nextLine();

		System.out.println("what is your last name?");
		String lName = keyboard.nextLine();
		
		System.out.println("what is your favorite animal?");
		String fAnimal = keyboard.nextLine();
		
		System.out.println("what is your favorite food?");
		String fFood = keyboard.nextLine();
		
		System.out.println("what is your favorite song?");
		String fSong = keyboard.nextLine();
		

		System.out.println("My name is" + " " + fName + " " + lName + ".");
		System.out.println("My favorite animal is the" + " " + fAnimal + ".");
		System.out.println("My favorite food is" + " " + fFood+".");
		System.out.println("My favorite song is" + " " + fSong+".");
		

		

	}	
}