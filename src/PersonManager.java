
public class PersonManager {

	public static void main(String[] args) {
        System.out.println("Welcome to the Person Manager");
        System.out.println();
		MyConsole consoleInstance = new MyConsole();
        Boolean cont = true;
        while (cont) {
        	String personType = consoleInstance.createUserOrCustomer("Create customer or employee? (c/e): ");
        	if (personType.equals("c")) {
				Customer newCustomer = new Customer();
				newCustomer.setFirstName(Console.getString("First Name: "));
				newCustomer.setLastName(Console.getString("Last Name: "));
				newCustomer.setCustomerNumber(Console.getString("Customer Number: "));
				System.out.println();
				newCustomer.display();
			} else if(personType.equals("e")) {
				Employee newEmployee = new Employee();
				newEmployee.setFirstName(Console.getString("First Name: "));
				newEmployee.setLastName(Console.getString("Last Name: "));
				newEmployee.setSSN(Console.getString("SSN: "));
				System.out.println();
				newEmployee.display();
			}
        	System.out.println();
            cont = consoleInstance.userWantsToContinue("Continue? (y/n): ");
            System.out.println();
        }
        System.out.println("Bye - Come back soon!");

	}

}
