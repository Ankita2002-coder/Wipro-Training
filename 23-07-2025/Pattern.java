package Day2;

public class Pattern {

	    public static void main(String[] args) {
	        int n = 1;

	        while (n <= 5) {           // number of rows
	            int x = 1;

	            while (x <= n) {       // prints stars 
	                System.out.print("*");
	                x++;
	            }

	            System.out.println();  // next line
	            n++;
	        }
	    }
	}



