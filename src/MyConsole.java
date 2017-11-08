import java.util.Scanner;

public class MyConsole extends Console {
	
	private static Scanner sc = new Scanner(System.in);

	MyConsole(){}
	
	public static int getInt(String prompt) {
		while (true) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				return sc.nextInt();
			} else {
				System.out.println("That's not a valid Integer. Try again \n");
				sc.next();
				continue;
			}
		}
	}
	
	public String getString(String prompt) {
		while (true) {
			System.out.print(prompt);
			String s = sc.next();
			if (!s.isEmpty()) {
				return s;
			} else {
				System.out.println("Please give me a string");
				continue;
			}
		}
	}
	
	public String createUserOrCustomer(String prompt) {
		while (true) {
			String input = this.getString(prompt);
			if (input.equalsIgnoreCase("c")) {
				return input;
			} else if (input.equalsIgnoreCase("e")) {
				return input;
			} else {
				System.out.println("Error! Entry must be \'c\' to continue, or \'e\'. Try again.");
				continue;
			}
		}
	}
	
	public Boolean userWantsToContinue(String prompt) {
		while (true) {
			String input = this.getString(prompt);
			if (input.equalsIgnoreCase("y")) {
				return true;
			} else if (input.equalsIgnoreCase("n")) {
				return false;
			} else {
				System.out.println("Please type either \'y\' to continue, or \'n\' to exit.");
				continue;
			}
		}
		
	}
	
}
