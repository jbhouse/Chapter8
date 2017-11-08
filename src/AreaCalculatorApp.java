
public class AreaCalculatorApp {

	public static void main(String[] args) {
        System.out.println("Welcome to the Area Calculator");
        System.out.println();
		MyConsole consoleInstance = new MyConsole();
        Boolean cont = true;
        while (cont) {
        	String typeOfObject = consoleInstance.getString("Calculate area of a circle, square, or rectangle? (c/s/r): ");
        	switch(typeOfObject) {
        	case "c":
        		Circle newCircle = new Circle(MyConsole.getInt("Enter the circle's desired radius: "));
        		System.out.println("The area of the circle you entered is "+newCircle.getArea());
        		break;
        	case "r":
        		int width = MyConsole.getInt("Enter the rectangles desired width: ");
        		int height = MyConsole.getInt("Enter the rectangles desired height: ");
        		Rectangle newRectangle = new Rectangle(width, height);
        		System.out.println("The area of the rectangle you entered was "+newRectangle.getArea());
        		break;
        	case "s":
        		int squareSide = MyConsole.getInt("Enter the squares desired width: ");
        		Square newSquare = new Square(squareSide);
        		System.out.println("The area of the square you entered is: "+newSquare.getArea());
        		break;
        	}
        	System.out.println();
            cont = consoleInstance.userWantsToContinue("Continue? (y/n): ");
            System.out.println();
        }
        System.out.println("Bye - Come back soon!");
	}

}
