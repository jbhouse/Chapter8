public class NumberCheckerApp {

	public static void main(String[] args) {
		
        System.out.println("Welcome to the Even/Odd checker");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println();
		MyConsole consoleInstance = new MyConsole();
        Boolean cont = true;
        while (cont) {
        	int userInput = Console.getInt("Enter an Integer: ");
        	if (Console.isEven(userInput)) {
				System.out.println("The number "+userInput+" is even.");
			} else {
				System.out.println("The number "+userInput+" is odd.");
			}
        	System.out.println();
            cont = consoleInstance.userWantsToContinue("Continue? (y/n): ");
            System.out.println();
        }
        System.out.println("Bye - Come back soon!");
	}

}
