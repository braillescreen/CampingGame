//Camping Game
//
//Patrick Wilson

import java.util.Scanner;

public class CampingGame {
	public static void main(String[] args) {
		String firstletter = ask("Suppose that this is the first letter of your name, or some other first letter. Please enter it here so that you can quiz the users to see if they can come or not.");
		String current = "";
		while (!current.contains("quit")) {
			current = ask("Enter a guess.");
			if (!current.contains("quit")) {
				if (!current.startsWith(firstletter)) System.out.println("Uh-oh, you can't go to the camp!");
				else System.out.println("You can go to the camp with us.");
			}
		}
		System.out.println("Thank you for playing the game!");
	}
	
	public static String ask(String what) {
		Scanner key = new Scanner(System.in);
		System.out.println(what);
		String tempText = key.nextLine();
		return tempText;
	}
}