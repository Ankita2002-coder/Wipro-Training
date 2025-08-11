package Day2;
import java.util.Arrays;

	public class DeepToStringExample {
	    public static void main(String[] args) {
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        // Prints array reference instead of actual content
	        System.out.println("Using toString(): " + Arrays.toString(matrix));

	        // Correctly prints nested array elements
	        System.out.println("Using deepToString(): " + Arrays.deepToString(matrix));

	        // Also prints reference (same as toString)
	        System.out.println(matrix);
	    }
	}

