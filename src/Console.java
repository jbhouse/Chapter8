import java.util.Scanner;

public class Console {

	private static Scanner sc = new Scanner(System.in);
	
	public String getString(String prompt) {
		System.out.print(prompt);
		String s = sc.next();
		sc.nextLine();
		return s;
	}
	
	public Boolean promptToContinue(String prompt) {
		while (true) {
			System.out.println(prompt);
			String userInput = sc.nextLine();
			if (userInput.equalsIgnoreCase("y")||userInput.isEmpty()) {
				return true;
			} else if (userInput.equalsIgnoreCase("n")) {
				return false;
			} else {
				System.out.println("Error! that input was invalid.");
				continue;
			}
		}
	}
	
	public static int getInt(String prompt) {
		int i = 0;
		boolean isValid = false;
		while(!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer. Try again.");
				sc.next();
				continue;
			}
		}
		return i;
	}
	
	public static int getInt(String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while(!isValid) {
			i = getInt(prompt);
			if (i<=min) {
				System.out.println("Error! Number must be greater than "+min+".");
			} else if (i>=max) {
				System.out.println("Error! Number must be less than "+max+".");
			} else {
				isValid = true;
			}
			sc.nextLine();
		}
		return i;
	}
	
	public static Boolean isEven(int userInput) {
		if (userInput%2==0) {
			return true;
		}
		return false;
	}
	
}
