
public class Employee extends People {

	private String SSN;
	
	Employee(){}

	public String getSSN() {
		return "xxx-xx-"+SSN.substring(7);
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	public void display() {
		System.out.println("You entered a new Employee:");
		System.out.println("Name: "+this.getFullName());
		System.out.println("Customer Number: "+this.getSSN());
	}
	
}
