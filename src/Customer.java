
public class Customer extends People {

	private String CustomerNumber;

	Customer(){}
	
	public String getCustomerNumber() {
		return CustomerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		CustomerNumber = customerNumber;
	}
	
	public void display() {
		System.out.println("You entered a new Customer:");
		System.out.println("Name: "+this.getFullName());
		System.out.println("Customer Number: "+this.getCustomerNumber());
	}
	
}
