package Day1;

public class Circle {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the radius ");
            return;
        }

        try {
            double r = Double.parseDouble(args[0]);
            double area = Math.PI * r * r;
            System.out.println("Area: " + area);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value for the radius.");
        }
    }
}
