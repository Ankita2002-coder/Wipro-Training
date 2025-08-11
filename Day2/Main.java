package Day2;

public class Main {

	    public static void main(String[] args) {
	        int s = 0;  // Initialize sum variable

	        // Loop from 1 to 40
	        for (int i = 1; i <= 40; i++) {
	            // Check if the number is even
	            if (i % 2 == 0) {
	                s += i;  // Add even number to the sum
	            }
	        }

	        // Print the total sum
	        System.out.println(s);
	    }
	}



