package Day1;

public class Maths {
	
	    public static void main(String[] args) {
	        if (args.length < 2) {
	            System.out.println("Please provide two numbers as command-line arguments.");
	            return;
	        }

	        // Convert command-line arguments to numbers
	        double num1 = Double.parseDouble(args[0]);
	        double num2 = Double.parseDouble(args[1]);

	        // Perform operations
	        double addition = num1 + num2;
	        double subtraction = num1 - num2;
	        double multiplication = num1 * num2;

	        System.out.println("Addition is: " + addition);
	        System.out.println("Subtraction is: " + subtraction);
	        System.out.println("Multiplication is: " + multiplication);

	        // Handle division carefully
	        if (num2 != 0) {
	            double division = num1 / num2;
	            System.out.println("Division is: " + division);
	        } else {
	            System.out.println("Division is: Cannot divide by zero");
	        }
	    }
	}



